package req2;
public class Stopwatch 
{

    public static void main(String[] args) throws InterruptedException
    {
        Stopwatch stop = new Stopwatch();
        stop.iniciarCrono();
    }
    public void iniciarCrono() throws InterruptedException
    {
        long start = System.currentTimeMillis();
        while (true)
        {
            Thread.sleep(1000);
            long tiempoPasado = System.currentTimeMillis() - start;
            tiempoPasado = tiempoPasado / 1000;

            String seg = Integer.toString((int) (tiempoPasado % 60));
            String min = Integer.toString((int) ((tiempoPasado % 3600) / 60));
            String hor = Integer.toString((int) (tiempoPasado / 3600));

            if (seg.length() < 2)
            {
                seg = "0" + seg;
            }

            if (min.length() < 2)
            {
                min = "0" + min;
            }

            if (hor.length() < 2)
            {
                hor = "0" + hor;
            }
            System.out.print(hor + ":" + min + ":" + seg + "\r");
        }
    }
}