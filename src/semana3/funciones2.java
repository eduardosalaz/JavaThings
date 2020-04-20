package semana3;

import java.util.Scanner;

public class funciones2 extends funciones1
{

    public static void main(String[] args)
    {
        System.out.println("Clase funciones 2: ");
        funciones2 fun2 = new funciones2();
        fun2.leerVariables();
        fun2.calcularP();
        fun2.calcularW();
    }
    protected void calcularP()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Valor de L: ");
        double L = sc.nextDouble();
        double P = (3*Z)/L;
        System.out.println("El valor de P es: "+P);
        calcularS(P);
    }
    protected void calcularS(double valP)
    {
        double S = (Z*Y)/Math.pow(valP, 2);
        System.out.println("El valor de S es: "+S);
    }
}
