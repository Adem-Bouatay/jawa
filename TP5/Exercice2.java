import java.io.File;

class FileManager {
    void readFile(String filePath) throws ExceptionFichierNexiste {
        File file = new File(filePath);
        if (!file.exists()) {
            throw new ExceptionFichierNexiste("Fichier non trouvé : " + filePath);
        }
    }
}

class MathOperations {
    int calculateFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Nombre négatif passé : " + n);
        }
        return 0;
    }

    double calculateSquareRoot(double n) {
        if (n < 0) {
            throw new ArithmeticException("Tentative de calcul de la racine carrée d'un nombre négatif : " + n);
        }
        return Math.sqrt(n);
    }
}

class UserAgeException extends Exception {
    public UserAgeException(String message) {
        super(message);
    }
}

class UserValidator {
    void validateAge(int age) throws UserAgeException {
        if (age < 18) {
            throw new UserAgeException("Âge invalide : " + age + ". L'utilisateur doit être âgé de 18 ans ou plus.");
        }
    }
}
class ExceptionFichierNexiste extends Exception{
    public ExceptionFichierNexiste(String msg){
        super(msg);
    }
}

public class Exercice2 {
    public static void main(String[] args) {
        FileManager fileManager = new FileManager();
        MathOperations mathOperations = new MathOperations();
        UserValidator userValidator = new UserValidator();

        try {
            fileManager.readFile("invalid/file/path.txt");
        } catch (ExceptionFichierNexiste e) {
            System.out.println("Exception attrapée : " + e.getMessage());
        }

        try {
            mathOperations.calculateFactorial(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception attrapée : " + e.getMessage());
        }

        try {
            mathOperations.calculateSquareRoot(-10);
        } catch (ArithmeticException e) {
            System.out.println("Exception attrapée : " + e.getMessage());
        }

        try {
            userValidator.validateAge(16);
        } catch (UserAgeException e) {
            System.out.println("Exception attrapée : " + e.getMessage());
        }
    }
}
