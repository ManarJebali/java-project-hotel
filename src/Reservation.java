import java.util.Date;
public class Reservation {
    private Client Resp;
    private double numRes;
    private Date dArrivee;
    private Date dDepart;
    private int period;
    public Reservation(double n,Client resp,Date d1, Date d2,int p) {
        numRes=n;
        Resp = resp;
        dArrivee=d1;
        dDepart=d2;
        period=p;
    }

    public Client getResp() {
        return Resp;
    }

    public void setResp(Client resp) {
        Resp = resp;
    }

    public double getNumRes() {
        return numRes;
    }

    public void setNumRes(double numRes) {
        this.numRes = numRes;
    }

    public Date getdArrivee() {
        return dArrivee;
    }

    public void setdArrivee(Date dArrivee) {
        this.dArrivee = dArrivee;
    }

    public Date getdDepart() {
        return dDepart;
    }

    public void setdDepart(Date dDepart) {
        this.dDepart = dDepart;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }
}
