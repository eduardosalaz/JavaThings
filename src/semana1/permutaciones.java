package semana1;
import java.util.Scanner;
public class permutaciones
{
    public static void main (String[] args)
    {
        String n, r;
        int num, perm;
        long resultado;
        System.out.println("Calcular las permutaciones de un conjunto");
        System.out.println("Ingresar el número de elementos del conjunto");
        Scanner sc = new Scanner(System.in);
        n = sc.nextLine();
        try
        {
            num = Integer.parseInt(n);
            if(num > 0)
            {
                System.out.println("Ingrese el número de elementos de cada permutación");
                r = sc.nextLine();
                try
                {
                    perm = Integer.parseInt(r);
                    if (perm > num)
                    {
                        System.out.println("La cardinalidad de las permutaciones no puede ser mayor a la cardinalidad del conjunto");
                    }
                    else if (perm <= 0)
                    {
                        System.out.println("Ingresar números mayores a 0");
                    }
                    else
                    {
                        resultado = (factorial(num))/(factorial(num - perm));
                        System.out.println("La cantidad de permutaciones es: " +resultado);
                    }
                }
                catch(NumberFormatException e)
                {
                    System.out.println("Ingresar sólo enteros");
                }
            }
            else
            {
                System.out.println("Ingresar números mayores a 0");
            }
        }
        catch(NumberFormatException e)
        {
            System.out.println("Ingresar sólo enteros");
        }
    }
    public static long factorial(int numero)
    {
        long resultado = 1;
        for (int fac = 2; fac <= numero; fac++)
        {
            resultado *= fac;
        }
        return resultado;
    }
}
