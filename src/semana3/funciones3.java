package semana3;
import java.util.Scanner;

public class funciones3 extends funciones2
{
    public static void main(String[] args)
    {
        System.out.println("Clase funciones 3: ");
        funciones3 fun3 = new funciones3();
        fun3.leerVariables();
        fun3.calcularW();
        fun3.calcularP();
        fun3.calcularM();

    }
    protected void calcularM()
    {
        double M = ((3*N)*Math.pow(Z, 2))/(Math.pow(W, 3));
        System.out.println("El valor de M es: "+M);
    }
    protected void calcularS(double valP)
    {
        double S = (Z*Y)/Math.pow(valP, 2);
        System.out.println("El valor de S es: "+S);
        calcularO(S);
    }
    protected void calcularO(double valS)
    {
        double O = (2*valS)/(3*Y);
        System.out.println("El valor de O es: "+O);

    }
}
