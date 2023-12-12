import java.util.Date;

public class clientResponsable extends Client{
    private Reservation[] Res;
    private int nbr;
    private Room[] rooms;

    public clientResponsable(String cin, String nom, String prenom, Address add, String numTel) {
        super(cin, nom, prenom, add, numTel);
        Res=new Reservation[10];
        nbr=0;
        rooms=new Room[10];
    }

    public Reservation[] getRes() {return Res;}

    public void setRes(Reservation[] res) {Res = res;}

    public int getNbr() {return nbr;}

    public void setNbr(int nbr) {this.nbr = nbr;}

    public Room[] getRooms() {
        return rooms;
    }

    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }

    public void addReservation(Reservation r){
            Res[nbr]=r;
            nbr++;
    }
    public boolean existR(Reservation r){
        int i=0;
        while((i < nbr) && !(r.getNumRes() == Res[i].getNumRes())){
            i++;
        }
        return i<nbr;
    }
    public void addRoom(Room r) {
            this.rooms[nbr]=r;
    }
    boolean exist(Room r){
        int i=0;
        while( i<nbr && rooms[i].getRnum()!=r.getRnum() ){
            i++;
        }
        return i<nbr;
    }
}
