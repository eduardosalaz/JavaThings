package req3;

import javax.swing.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class buscarSingle
{
    JButton ok = new JButton();
    JFileChooser explorador = new JFileChooser();


    public static void main(String[] args) throws IOException {
        buscarSingle buscador = new buscarSingle();
        buscador.crearGUI();

    }
    protected void crearGUI() throws IOException {
        explorador.setCurrentDirectory(new File("./")); //Establecer ruta actual
        explorador.setDialogTitle("Explorador de archivos");
        explorador.setFileSelectionMode(JFileChooser.FILES_ONLY); //Aceptar solo carpetas como entrada
        explorador.setAcceptAllFileFilterUsed(false); //Denegar la opción de Todos los tipos de archivo

        if (explorador.showOpenDialog(ok) == JFileChooser.APPROVE_OPTION) //Seleccionar una carpeta válida
        {
            Path ruta = Paths.get(explorador.getSelectedFile().getAbsolutePath());
            String rutaStr = String.valueOf(Paths.get(explorador.getSelectedFile().getAbsolutePath()));

            if(Files.exists(ruta))
            {
                evalArchivo(rutaStr);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "El archivo no existe");
            }

        }
        else
        {
            System.out.println("No se seleccionó un directorio válido");
        }

    }
    protected void evalArchivo(String ruta) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la palabra a buscar");
        String buscar = sc.nextLine();
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(String.valueOf(ruta)), "utf-8"));
        try
        {
            String linea = null;
            int i = 0;
            int contador = 0;
            while(null != (linea = br.readLine()))
            {
                i++;
                String[] Lactual = linea.split(" ");
                for (String match: Lactual)
                {
                    if(match.equals(buscar))
                    {
                        System.out.println("Palabra " + buscar + " encontrada en la Línea: " +i);
                        contador++;
                    }
                }
            }
            System.out.println("Busqueda terminada, se encontró " + contador + " veces la palabra");
    } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        br.close();
    }
}
