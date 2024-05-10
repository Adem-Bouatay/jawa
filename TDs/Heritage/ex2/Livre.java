package ex2;

public class Livre extends Document {
    private String auteur;
    private int nbPages;

    public Livre(int numEnr, String titre, String auteur, int nbPages){
        super(numEnr, titre);
        this.auteur = auteur;
        this.nbPages = nbPages;
    }
    public String toString(){
        return super.toString() + " auteur: " + auteur + " nb_pages: " + nbPages;
    }
    public String getAuteur() {
        return auteur;
    }
    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }
    public int getNbPages() {
        return nbPages;
    }
    public void setNbPages(int nbPages) {
        this.nbPages = nbPages;
    }
}
