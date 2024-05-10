package ex2;

public class Document {
    private int numEnr;
    private String titre;

    public Document(int numEnr, String titre){
        this.numEnr = numEnr;
        this.titre = titre;
    }
    
    public String toString(){
        return "numero: " + numEnr + " titre: " + titre;  
    }

    public int getNumEnr() {
        return numEnr;
    }

    public void setNumEnr(int numEnr) {
        this.numEnr = numEnr;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }
}
