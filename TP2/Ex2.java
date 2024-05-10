class CompteBancaire{
    private String titulaire;
    private double solde;

    public CompteBancaire(String titulaire, double solde){
        this.titulaire = titulaire;
        this.solde = solde;
    }
    public String getTitulaire(){
        return titulaire;
    }
    public double getSolde(){
        return solde;
    }
    public void setTitulaire(String titulaire){
        this.titulaire = titulaire;
    }
    public void setSolde(double solde){
        if (solde>=0) this.solde = solde;
    }
    public void deposer(double montant){
        solde += montant;
    }
    public void retirer(double montant){
        if (solde < montant) solde = 0;
        else solde -= montant; 
    }
}

public class Ex2 {
    public static void main(String[] args) {
        CompteBancaire compte = new CompteBancaire("Mohsen Miski", 1400);
        compte.deposer(150);
        System.out.println(compte.getSolde());
        compte.retirer(1700);
        System.out.println(compte.getSolde());
    }
}
