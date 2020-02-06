package semana1;
import java.util.Scanner;
public class suma2numeros
{
    public static void main(String[] args )
    {
        int A, B, C;
        System.out.println("Ingrese el primer valor");
        Scanner sc= new Scanner(System.in);
        A = sc.nextInt();
        System.out.println("Ingrese el segundo valor");
        B = sc.nextInt();
        C = A + B;
        System.out.println("La suma de los números es: " + C);
    }
}
