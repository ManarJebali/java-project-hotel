public class Address {
    private String nRue;
    private int numImm;
    private int codeP;
    private String pays;

    public Address(String nRue,int numImm,int codeP,String pays) {
        this.nRue = nRue;
        this.codeP=codeP;
        this.pays=pays;
        this.numImm=numImm;
    }

    public String getnRue() {
        return nRue;
    }

    public void setnRue(String nRue) {
        this.nRue = nRue;
    }

    public int getNumImm() {
        return numImm;
    }

    public void setNumImm(int numImm) {
        this.numImm = numImm;
    }

    public int getCodeP() {
        return codeP;
    }

    public void setCodeP(int codeP) {
        this.codeP = codeP;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    @Override
    public String toString() {
        return numImm +" "+ nRue +" "+codeP+" "+pays;
    }
}
