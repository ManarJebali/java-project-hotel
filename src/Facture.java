import java.util.Date;

public class Facture {
    private int numF;
    private Date dF;
    private Consommation [] cF;
    private clientResponsable Cr;
    private double remise;

    public Facture(int numF, Date dF, Consommation[] cF, clientResponsable cr, double remise){
        this.numF = numF;
        this.dF = dF;
        this.cF = cF;
        Cr = cr;
        this.remise = remise;
    }

    public int getNumF(){return numF;}

    public void setNumF(int numF) {
        this.numF = numF;
    }

    public Date getdF() {
        return dF;
    }

    public void setdF(Date dF) {
        this.dF = dF;
    }

    public Consommation[] getcF() {
        return cF;
    }

    public void setcF(Consommation[] cF) {
        this.cF = cF;
    }

    public clientResponsable getCr() {
        return Cr;
    }

    public void setCr(clientResponsable cr) {
        Cr = cr;
    }

    public double getRemise() {
        return remise;
    }

    public void setRemise(double remise) {
        this.remise = remise;
    }

    public void calculFacture(){
        double s=0;
        for(int i=0;i<Cr.getNbr();i++){

        }
    }
}
