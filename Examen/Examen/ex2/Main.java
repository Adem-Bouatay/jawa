import java.util.*;
public class Main {
    public static void main(String[] args) {
        try {
            // Création d'une instance de Bibliotheque
            Bibliotheque bibliotheque = new Bibliotheque();

            // Ajout de quelques livres à la bibliothèque
            bibliotheque.ajouterLivre(new Livre(1, "Harry Potter", "J.K. Rowling", 1997));
            bibliotheque.ajouterLivre(new Livre(2, "Le Seigneur des Anneaux", "J.R.R. Tolkien", 1954));
            bibliotheque.ajouterLivre(new Livre(3, "1984", "George Orwell", 1949));
            bibliotheque.ajouterLivre(new Livre(4, "Le Petit Prince", "Antoine de Saint-Exupéry", 1943));

            // Affichage de tous les livres de la bibliothèque
            System.out.println("Tous les livres dans la bibliothèque :");
            bibliotheque.afficherLivres();

            // Recherche et affichage des livres d'un auteur spécifique
            String auteurRecherche = "J.K. Rowling";
            System.out.println("\nLivres de l'auteur " + auteurRecherche + " :");
            List<Livre> livresAuteur = bibliotheque.rechercherLivresParAuteur(auteurRecherche);
            if (!livresAuteur.isEmpty()) {
                for (Livre livre : livresAuteur) {
                    System.out.println("Titre: " + livre.getTitre() + ", Année de publication: " + livre.getAnneePublication());
                }
            } else {
                System.out.println("Aucun livre trouvé pour l'auteur " + auteurRecherche);
            }
        } catch (LivreException e) {
            System.out.println("Erreur : " + e.getMessage());
        }
    }
}

