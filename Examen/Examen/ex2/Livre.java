public class Livre {
    private int id;
    private String titre;
    private int anneePublication;
    private String auteur;
    
    public Livre(int id, String titre,String auteur,int anneePublication){
        this.titre = titre;
        this.id = id;
        this.anneePublication = anneePublication;
        this.auteur = auteur;
    }

    public String toString(){
        return String.format("%d %s %s %s",id, titre, anneePublication, auteur);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public int getAnneePublication() {
        return anneePublication;
    }

    public void setAnneePublication(int anneePublication) {
        this.anneePublication = anneePublication;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }
    
}
