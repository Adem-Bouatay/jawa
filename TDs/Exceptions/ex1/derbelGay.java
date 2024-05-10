import java.util.InputMismatchException;
import java.util.Scanner;
class Division
{
    public static int quotient( int numerator, int denominator ) throws ArithmeticException
    {
        if (denominator == 0)
            throw new ArithmeticException("raed gay");
        return numerator / denominator;
    }

}
public class derbelGay {
    public static void main( String args[] )
    {
    Scanner scanner = new Scanner( System.in ); // scanner for input
    System.out.print( "Please enter an integer numerator: " );
    try{
        int numerator = scanner.nextInt();
        System.out.print( "Please enter an integer denominator: " );
        int denominator = scanner.nextInt();
        int result = Division.quotient( numerator, denominator );
        System.out.printf("\nResult: %d / %d = %d\n", numerator,
        denominator, result );
    }catch(ArithmeticException ex){
        System.out.println(ex + "Division par 0 inaccc....");
    }catch(InputMismatchException e){
        System.out.println(e + "Donner un entier");
    }catch(Exception e){
        System.out.println("laadhari exception");
    }
    }
    
}
