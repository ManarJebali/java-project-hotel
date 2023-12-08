import java.util.Arrays;
import java.util.Date;
public class Room {
    private int Rnum;
    private Categorie c;
    private int state;
    private int nbLits;
    private Date[] D;
    private int nbD;
    private Consommation Cons[];
    private int nbCons;

    public Room(int rnum,Categorie c,int nbLits) {
        Rnum = rnum;
        this.c=c;
        state=0;
        this.nbLits=nbLits;
        D=new Date[100];
        nbD=0;
        Cons=new Consommation[50];
        nbCons=0;
    }

    public int getRnum() {
        return Rnum;
    }

    public void setRnum(int rnum) {
        Rnum = rnum;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getNbLits() {
        return nbLits;
    }

    public void setNbLits(int nbLits) {
        this.nbLits = nbLits;
    }

    public Categorie getC() {return c;}

    public void setC(Categorie c) {this.c = c;}

    public Date[] getD() {
        return D;
    }

    public Consommation[] getCons() {
        return Cons;
    }


    public int getNbD() {
        return nbD;
    }

    public void setNbD(int nbD) {
        this.nbD = nbD;
    }

    public int getNbCons() {
        return nbCons;
    }

    public void setNbCons(int nbCons) {
        this.nbCons = nbCons;
    }

    @Override
    public String toString() {
        return "Room{" +
                "Num=" + Rnum +
                ", Categorie=" + c +
                ", Etat=" + state+
                '}';
    }
    public boolean existD(Date d){
        int i=0;
        while( i<nbD && !( d.equals(D[i]) ) ){
            i++;
        }
        return i<nbD;
    }
    public void addDate(Date d){
        D[nbD-1]=d;
        nbD++;
    }

    public void addCons(Consommation c){
        Cons[nbCons]=c;
        nbCons++;
    }
}
