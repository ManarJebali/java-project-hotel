import java.util.Arrays;
import java.util.Date;
public class Room {
    private int Rnum;
    private Categorie c;
    private int state;
    private int nbLits;
    private Date[] D;
    static int nbD;

    public Room(int rnum,Categorie c,int nbLits) {
        Rnum = rnum;
        this.c=c;
        state=0;
        this.nbLits=nbLits;
        D=new Date[100];
        nbD=0;
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
}
