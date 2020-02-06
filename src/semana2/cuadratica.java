package semana2;
import java.util.Scanner;
public class cuadratica {
	public static void main(String[] args)
	{
		int a, b, c;
		Double x1, x2;
		double radical;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Calcular las raíces de una ecuación cuadrática");
		System.out.println("Ingresar el valor de A");
		a = sc.nextInt();
		System.out.println("Ingresar el valor de B");
		b = sc.nextInt();
		System.out.println("Ingresar el valor de C");
		c = sc.nextInt();
		
		radical = Math.pow(b, 2)- 4*a*c;
		if(radical > 0)
		{
			x1 = (-b + Math.sqrt(radical))/2*a;
			x2 = (-b - Math.sqrt(radical))/2*a;
			System.out.println("El valor de las raíces es: "+x1 +x2);
		}
		else if (radical == 0)
		{
			x1 = (-b + Math.sqrt(radical))/2*a;
			x2 = (-b - Math.sqrt(radical))/2*a;
			if (x1.isNaN())
			{
				System.out.println("El valor de la raiz es: " +x2);
			}
			else if (x2.isNaN())
		}
		
		else
		{
			System.out.println("Las raices son imaginarias");
		}

	}

}
