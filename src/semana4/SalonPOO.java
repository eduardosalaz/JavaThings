package semana4;

import java.util.ArrayList;
import java.util.Scanner;

public class SalonPOO {
	ArrayList<Alumno> lista;
	public static void main(String[] args) {
		SalonPOO salon = new SalonPOO();
		salon.leerAlumnos();
		salon.seleccionarOpcion();
	}
	private void seleccionarOpcion()
	{
		Scanner sc = new Scanner(System.in);
		String continuar = "y";
		do 
		{
			
			System.out.println("Sistema de Base de datos");
			System.out.println("Para imprimir la base de datos, presione 1");
			System.out.println("Para borrar registros, presione 2");
			System.out.println("Para editar registros, presione 3");
			System.out.println("Para salir, presione 4");
			String decision = sc.nextLine();
			decision = decision.toLowerCase();
			
			switch(decision)
			{
				case "1" :
					imprimirAlumnos();
					break;
				case "2":
					borrarAlumnos();
					break;
				case "3":
					editarAlumnos();
					break;
				case "4":
					continuar = "a";
					break;
				default:
					System.out.println("Ingresar una opción valida");
			}
			if(continuar.equals("y")) {
				System.out.println("Desea hacer otra operación [Y/N] ?");
				continuar = sc.nextLine();
				continuar = continuar.toLowerCase();
			}
		}
		while (continuar.equals("y"));
	}

	private void leerAlumnos()
	{
		Scanner sc = new Scanner(System.in);
		String otra;
		lista = new ArrayList<Alumno>();
		do {
			System.out.print("Matrícula: ");
			int mat = Integer.parseInt(sc.nextLine());
			System.out.print("Nombre: ");
			String nom = sc.nextLine();
			System.out.print("Promedio: ");
			float prom = Float.parseFloat(sc.nextLine());
			lista.add(new Alumno(mat, nom, prom));
			System.out.println("Desea añadir otra entrada [Y/N] ?");
			otra = sc.nextLine();
			otra = otra.toLowerCase();
		}while(otra.equals("y"));
		
		
	}
	private void imprimirAlumnos()
	{
		System.out.println("ID\t\tMatricula \t\tNombre\t\tPromedio");
		for(int i = 0; i <lista.size(); i++)
		{
			int id = i+1;
			System.out.print(id);
			System.out.print("\t\t");
			System.out.println(lista.get(i));
			
		}
	}
	private void editarAlumnos()
	{
		Scanner sc = new Scanner(System.in);
		imprimirAlumnos();
		System.out.println("Ingrese el número de registro que quiere editar");
		int num = (Integer.parseInt(sc.nextLine()) -1);
		System.out.print("Ingrese la matrícula nueva: ");
		int mat = Integer.parseInt(sc.nextLine());
		System.out.print("Ingrese el nombre nuevo: ");
		String nom = sc.nextLine();
		System.out.print("Ingrese el promedio nuevo: ");
		float prom = Float.parseFloat(sc.nextLine());
		lista.get(num).setMat(mat);
		lista.get(num).setNom(nom);
		lista.get(num).setProm(prom);
		imprimirAlumnos();

	}
	private void borrarAlumnos()
	{
		Scanner sc = new Scanner(System.in);
		imprimirAlumnos();
		System.out.println("Ingrese el número de registro que quiere eliminar");
		int num = (Integer.parseInt(sc.nextLine()) -1);
		lista.remove(num);
		imprimirAlumnos();
	}

}
