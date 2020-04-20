package semana3;
import java.util.Scanner;
public class funciones4 extends funciones3
{
    public static void main(String[] args)
    {

        System.out.println("Clase funciones 4: ");
        funciones4 fun4 = new funciones4();
        fun4.leerVariables();
        fun4.calcularW();
        fun4.calcularP();
        fun4.calcularM();
        fun4.calcularR();
    }
    private void calcularR()
    {
        double R = (5*W)/(2*N*X*Y);
        System.out.println("El valor de R es: "+R);

    }
    protected void calcularO(double valS)
    {
        double O = (2*valS)/(3*Y);
        System.out.println("El valor de O es: "+O);
        calcularC(O, valS);
    }
    private void calcularC(double valO, double valS)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar el valor de A");
        double A = sc.nextDouble();
        double C = (Math.pow(A, 2)+((Math.pow(X, 2)) + (2*X*Y) + (Math.pow(Y, 2))))/(3*valO*valS);
        System.out.println("El valor de C es: "+C);
    }
}
