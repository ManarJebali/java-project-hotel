import java.util.Arrays;

/*class  EquipmentExistException extends Exception{
    public EquipmentExistException(String message){
        super(message);
    }
}*/
public class Categorie {
    private int nbR;
    private int nbEq;
    private String Cname;
    private double priceR;
    String[] equipments;
    Room[] R ;

    public Categorie(String cname, double pricer, int nbeq, String[] equipments) {
        Cname = cname;
        priceR = pricer;
        nbR = 0;
        nbEq = nbeq;
        R = new Room[100];
        this.equipments = new String[10];
        if (nbEq!=0) {
            for (int i = 0; i < nbEq; i++) {
                //exception if nbeq==0
                equipments[i] = equipments[i];
            }
        }
    }

    public String[] getEquipments() {
        return equipments;
    }

    public void setNbEq(int nbEq) {
        this.nbEq = nbEq;
    }

    public int getNbR(){
        return nbR;
    }

    public void setNbR(int nbR) {this.nbR = nbR;}

    public String getCname() {return Cname;}

    public int getNbEq() {
        return nbEq;
    }


    public double getPriceR() {return priceR;}

    public void setPriceR(double priceR) {this.priceR = priceR;}

    public void setCname(String cname) {
        Cname = cname;}

    public Room[] getR() {
        return R;
    }

    public void setR(Room[] r) {
        R = r;
    }
    public void displayEquipments(){
        if (nbEq!=0) {
            for (int i = 0; i < nbEq; i++) {
                System.out.println(equipments[i]+" ") ;
            }
        }
    }
    public void displayRooms(){
        if (nbEq!=0) {
            for (int i = 0; i < nbR; i++) {
                System.out.println(R[i]+" ") ;
            }
        }
    }

    @Override
    public String toString() {
        return "Categorie{" +
                "Name=" + Cname+
                ", nbEquipments=" + nbEq+ '\'' +
                ", Rooms' Price=" + priceR +
                '}';
    }

    public void addRoom(Room r) throws RoomExistException{
        if (exist(r)){
            //exception
            throw new RoomExistException("Room Already Exists");
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

