package req2;

import java.util.Scanner;

public class Control
{
    clock reloj = new clock();
    Stopwatch stop = new Stopwatch();
    Contador cont = new Contador();

    public static void main(String[] args) throws InterruptedException
    {
        Control menu = new Control();
        menu.escoger();
    }
    private void escoger() throws InterruptedException
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Para visualizar el reloj, presione 1");
        System.out.println("Para visualizar el cronómetro, presione 2");
        System.out.println("Para visualizar el contador inverso, presione 3");
        System.out.println("Para visualizar el recordatorio, presione 4");

        int decision = Integer.parseInt(sc.nextLine());
        sc.close();
        switch (decision)
        {
            case(1):
                reloj.iniciar();
                break;

            case(2):
                stop.iniciarCrono();
                break;
            case(3):
                cont.empezarCuenta();
                break;
            case(4):
                System.out.println("Característica no implementada");
                break;
            default:
                System.out.println("Ingresar una opción válida");
        }

    }
}
