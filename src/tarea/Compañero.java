package tarea;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Compañero extends Thread 
{
	long start, end;
	double tiempoTarea;
	ArrayList <String> tareas = new ArrayList<String>();
	//No pude hacer este arraylist de tareas visible para que lo usen los métodos, intente hacerlo con un Implements Runnable
	//y hacer una herencia de dos direcciones pero la idea era confusa. Pensé en hardcodear las tareas también pero tenía problemas
	//con el flujo de ejecución. 
	String nombres [] = new String[] {"Alejandro", "Amanda", "Roman", "Antonio", "Perla", "Julia", "Teresa", "Silvia", "Jorge"};
	String miNombre;
	boolean conectado = true;
	String palabras[] ;
	
	public void run() 
	{
		inicializar();
		while (conectado)
		{
			
		}
	}
	
	private void inicializar() 
	{
		Random ran = new Random();
		int sel = ran.nextInt(nombres.length);
		miNombre = nombres[sel];
		System.out.println(miNombre + " ha entrado al equipo");
	}
	public void evaluar(String linea)
	{
		palabras = linea.split(" ");
		if(palabras[0].equals(miNombre ))
		{
			//DEBUGGING
			System.out.println("Soy " + miNombre);
			for (int i = 1; i<palabras.length; i++)
			{
				//DEBUGGING
				System.out.println(palabras[i]);
				System.out.println(tareas);
				for (String tarea: tareas)
				{
					
					System.out.println(tarea);
					if (palabras[i].equals(tarea))
					{
						asignarTarea(palabras[i]);
						System.out.println("TAREA ASIGNADA");
					}
					else
					{
						System.out.println("Asigna una tarea válida");
					}
				}
			}
		}

	}

	private void asignarTarea(String tarea) 
	{
		try
		{
			double random = 0.8 + Math.random() * (1.2 - 0.8);
			//Un minuto = 5 segundos de manera aproximada, se incluye el factor aleatorio de 0.8 a 1.2 veces del tiempo asignado
			tiempoTarea = ((Integer.parseInt(palabras[palabras.length -2])) * 5) * random ;
			System.out.println(miNombre + " dice de acuerdo");
		}
		catch(Exception e)
		{
			System.out.println("Ingresa un tiempo válido");
		}
		try {
			TimeUnit.SECONDS.sleep((long) tiempoTarea);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}