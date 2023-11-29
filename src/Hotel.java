import java.util.Arrays;

public class Hotel{
    static int nbCatg;
    private String name;
    Categorie C[];
    String heureOverture;
    String heureFermeture;
    String address;
    Reservation [] Res;
    static int nbRes;

    public Hotel(String name,String hOuv, String hFerm, String address)
    {
        this.name = name;
        this.address = address;
        this.heureOverture = hOuv;
        this.heureFermeture = hFerm;
        C = new Categorie[100];
        Res=new Reservation[200];
        int nbRes = 0;
        nbCatg=0;
        }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public void setAddress(java.lang.String address) {
        this.address = address;
    }

    public static int getNbCatg() {
        return nbCatg;
    }

    public static void setNbCatg(int nbCatg) {
        Hotel.nbCatg = nbCatg;
    }

    public java.lang.String getName() {
        return name;
    }


    public String getHeureOvertureebut() {return heureOverture;}

    public void setHeureOverture(String heureDebut) {this.heureOverture = heureDebut;}

    public String getHeureFermeture() {return heureFermeture;}

    public void setHeureFermeture(String heureFermeture) {this.heureFermeture = heureFermeture;}

    public java.lang.String getAddress() {
        return address;
    }

    public void addCategory(Categorie c) {
        if(exist(c)){
            //exception
        }
        else{
            this.C[nbCatg]=c;
            nbCatg++;
        }
    }

        @Override
        public String toString () {
            return "Hotel{" +
                    "name='" + name + '\'' +
                    ", C=" + Arrays.toString(C) +
                    ", Heure d'ouverture=" + heureOverture +
                    ", Heure de fermeture=" + heureFermeture+
                    ", address='" + address + '\'' +
                    '}';
        }
        boolean exist(Categorie c){
            int i=0;
            while( i<nbCatg && !( C[i].getCname().equalsIgnoreCase(c.getCname()) ) ){
                i++;
            }
            return i<nbCatg;
        }
}