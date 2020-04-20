package sesion3;

import java.util.ArrayList;
import java.util.Scanner;

public class Tienda 
{

	ArrayList <Articulo> almacen = new ArrayList<Articulo>();
	public static void main(String[] args)
	{
	
		Tienda t1 = new Tienda();
		t1.leerArticulos();
		t1.imprimirArticulos();
		t1.menu();
	}
	
	private void leerArticulos()
	{
		boolean nuevo = true;
		
		Scanner sc = new Scanner(System.in);
		
		do
		{
			System.out.println("Clave articulo");
			int cve = Integer.parseInt(sc.nextLine());
			System.out.println("Nombre");
			String nom = sc.nextLine();
			System.out.println("Precio");
			float pre = Float.parseFloat(sc.nextLine());
			System.out.println("Categoria");
			int cat = Integer.parseInt(sc.nextLine());
			almacen.add(new Articulo(cve, nom, pre, cat));
			System.out.println("Agregar nuevo articulo? 1.- Si 2.- No");
			int opcion = Integer.parseInt(sc.nextLine());
			if (opcion == 1)
			{
				nuevo = true;
			}
			else 
			{
				nuevo = false;
			}
		}while (nuevo);
	}
	private void imprimirArticulos()
	{
		
		System.out.println("Clave\t\tNombre\t\tPrecio\t\tCategoria:");
		for(Articulo a:almacen)
		{
			System.out.println(a);
		}
	}
	private void menu() 
	{
		String continuar = "y";
		Scanner sc = new Scanner(System.in);
		do 
		{
			System.out.println("Base de datos de Tienda");
			System.out.println("1.- Agregar otro artículo");
			System.out.println("2.- Mostrar artículos");
			System.out.println("3.- Borrar un artículo");
			System.out.println("4.- Actualizar un artículo");
			System.out.println("5.- Salir");
			System.out.println("Ingrese su decisión");
			int decision = Integer.parseInt(sc.nextLine());
			
			switch(decision)
			{
			case 1:
				agregarArticulos();
				break;
			
			case 2:
				imprimirArticulos();
				break;
				
			case 3:
				borrarArticulos();
				break;
				
			case 4:
				actualizarArticulos();
				break;
				
			case 5:
				System.exit(0);
				break;
				
			default:
				System.out.println("Ingresar una opción válida");
				break;
			}
			
				System.out.println("Desea hacer otra operación [Y/N] ?");
				continuar = sc.nextLine();
				continuar = continuar.toLowerCase();

		}
		while (continuar.equals("y"));
	}
	private void agregarArticulos() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Clave articulo");
		int cve = Integer.parseInt(sc.nextLine());
		System.out.println("Nombre");
		String nom = sc.nextLine();
		System.out.println("Precio");
		float pre = Float.parseFloat(sc.nextLine());
		System.out.println("Categoria");
		int cat = Integer.parseInt(sc.nextLine());
		almacen.add(new Articulo(cve, nom, pre, cat));
	}
	
	private void borrarArticulos()
	{
			Scanner sc = new Scanner(System.in);
			System.out.println("Ingrese la clave del registro a borrar");
			int reg = Integer.parseInt(sc.nextLine());
			int index = obtenerIndex(reg);
			almacen.remove(index);
			System.out.println("Articulo borrado");
			
	}
	
	private void actualizarArticulos()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese la clave del registro a actualizarr");
		int reg = Integer.parseInt(sc.nextLine());
		int index = obtenerIndex(reg);
		
		System.out.println("Clave articulo nueva");
		int cve = Integer.parseInt(sc.nextLine());
		System.out.println("Nombre nuevo");
		String nom = sc.nextLine();
		System.out.println("Precio nuevo");
		float pre = Float.parseFloat(sc.nextLine());
		System.out.println("Categoria nueva");
		int cat = Integer.parseInt(sc.nextLine());
		
		almacen.get(index).setCve(cve);
		almacen.get(index).setNom(nom);
		almacen.get(index).setPre(pre);
		almacen.get(index).setCat(cat);
		
	}
	
	private int obtenerIndex(int reg)
	{
		for (Articulo ar :almacen)
		{
			if (ar.getCve() == reg)
			{
				return almacen.indexOf(ar);
			}
		}
		return -1;
	}
}
