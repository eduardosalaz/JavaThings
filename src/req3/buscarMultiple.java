package req3;

import javax.swing.*;
import java.io.*;
import java.util.Scanner;

public class buscarMultiple extends buscarSingle
{
    int contador_global;
    JButton ok = new JButton();
    JFileChooser explorador = new JFileChooser();
    File ruta;
    String buscar;

    public static void main(String[] args) throws IOException
    {
        buscarMultiple buscadorM = new buscarMultiple();
        buscadorM.crearGUI();
    }

    protected void crearGUI() throws IOException
    {
        explorador.setCurrentDirectory(new File("./")); //Establecer ruta actual
        explorador.setDialogTitle("Explorador de archivos");
        explorador.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY); //Aceptar solo carpetas como entrada
        explorador.setAcceptAllFileFilterUsed(false); //Denegar la opción de Todos los tipos de archivo

        if (explorador.showOpenDialog(ok) == JFileChooser.APPROVE_OPTION) //Seleccionar una carpeta válida
        {
            ruta = new File(explorador.getSelectedFile().getAbsolutePath());
            System.out.println("Se seleccionó el directorio ubicado en: " + ruta);
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese la palabra a buscar");
            buscar = sc.nextLine();
            listarArchivos();
            sc.close();
        }
            else
            {
                JOptionPane.showMessageDialog(null, "El archivo no existe");
            }

        }

    protected void listarArchivos() throws IOException {
        File[] listaArchivos = ruta.listFiles();
        for (File arch: listaArchivos)
        {
            evalArchivo(arch.getAbsolutePath()); //Se usa el método de getAbsolutePath() para cada archivo ya que se necesita la ruta completa en el método de de evalArchivo
        }
        System.out.println("La palabra: " + buscar + " fue encontrada en total " + contador_global + " veces");
        System.out.println("Directorio listado completo");
    }

    protected void evalArchivo(String ruta) throws IOException {

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
                        System.out.println("Palabra: " + buscar + " encontrada en la Línea: " +i);
                        contador++;
                        contador_global++;
                    }
                }
            }
            System.out.println("Busqueda terminada en el archivo " + ruta + " se encontró " + contador + " veces la palabra");
            System.out.println(" ");
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


