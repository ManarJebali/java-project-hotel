import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.ListIterator;
import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class ReservationCategorie extends Reservation {
    private Categorie cat;
    private clientResponsable Cr;

    public ReservationCategorie(double n, clientResponsable resp, Date d1, Date d2, int p, Categorie c) {
        super(n, resp, d1, d2, p);
        cat = c;
    }

    public List<LocalDate> dateInBetween(Date d1, Date d2) {
        // Convert Date to LocalDate
        LocalDate ld1 = d1.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate ld2 = d2.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        List<LocalDate> l = new ArrayList<>();
        l.add(ld1);
        while (ld1.isEqual(ld2)) {
            ld1 = ld1.plusDays(1);
            l.add(ld1);
        }
        return l;
    }

    public void addRes(Room R) {
        if (getPeriod() == 1) {
            for (int i = 0; i < cat.getNbR(); i++) {
                if (cat.getR()[i].existD(getdArrivee())) {
                    //exception
                } else {
                    cat.getR()[i].addDate(this.getdArrivee());
                }
            }
        } else {
            //les dates entre dArrivee et dDepart
            List<LocalDate> l=dateInBetween(getdArrivee(),getdDepart());
            //pour parcourir l
            ListIterator<LocalDate> listIterator=l.listIterator();

            Date date=getdArrivee();
            boolean v = false;
            int i = 0;
            while (i < cat.getNbR() && v == false) {

                while (listIterator.hasNext() && !cat.getR()[i].existD(date)) {
                    LocalDate d = listIterator.next();
                    // Convert LocalDate to Date
                    date = Date.from(d.atStartOfDay(ZoneId.systemDefault()).toInstant());
                    cat.getR()[i].addDate(date);
                }
                //v=true si chambre est disponible
                v = !(listIterator.hasNext());
            }
            if (v) {
                //ajout de reservation a la table de res du client responsable
                Cr.addReservation(this);
                cat.getR()[i].addDate(getdArrivee());
                while (listIterator.hasNext()) {
                    // Convert LocalDate to Date
                    Date d = Date.from(listIterator.next().atStartOfDay(ZoneId.systemDefault()).toInstant());
                    cat.getR()[i].addDate(d);
                }
            }

        }
    }
}
