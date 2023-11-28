import java.util.Arrays;
import java.util.Date;
public class Room {
    static int nbD;
    private int Rnum;
    private Categorie c;
    private int state;

    public Room(int rnum,Categorie c) {
        Rnum = rnum;
        nbD=0;
        this.c=c;
        state=0;
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

    public Categorie getC() {return c;}

    public void setC(Categorie c) {this.c = c;}

    public static int getNbD() {return nbD;}

    public static void setNbD(int nbD) {Room.nbD = nbD;}

    public Date[] getD() {return D;}

    @Override
    public String toString() {
        return "Room{" +
                "Rnum=" + Rnum +
                ", c=" + c +
                ", D=" + Arrays.toString(D) +
                '}';
    }
    public void addDate(Date d){
        D[nbD-1]=d;
        nbD++;
    }
}
