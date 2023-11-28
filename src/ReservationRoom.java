import java.util.Date;

public class ReservationRoom extends Reservation{
    private Room R;
    public ReservationRoom(double n, Client resp, Date d1, Date d2, int p, Room r) {
        super(n, resp, d1, d2, p);
        this.R=r;
    }
    public void dates(Date d1,Date d2){
        
    }
    boolean exist(Date d){
        int i=0;
        while((i < R.getNbD()) && (R.getD()[i].compareTo(d) != 0)){
            i++;
        }
        return i<R.getNbD();
    }
    public void addRes(){
        if(exist(getdArrivee())){
            //exception
        }
        if (super.getPeriod()==1){
                R.addDate(this.getdArrivee());

        }
        else{
            if (exist(getdArrivee()) || exist(getdDepart())){
                //exception
            }
            else{
                R.addDate(this.getdArrivee());
                R.addDate(this.getdDepart());
            }
        }
    }

}
