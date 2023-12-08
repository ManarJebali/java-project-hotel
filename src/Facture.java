import java.util.Date;

public class Facture {
    private int numF;
    private Date dF;
    private clientResponsable Cr;
    private double remise;

    public Facture(int numF, Date dF, clientResponsable cr, double remise){
        this.numF = numF;
        this.dF = dF;
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

    public double calculFacture(){
        double s=0;
        //parcours des chambres
        for(int i=0;i<Cr.getNbr();i++){
            Room room=Cr.getRooms()[i];
            //parcours des services
            for(int j=0;j<room.getNbCons();j++){
                Consommation service=room.getCons()[j];
                s+=service.getPrice();
            }
        }
        return s;
    }

    public void displayBill(){

    }
}
