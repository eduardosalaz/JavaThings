package sesion4.heredando;

public class Contador extends Thread 
{
	int ID;
	public void run()
	{
		for (int i = 0;i<=200;i++)
		{
			System.out.println("Soy el Hilo" + ID + " y voy en el " +  i);
		}
	}
	public Contador(int ID) {
		this.ID = ID;
	}
}
