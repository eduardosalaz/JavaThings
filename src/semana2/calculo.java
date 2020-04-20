//Eduardo Salazar Treviño 1847972 IAS V1|
package semana2;
import java.util.Scanner;
public class calculo {
    public static void main(String[] args) {
        input();
    }

    private static void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el valor de A");
        double A = sc.nextDouble();
        System.out.println("Ingresa el valor de B");
        double B = sc.nextDouble();
        System.out.println("Ingresa el valor de C");
        double C = sc.nextDouble();
        
        boolean validar =  validarNumeros(A, B, C);
        if (validar == true) {
        	
            double num = numeradorX(B);
            double den = denom(A);
            double X = calcX(num, den);
            double producto3 = productoC(C);
            double Y = calcY(producto3, den);
            double prodZ = numeradorZ(Y, A, B);
            double Z = calcZ(prodZ, C);
            double numFin = numeradorFinal(X, Y);
            double denFin = denominadorFinal(Z);
            double Resultado = calculoFinal(numFin, denFin);
            
            System.out.println("X: "+X);
            System.out.println("Y: "+Y);
            System.out.println("Z: "+Z);
            System.out.println("El valor del cálculo es: "+Resultado);
        }
        else {
            System.out.println("Los números deben de ser distintos a 0, y la B positiva");
        }

    }

    private static boolean validarNumeros(double A, double B, double C)
    {
        if (A != 0 && B> 0 && C!= 0){
            return true;
        }else{
            return false;
        }
    }
    private static double numeradorX(double n2) {
        if (n2 > 0) {
            double num = 2 * Math.sqrt(n2);
            return num;
        }else{
            System.out.println("La raiz es negativa");
            return 0;
        }

    }

    private static double calcX(double num, double den) {
        double X = num / den;
        return X;
    }

    private static double denom(double n1) {
        double den = 3 * n1;
        return den;
    }

    private static double productoC(double n3) {
        double prod = 7 * Math.pow(n3, 2);
        return prod;
    }

    private static double calcY(double producto, double den) {
        double Y = producto / den;
        return Y;
    }

    private static double numeradorZ(double n1, double n2, double n3) {
        double prod = n1 * n2 * n3;
        return prod;
    }

    private static double calcZ(double numeradorZ, double denomZ) {
        double Z = numeradorZ / denomZ;
        return Z;
    }

    private static double numeradorFinal(double X, double Y) {
        double resta = X - Y;
        double numerador = 2 * Math.pow(resta, 2);
        return numerador;
    }
    private static double denominadorFinal(double Z)
    {
        return Math.pow(Z, 3);
    }
    private static double calculoFinal(double num, double den)
    {
        double resultado = num / den;
        return resultado;
    }

}
