package req2;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Contador
{
    static int lapso;
    static Timer timer;
    public static void main(String[] args)
    {
        Contador con = new Contador();
        con.empezarCuenta();
    }
    public void empezarCuenta()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresar segundos");
        String secs = sc.nextLine();
        sc.close();
        int periodo = 1000;
        timer = new Timer();
        lapso = Integer.parseInt(secs);
        System.out.print(secs + "\r");
        timer.scheduleAtFixedRate(new TimerTask()
        {
            public void run()
            {
                System.out.print(seguirContando() +"\r");
            }
        }, 0, periodo);
    }
    private static int seguirContando()
    {
            if (lapso == 1)
                timer.cancel();
            return --lapso;
    }
}

