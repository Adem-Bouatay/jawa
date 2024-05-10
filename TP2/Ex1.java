import java.util.ArrayList;

class Etudiant{
    private String Nom;
    private String Prenom;
    private int Inscription;
    private String Mail;

    public Etudiant(String Nom, String Prenom, int Inscription, String Mail){
        this.Nom = Nom;
        this.Prenom = Prenom;
        this.Inscription = Inscription;
        this.Mail = Mail;
    }
    public String getNom(){
        return Nom;
    }
    public String getPrenom(){
        return Prenom;
    }
    public int getInscri(){
        return Inscription;
    }
    public String getMail(){
        return Mail;
    }
    public String toString(){
        return "Nom: " + Nom + " Prenom: " + Prenom +" N° Inscription: " + Inscription + " Mail: " + Mail;
    }
}
class SystemeGestionEtudiants{
    private ArrayList<Etudiant> ListEtudiants = new ArrayList<Etudiant>();

    public void ajouterEtudiant(String nom, String prenom, int numeroInscription, String email) {
        ListEtudiants.add(new Etudiant(nom,prenom,numeroInscription,email));
    }
    public void afficherEtudiants() {
        for (Etudiant etudiant : ListEtudiants) {
            System.out.println(etudiant);
        }
    }
    public void modifierEmailEtudiant(int numeroInscription, String nouvelEmail) {
        for (int i = 0 ; i < ListEtudiants.size() ; i++){
            Etudiant etudiant = ListEtudiants.get(i);
            if ( numeroInscription == etudiant.getInscri()){
                ListEtudiants.set(i, new Etudiant(etudiant.getNom(), etudiant.getPrenom(), etudiant.getInscri(), nouvelEmail));
            }
        }
    }
    public void supprimerEtudiant(int numeroInscription) {
        for (int i = 0 ; i < ListEtudiants.size() ; i++){
            if ( numeroInscription == ListEtudiants.get(i).getInscri()){
                ListEtudiants.remove(i);
            }
        }
    }        
}


public class Ex1 {
    public static void main(String[] args) {
        SystemeGestionEtudiants listEtudiants = new SystemeGestionEtudiants();
        listEtudiants.ajouterEtudiant("Meski", "Mohsen", 11,"meski@gmail.com");
        listEtudiants.ajouterEtudiant("Meski2", "Mohsen3", 1,"2meski@gmail.com");
        listEtudiants.afficherEtudiants();
        listEtudiants.modifierEmailEtudiant(1, "meski3@gmail.com");
        listEtudiants.afficherEtudiants();



        
        listEtudiants.supprimerEtudiant(11);
        listEtudiants.afficherEtudiants();
    }
}

/*
 * Non si l’encapsulation des attributs de la classe Etudiant est modifiée pour les déclarer comme public 
 * il n'est pas nécessaire de créer des méthodes getter et setter.
 */