import java.util.Date;
public class Consommation {
    private Room r;
    private Date date;
    private String heure;
    private int qte;
    private double price;

    public Consommation(Room r, Date date, String heure, int qte, double price) {
        this.r = r;
        this.date = date;
        this.heure = heure;
        this.qte = qte;
        this.price = price;
    }

    public Room getR() {
        return r;
    }

    public void setR(Room r) {
        this.r = r;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getHeure() {
        return heure;
    }

    public void setHeure(String heure) {
        this.heure = heure;
    }

    public int getQte() {
        return qte;
    }

    public void setQte(int qte) {
        this.qte = qte;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
