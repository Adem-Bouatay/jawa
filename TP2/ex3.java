class Calculator {
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public double add(double num1, double num2) {
        return num1 + num2;
    }

    public String add(String str1, String str2) {
        return str1 + str2;
    }
}

public class ex3 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        
        int sumIntegers = calculator.add(5, 10);
        int sumThreeIntegers = calculator.add(5, 10, 15);
        double sumDoubles = calculator.add(3.5, 2.5);
        String concatenatedString = calculator.add("Hello", "World");
        
        System.out.println("Sum of 5 and 10: " + sumIntegers);
        System.out.println("Sum of 5, 10, and 15: " + sumThreeIntegers);
        System.out.println("Sum of 3.5 and 2.5: " + sumDoubles);
        System.out.println("Concatenated string: " + concatenatedString);
    }
}