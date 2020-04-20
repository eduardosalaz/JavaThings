package sesion4.runnable;

public class HilosRunnable implements Runnable
{
	int ID;
	
	public static void main(String[] args) {
		System.out.println("Hilos Runnable");
		Runnable R[] = new Runnable[3];
		for(int i =0;i<3;i++)
		{
			R[i] = new HilosRunnable(i+1);
		}
		for (Runnable n:R)
		{
			new Thread(n).start();
		}

	}
	public void run()
	{
		for (int i = 0; i<= 200;i++)
		{
			System.out.println("Soy el hilo " + ID + "conteo " +i);
		}
	}
	public HilosRunnable(int ID)
	{
		this.ID = ID;
	}

}
