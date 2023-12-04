import java.util.Date;
public class Reservation {
    private clientResponsable Resp;
    private double numRes;
    private Date dArrivee;
    private Date dDepart;
    private int period;
    public Reservation(double n,clientResponsable resp,Date d1, Date d2,int p) {
        numRes=n;
        Resp = resp;
        dArrivee=d1;
        dDepart=d2;
        period=p;
    }

    public clientResponsable getResp() {
        return Resp;
    }

    public void setResp(clientResponsable resp) {
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
