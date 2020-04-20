package semana3;

import java.util.Scanner;

public class funciones1 {
    double X, Z, Y, W, N;
    public static void main(String[] args)
    {
        funciones1 fun= new funciones1();
        fun.leerVariables();
        fun.calcularW();
    }
    protected void leerVariables()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Ingresar el valor de x");
        X = in.nextDouble();
        System.out.println("Ingresar el valor de y");
        Y = in.nextDouble();
        calcularZ(X);
    }
    private void calcularZ(double valX)
    {
        Z = 2*valX + (3*Math.pow(Y, 2));
        System.out.println("Z es: "+Z);
    }
    protected void calcularW()
    {
        W= (2*Z) + (3*Y);
        System.out.println("W es: "+W);
        calcularN(W);
    }
    private void calcularN(double W)
    {
        N = (Z*Y) / W;
        System.out.println("N es: "+N);
    }
}

