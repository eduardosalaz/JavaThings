package semana5;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class VistaAlumnos extends JFrame implements ActionListener
{

	private static final long serialVersionUID = 1L;
	JButton prim, ant, next, ult, edit, nuevo, save, del, salir, guardar;
	JTextField matr, nombre, promedio;
	int index1;
	ArrayList<Alumno> lista = new ArrayList<Alumno>();
	public static void main(String[] args) 
	{
		VistaAlumnos ventana = new VistaAlumnos();
		ventana.crearGUI();
		ventana.setSize(400, 400);
		ventana.setResizable(false);
		ventana.setVisible(true);

	}
	protected void crearGUI()
	{
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container frame = this.getContentPane();
		frame.setLayout(new FlowLayout());
		this.setTitle("Base de datos de Alumnos");

		
		JLabel mat = new JLabel("Matricula");
		JLabel nom = new JLabel("Nombre");
		JLabel prom = new JLabel("Promedio");
		
		matr = new JTextField(35);
		nombre = new JTextField(35);
		promedio= new JTextField(35);
		
		prim = new JButton ("Primero");
		prim.addActionListener(this);
		ant = new JButton("Anterior");
		ant.addActionListener(this);
		next = new JButton("Siguiente");
		next.addActionListener(this);
		ult = new JButton("Último");
		ult.addActionListener(this);
		nuevo = new JButton("Nuevo");
		nuevo.addActionListener(this);
		save = new JButton("Guardar nueva entrada");
		save.addActionListener(this);
		edit = new JButton("Editar");
		edit.addActionListener(this);
		guardar = new JButton("Guardar cambios de edicion");
		guardar.addActionListener(this);
		del = new JButton("Borrar");
		del.addActionListener(this);
		salir = new JButton("Salir");
		salir.addActionListener(this);
		
		frame.add(mat);
		frame.add(matr);
		frame.add(nom);
		frame.add(nombre);
		frame.add(prom);
		frame.add(promedio);
		frame.add(prim);
		frame.add(ant);
		frame.add(next);
		frame.add(ult);
		frame.add(nuevo);
		frame.add(save);
		frame.add(edit);
		frame.add(guardar);
		frame.add(del);
		frame.add(salir);
		matr.setEditable(false);
		nombre.setEditable(false);
		promedio.setEditable(false);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource() == prim)
		{
			primero();
		}
		else if(e.getSource() == ant) 
		{
			anterior();
		}
		else if(e.getSource() == next) 
		{
			siguiente();
		}
		else if(e.getSource() == ult) 
		{
			ultimo();
		}
		else if(e.getSource() == edit) 
		{
			editar();
		}
		else if(e.getSource() == nuevo) 
		{
			nuevo();
		}
		else if(e.getSource() == save) 
		{
			guardarNueva();
		}
		else if (e.getSource() == guardar)
		{
			guardarCambios();
		}
		else if(e.getSource() == del) 
		{
			borrar();
		}
		else if(e.getSource() == salir) 
		{
			salir();
		}
		
		
	}
	private void guardarCambios() {
		
		try
		{
			int matric = Integer.parseInt(matr.getText());
			String nomb = nombre.getText();
			float promed = Float.parseFloat(promedio.getText());
			Alumno alum = new Alumno(matric, nomb, promed);
			lista.set(index1, alum);
			matr.setEditable(false);
			nombre.setEditable(false);
			promedio.setEditable(false);
		}
		catch(NumberFormatException e)
		{
			showMessageDialog(null, "Ese no es un input válido");
		}
		catch (IndexOutOfBoundsException e) 
		{
			showMessageDialog(null, "Primero crea una entrada nueva!");
		}
		
	}
	private void salir() 
	{
		System.exit(0);
		
	}
	private void borrar() 
	{
		try
		{
			for (Alumno al : lista)
			{
				if(al.getNom().equals(nombre.getText()))
				{
					matr.setText("");
					promedio.setText("");
					nombre.setText("");
					matr.setEditable(false);
					nombre.setEditable(false);
					promedio.setEditable(false);
					lista.remove(al);
					break;
				}
			}
		}
		catch (Exception e)
		{
			showMessageDialog(null, "No hay entrada válida en esa posicion");
		}

		
	}
	private void guardarNueva() 
	{
		try
		{
			int matric = Integer.parseInt(matr.getText());
			String nomb = nombre.getText();
			float promed = Float.parseFloat(promedio.getText());
			
			lista.add(new Alumno(matric, nomb, promed));

			matr.setEditable(false);
			nombre.setEditable(false);
			promedio.setEditable(false);
		}
		catch(NumberFormatException e)
		{
			showMessageDialog(null, "Ese no es un input válido");
		}
	}
	private void nuevo() 
	{
		
		matr.setText("");
		promedio.setText("");
		nombre.setText("");
		
		matr.setEditable(true);
		nombre.setEditable(true);
		promedio.setEditable(true);
	}
	private void editar() 
	{
		try
		{
			index1 = obtenerIndex();
			Alumno alu = lista.get(index1);

			
			matr.setEditable(true);
			nombre.setEditable(true);
			promedio.setEditable(true);
			
			matr.setText(""+ alu.getMat());
			nombre.setText("" + alu.getNom());
			promedio.setText("" + alu.getProm());
		}
		catch(Exception e)
		{
			showMessageDialog(null, "No hay entrada válida en esa posicion");
		}

	}
	private void ultimo() 
	{
		
		try 
		{
			int index = lista.size()-1;

			Alumno alu =lista.get(index);
			matr.setText(""+ alu.getMat());
			nombre.setText("" + alu.getNom());
			promedio.setText("" + alu.getProm());	
			
			matr.setEditable(false);
			nombre.setEditable(false);
			promedio.setEditable(false);
		}
		catch(Exception e)
		{
			showMessageDialog(null, "No hay entrada válida en esa posicion");
		}

	}
	private void siguiente() 
	{	
		try {
			int index = obtenerIndex() +1;

			Alumno alu = lista.get(index);
			matr.setText(""+ alu.getMat());
			nombre.setText("" + alu.getNom());
			promedio.setText("" + alu.getProm());
			
			matr.setEditable(false);
			nombre.setEditable(false);
			promedio.setEditable(false);
		}
		catch(Exception e) 
		{
			showMessageDialog(null, "No hay entrada válida en esa posicion");
		}

	}
	private void anterior() 
	{
		try {
			int index = obtenerIndex() - 1;

			Alumno alu = lista.get(index);
			matr.setText(""+ alu.getMat());
			nombre.setText("" + alu.getNom());
			promedio.setText("" + alu.getProm());
			
			matr.setEditable(false);
			nombre.setEditable(false);
			promedio.setEditable(false);
		}
		catch(Exception e)
		{
			showMessageDialog(null, "No hay entrada válida en esa posicion");
		}

	}
	private void primero() 
	{

		try
		{
			int index = 0;
			Alumno alu =lista.get(index);
			matr.setText(""+ alu.getMat());
			nombre.setText("" + alu.getNom());
			promedio.setText("" + alu.getProm());
			matr.setEditable(false);
			nombre.setEditable(false);
			promedio.setEditable(false);
		}
		catch(Exception e)
		{
			showMessageDialog(null, "No hay entrada válida en esa posición");
		}

	}
	public int obtenerIndex()
	{
		for (Alumno al : lista)
		{
			if (al.getNom().contentEquals(matr.getText()))
			{
				return lista.indexOf(al);
				
			}
		}
		return -1;
	}

}
