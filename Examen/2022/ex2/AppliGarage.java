public class AppliGarage {
    public static void main(String[] args) {
        Garage darBagga = new Garage("darBagga","wad nawar");
        Camion bagga = new Camion("fiat","15",112);
        Camion ihsen = new Camion("IA1","0", 15);
        Voiture v1 = new Voiture("bmv","chadi","rose bebe");
        Voiture v2 = new Voiture("mercadas","3amer","zbibi");
        v1.afficher();
        bagga.afficher();
        darBagga.ajouter(bagga);
        darBagga.ajouter(ihsen);
        darBagga.ajouter(v1);
        darBagga.ajouter(v2);
        try{
            darBagga.enlever(new Voiture("derbel","derbl","a5dher"));
        }catch(GarageException e){
            System.out.println(e);
        }
        try {
        	darBagga.enlever(ihsen);
        }catch(GarageException e) {
        	System.out.println(e);
        }
        darBagga.afficher();
        darBagga.afficher();
    }
}
