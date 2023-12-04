import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
public class datesRange {
    public List<LocalDate> DatesInBetween(LocalDate d1,LocalDate d2){
        List<LocalDate> l=new ArrayList<>();
        l.add(d1);
        while(d1.isEqual(d2)){
            d1=d1.plusDays(1);
            l.add(d1);
        }
        return l;
    }

}
