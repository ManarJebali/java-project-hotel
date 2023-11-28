import java.util.Arrays;

public class Categorie {
    static int nbR;
    private int nbEq;
    private String Cname;
    private double priceR;
    String[] equipments;
    Room[] R;

    public Categorie(String cname, double pricer, int nbeq, String[] equipments) {
        Cname = cname;
        priceR = pricer;
        R = new Room[100];
        nbR = 0;
        nbEq = nbeq;
        equipments = new String[nbEq];
        for (int i = 0; i < nbeq; i++) {
            assert this.equipments != null;
            //exception if nbeq==0
            this.equipments[i] = equipments[i];
        }
    }

    public String[] getEquipments() {
        return equipments;
    }

    public void setNbEq(int nbEq) {
        this.nbEq = nbEq;
    }

    public static int getNbR(){
        return nbR;
    }

    public static void setNbR(int nbR) {
        Categorie.nbR = nbR;
    }

    public String getCname() {
        return Cname;
    }

    public int getNbEq() {
        return nbEq;
    }


    public double getPriceR() {
        return priceR;
    }

    public void setPriceR(double priceR) {
        this.priceR = priceR;
    }

    public void setCname(String cname) {
        Cname = cname;
    }

    @Override
    public String toString() {
        return "Categorie{" +
                "Name=" + Cname+
                ", nbEquipments=" + nbEq+ '\'' +
                ", Rooms' Price=" + priceR +
                ", Rooms Equipments=" + Arrays.toString(equipments) +
                ", Rooms=" + Arrays.toString(R) +
                '}';
    }

    public void addRoom(Room r){
        if (nbEq==equipments.length){
            //exception
        }
        if (exist(r)){
            //exception
        }
        else{
            this.R[nbR]=r;
            nbR++;
        }
    }
    boolean exist(Room r){
        int i=0;
        while( i<nbR && R[i].getRnum()!=r.getRnum() ){
            i++;
        }
        return i<nbR;
    }
    public void removeEquipment(String eq){
        if (nbEq==1){
            equipments=null;
            nbEq=0;
        }
        if(!exist(eq)){
            //exception
        }
        else{
        int i=0;
        while(i<nbEq && equipments[i].compareToIgnoreCase(eq)!=0){i++;}
        if (i==nbEq){nbEq--;}
        else{
            for(int j=i;j<nbEq-1;j++){
                equipments[j]=equipments[j+1];
            }
            nbEq--;
        }
        }
    }
    public void addEquipment(String eq){
        if (nbEq==equipments.length){
            //exception
        }
        if (exist(eq)){
            //exception
        }
        else{
            this.equipments[nbEq]=eq;
            nbEq++;
        }
    }
    boolean exist(String eq){
        int i=0;
        while( i<nbEq && equipments[i].compareToIgnoreCase(eq)!=0){
            i++;
        }
        return i<nbEq;
    }
}

