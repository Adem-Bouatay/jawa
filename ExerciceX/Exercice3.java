package ExerciceX;

public class Exercice3 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        // Appelez chaque méthode add surchargée avec différents ensembles de paramètres
        int sommeEntiers = calculator.add(5, 10);
        int sommeTroisEntiers = calculator.add(5, 10, 15);
        double sommeDoubles = calculator.add(3.5, 2.5);
        String chaineConcatenee = calculator.add("Bonjour", "Monde");
        // Affichez les résultats de chaque appel de méthode
        System.out.println("Somme de 5 et 10 : " + sommeEntiers);
        System.out.println("Somme de 5, 10 et 15 : " + sommeTroisEntiers);
        System.out.println("Somme de 3.5 et 2.5 : " + sommeDoubles);
        System.out.println("Chaîne concaténée : " + chaineConcatenee);
        }
}
class Calculator{
    public int add(int a, int b){
        return a + b;
    }
    public int add(int a, int b, int c){
        return a + b + c;
    }
    public double add(double a, double b){
        return a + b;
    }
    public String add(String str1, String str2){
        return str1 + str2;
    }
}