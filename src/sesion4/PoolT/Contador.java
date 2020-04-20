package sesion4.PoolT;

public class Contador implements Runnable {

	int ID;
	public void run()
	{
		for (int i=3;i<=30;i = i+3)
		{
			System.out.println("Hilo: "+ ID+ "conteo " + i);
			try {
				Thread.sleep(750);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
	public Contador(int ID)
	{
		this.ID = ID;
	}

}
