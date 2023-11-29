import java.util.Date;

public class ReservationRoom extends Reservation{
    private Room R;
    public ReservationRoom(double n, Client resp, Date d1, Date d2, int p, Room r) {
        super(n, resp, d1, d2, p);
        this.R=r;
    }

    public void addRes(Room R){
        if(R.getState()==1){
            //exception
        }
        else{

        }
    }
}
