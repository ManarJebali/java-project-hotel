public class Client {
    private int numClient;
    private String cin;
    private String nom;
    private String prenom;
    private Address add;
    private String numTel;

    public Client(String cin,String nom,String prenom,Address add,String numTel) {
        this.nom=nom;
        this.prenom=prenom;
        this.add=add;
        this.numTel=numTel;
    }

    public int getNumClient() {
        return numClient;
    }

    public void setNumClient(int numClient) {
        this.numClient = numClient;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Address getAdd() {
        return add;
    }

    public void setAdd(Address add) {
        this.add = add;
    }

    public String getNumTel() {return numTel;}

    public void setNumTel(String numTel) {this.numTel = numTel;}

}
