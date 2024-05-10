public class Voiture implements IVehicule {
    String marque;
    String ID;
    String Couleur;

    public Voiture(String marque, String ID, String couleur){
        this.marque = marque;
        this.ID = ID;
        this.Couleur = couleur;
    }
    public void afficher(){
        System.out.println(marque + " " + ID + " " + Couleur);
    }
}
