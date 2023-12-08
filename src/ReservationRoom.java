import java.time.LocalDate;
import java.util.*;
import java.time.Instant;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.ListIterator;

public class ReservationRoom extends Reservation{
    private Room R;
    private clientResponsable C;
    public ReservationRoom(double n, clientResponsable resp, Date d1, Date d2, int p, Room r) {
        super(n, resp, d1, d2, p);
        this.R=r;
    }
    public List<LocalDate> dateInBetween(Date d1,Date d2){
        // Convert Date to LocalDate
        LocalDate ld1 = d1.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate ld2 = d2.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        List<LocalDate> l=new ArrayList<>();
        l.add(ld1);
        while(ld1.isEqual(ld2)){
            ld1=ld1.plusDays(1);
            l.add(ld1);
        }
        return l;
        }
    public void addRes(Room R){
        if(getPeriod()==1){
            if(R.existD(getdArrivee())){
                //exception
            }
            else{
            R.addDate(this.getdArrivee());
            C.addRoom(R);
            C.addReservation(this);
        }}
        else{
            //les dates entre dArrivee et dDepart
            List<LocalDate> l=dateInBetween(getdArrivee(),getdDepart());
            //pour parcourir l
            ListIterator<LocalDate> listIterator=l.listIterator();

            Date date=getdArrivee();
            while(listIterator.hasNext() && !R.existD(date)){
                LocalDate d=listIterator.next();
                // Convert LocalDate to Date
                date = Date.from(d.atStartOfDay(ZoneId.systemDefault()).toInstant());
                R.addDate(date);
            }
            if(listIterator.hasNext()){
                //exception chambre n'est pas disponible
                return;
            }
            //ajout de reservation a la table de res du client responsable
            C.addReservation(this);
            C.addRoom(this.R);

            //ajout des dates
            R.addDate(getdArrivee());
            while(listIterator.hasNext()){
                // Convert LocalDate to Date
                Date d = Date.from(listIterator.next().atStartOfDay(ZoneId.systemDefault()).toInstant());
                R.addDate(d);
            }
            }
        }
}


