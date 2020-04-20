package tarea;

import java.util.ArrayList;
import java.util.Scanner;

public class Equipo extends Compañero 
{
	ArrayList <Compañero> miembros = new ArrayList<Compañero>();
	Scanner sc = new Scanner(System.in);
	boolean enLinea = true;

	public static void main(String[] args) {
		Equipo eq = new Equipo();
		eq.entrar();
		eq.chat();
		

	}
	private void entrar()
	{
		String opcion ="y";
		while(opcion.equals("y"))
		{
			System.out.println("Ingresa una tarea para el trabajo");
			tareas.add(sc.nextLine());
			System.out.println("Desea ingresar otra tarea [Y/N]");
			opcion = sc.nextLine().toLowerCase();
		}
		System.out.println(tareas);
		System.out.println("Ingresa el numero de miembros de tu equipo");
		int numEquipo = Integer.parseInt(sc.nextLine());
		for(int i=1; i<= numEquipo;i++)
		{
			miembros.add(new Compañero());
		}
		for (Compañero compa:miembros)
		{
			compa.start();
		}
	}
	private void chat()
	{
		while(enLinea)
		{
			String linea = sc.nextLine();
			leer(linea);
		}
	}
	private void leer(String linea)
	{
		for (Compañero compa:miembros)
		{
			compa.evaluar(linea);
		}
	}
	

}