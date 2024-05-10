package ex2;

import java.util.ArrayList;

public class ListeDeDocuments {
    private ArrayList<Document> docList;

    public ListeDeDocuments(){
        this.docList = new ArrayList<>();
    }
    public void ajouteDocument(Document unDoc){
        docList.add(unDoc);
    }
    public void tousLesAuteurs(){
        for(Document doc: docList){
            System.out.print(doc.getNumEnr() + " ");
            if (doc instanceof Livre){
                System.out.print(((Livre) doc).getAuteur());
            }
            System.out.println("");
        }
    }
    public void tousLesDocuments(){
        for(Document doc: docList){
            if (doc instanceof Livre){
                System.out.println((Livre) doc);
            }
            else if (doc instanceof Dictionnaire){
                System.out.println((Dictionnaire) doc);
            }
            else{
                System.out.println(doc);
            }
        }
    }
}
