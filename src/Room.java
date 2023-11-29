import java.util.Arrays;
import java.util.Date;
public class Room {
    private int Rnum;
    private Categorie c;
    private int state;
    private int nbLits;

    public Room(int rnum,Categorie c,int nbLits) {
        Rnum = rnum;
        this.c=c;
        state=0;
        this.nbLits=nbLits;
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


    @Override
    public String toString() {
        return "Room{" +
                "Num=" + Rnum +
                ", Categorie=" + c +
                ", Etat=" + state+
                '}';
    }
}
