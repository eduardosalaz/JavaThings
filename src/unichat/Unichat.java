package unichat;

import java.util.ArrayList;
import java.util.Scanner;

public class Unichat 
{
ArrayList <Alumno> listaChat = new ArrayList<Alumno>();
Scanner sc = new Scanner(System.in);
String miNombre = null;
boolean enLinea = true;

	public static void main(String[] args) 
	{
	Unichat uc = new Unichat();
	uc.entrar();
	uc.chat();
	}
	
	private void entrar()
	{
		System.out.println("Entrando al chat Universitario");
		System.out.println("Con que nombre deseas entrar?");
		miNombre = sc.nextLine();
		
		for (int i =0; i<3;i++)
		{
			listaChat.add(new Alumno());
		}
		for (Alumno al :listaChat)
		{
			al.start();
		}
	}
	
	private void chat()
	{
		while (enLinea)
		{
			String linea = sc.nextLine();
			evaluar(linea);
		}
	}
	
	private void evaluar(String linea)
	{
		String palabras[] = linea.split(" ");
		if (linea.equals("exit"))
		{
			System.out.println("Saliendo del chat Universitario");
			enLinea = false;
			System.exit(0);
		}
		else if (palabras[0].equals("adios"))
		{
			for (Alumno al :listaChat)
			{
				if (al.miNombre.equals(palabras[1]))
				{
					al.salir();
				}
			}
		}
		else
		{
			System.out.println(miNombre + " dice: " +linea);
			
			for (Alumno a:listaChat)
			{
				a.evaluar(linea);
			}
		}
	}
}
