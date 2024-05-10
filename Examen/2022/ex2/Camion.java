public class Camion implements IVehicule {
    String marque;
    String ID;
    int proprietaire;

    public Camion(String marque,String ID, int proprietaire){
    	this.marque = marque; 
    	this.ID = ID; 
    	this.proprietaire= proprietaire; }

    public void afficher(){
        System.out.println(marque + " " + ID + " " + proprietaire);
    }
}
