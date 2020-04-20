package req1;

import javax.swing.*;
import java.io.File;

public class fileChooser
{
    //Declaración de Variables

    JButton ok = new JButton();
    JFileChooser explorador = new JFileChooser();
    File ruta;

    public static void main(String[] args)
    {
        fileChooser chooser = new fileChooser();
        try
        {
            chooser.crearGUI();
            chooser.listarArchivos();
        }
        catch(Exception e)
        {
            System.out.println("Seleccionar una ruta válida");
        }


    }

    protected void crearGUI()
    {
        explorador.setCurrentDirectory(new File("./")); //Establecer ruta actual
        explorador.setDialogTitle("Explorador de archivos");
        explorador.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY); //Aceptar solo carpetas como entrada
        explorador.setAcceptAllFileFilterUsed(false); //Denegar la opción de Todos los tipos de archivo

        if (explorador.showOpenDialog(ok) == JFileChooser.APPROVE_OPTION) //Seleccionar una carpeta válida
        {
            ruta = new File(explorador.getSelectedFile().getAbsolutePath());
            System.out.println("Se seleccionó el directorio ubicado en: " + ruta);

        }
        else
        {
            System.out.println("No se seleccionó un directorio válido");
        }

    }

    private void listarArchivos()
    {
        File listaArchivos[] = ruta.listFiles();

        System.out.println("La lista de archivos en la ruta seleccionada es :");
        for (File arch: listaArchivos)
        {
            System.out.println("Nombre archivo: " + arch.getName() + "\t" + "Peso archivo: " +  arch.length() +" bytes");
            System.out.println(" ");

        }
        System.out.println("Directorio listado completo");
    }
}