package req2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class clock {
    boolean seguir = true;
    public static void main(String[] args) {
       clock reloj = new clock();
       reloj.iniciar();
    }
    public void iniciar()
    {

        Thread th = new Thread(new Runnable()
        {
            public void run()
            {

                    while(seguir)
                    {
                        Date date = Calendar.getInstance().getTime();
                        DateFormat formatter = new SimpleDateFormat("EEEE, dd MMMM yyyy, hh:mm:ss a");
                        String hoy = formatter.format(date);
                        System.out.print("La fecha de hoy es : " + hoy+"\r");
                        try
                        {
                            Thread.sleep(1000);


                        }
                        catch(Exception ex)
                        {
                            ex.printStackTrace();
                        }
                    }

            }
        });
        th.start();
    }
}
