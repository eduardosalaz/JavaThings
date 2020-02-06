package semana1;
import java.util.Scanner;
public class fibonacci
{
    public static void main(String[] args)
    {
        String n;
        int i;
        long num, num3;
        long num1=1;
        long num2=1;
        System.out.println("Calcular la serie de Fibonacci");
        System.out.println("Hasta qué termino se desea calcular la serie?");
        Scanner sc = new Scanner(System.in);
        n= sc.nextLine();
        try
        {
            num = Integer.parseInt(n);
            if(num > 0)
            {
                System.out.println(num1);
                System.out.println(num2);
                for (i = 0;  i <= num-3 ; i++)
                {
                    num3 = num1 + num2;
                    System.out.println(num3);
                    num1 = num2;
                    num2 = num3;
                }
            }
            else if (num == 0)
            {
                System.out.println("Ingresar números mayores a 0");
            }

        }
        catch (NumberFormatException e)
        {
            System.out.println("Ese no es un input válido");
        }


    }
}
