import java.util.Date;

public class clientResponsable extends Client{
    private Reservation[] Res;
    private int nbr;

    public clientResponsable(String cin, String nom, String prenom, Address add, String numTel) {
        super(cin, nom, prenom, add, numTel);
        Res=new Reservation[10];
        nbr=0;
    }

    public Reservation[] getRes() {
        return Res;
    }

    public void setRes(Reservation[] res) {
        Res = res;
    }

    public int getNbr() {
        return nbr;
    }

    public void setNbr(int nbr) {
        this.nbr = nbr;
    }

    public void addReservation(Reservation r){
        if(existR(r)){
            //exception
        }
        else{
            Res[nbr]=r;
            nbr++;
        }
    }
    public boolean existR(Reservation r){
        int i=0;
        while((i < nbr) && !(r.getNumRes() == Res[i].getNumRes())){
            i++;
        }
        return i<nbr;
    }
}
