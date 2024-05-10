package ex2;

public class Bibliotheque {
    public static void main(String[] args) {
        Document livre = new Livre(1,"Lost","me",120);
        Document dict = new Dictionnaire(4, "Arabe", "Francais", 5);
        Document doc = new Document(8, "blah");
        Document doc1 = new Document(2, "blah2");
        
        ListeDeDocuments listeD = new ListeDeDocuments();
        
        listeD.ajouteDocument(livre);
        listeD.ajouteDocument(dict);
        listeD.ajouteDocument(doc);
        listeD.ajouteDocument(doc1);

        listeD.tousLesDocuments();
    }
}
