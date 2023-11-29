public class clientResponsable extends Client{
    private Room[] r;
    static int nbr;

    public clientResponsable(String cin, String nom, String prenom, Address add, String numTel) {
        super(cin, nom, prenom, add, numTel);
        r=new Room[10];
        nbr=0;
    }
}
