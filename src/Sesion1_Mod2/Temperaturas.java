package Sesion1_Mod2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Temperaturas extends JFrame implements ActionListener {
    JButton calcular, borrar;
    JTextField  txtC, txtF, txtK;
    public static void main(String[] args) {
        Temperaturas tem = new Temperaturas();
        tem.crearGUI();
        tem.setSize(250, 250);
        tem.setVisible(true);
    }
    public void crearGUI(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container frame = this.getContentPane();
        frame.setLayout(new FlowLayout());
        this.setTitle("Convertidor de temperaturas");



        JLabel celsius = new JLabel("Celsius");
        JLabel fahr = new JLabel("Fahrenheit");
        JLabel kelvin = new JLabel("Kelvin");
        JLabel titulo = new JLabel("Convertidor de temperaturas");
        txtC = new JTextField(20);
        txtF = new JTextField(20);
        txtK = new JTextField(20);
        calcular = new JButton("Calcular");
        borrar = new JButton("Borrar");

        calcular.addActionListener(this);
        borrar.addActionListener(this);
        this.setBounds(800, 400, 250, 250);

        frame.add(titulo);
        frame.add(celsius);
        frame.add(txtC);
        frame.add(fahr);
        frame.add(txtF);
        frame.add(kelvin);
        frame.add(txtK);
        frame.add(calcular);
        frame.add(borrar);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == calcular){
            calcular();
        }
        else if(e.getSource() == borrar){
            borrar();
        }

    }
    public void calcular(){

        String cel = txtC.getText();
        String fahr = txtF.getText();
        String kel = txtK.getText();

        try{
            if(!cel.isEmpty()) {
                if(fahr.isEmpty() && kel.isEmpty()){
                    Double celsius = Double.parseDouble(cel);
                    Double fahrenheit = (celsius * 1.8d) + 32;
                    Double kelvin = celsius + 273.15d;

                    txtC.setEditable(false);
                    txtF.setEditable(false);
                    txtK.setEditable(false);

                    txtF.setText(""+fahrenheit);
                    txtK.setText(""+kelvin);
                }
                else{
                    JOptionPane.showMessageDialog(null, "No puedes meter más de dos datos. Dato ingresado de más: "+cel);
                }
            }
            else if(!fahr.isEmpty()) {
                if(kel.isEmpty()){
                    Double fahrenheit = Double.parseDouble(fahr);
                    Double celsius = 0.555 *(fahrenheit -32);
                    Double kelvin = celsius + 273.15;

                    txtC.setEditable(false);
                    txtF.setEditable(false);
                    txtK.setEditable(false);

                    txtC.setText(""+celsius);
                    txtK.setText(""+kelvin);

                }
                else{
                    JOptionPane.showMessageDialog(null, "No puedes meter más de dos datos. Dato ingresado de más: "+fahr);
                }
            }
            if(!kel.isEmpty()) {
                if(fahr.isEmpty() && cel.isEmpty()){
                    Double kelvin = Double.parseDouble(kel);
                    Double fahrenheit = (kelvin - 273.15) * 1.8;
                    Double celsius = kelvin - 273.15;

                    txtF.setEditable(false);
                    txtC.setEditable(false);
                    txtK.setEditable(false);

                    txtF.setText(""+fahrenheit);
                    txtC.setText(""+celsius);

                }
                else{
                    JOptionPane.showMessageDialog(null, "No puedes meter más de dos datos. Dato ingresado de más: "+kel);
            }
        }
    }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Ese no es un input válido");

        }
    }
    public void borrar(){
        txtC.setText("");
        txtF.setText("");
        txtK.setText("");
        txtC.setEditable(true);
        txtF.setEditable(true);
        txtK.setEditable(true);
    }
}
