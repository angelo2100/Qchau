/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica8;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Jean_Lap
 */
public class Practica8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Create frame with specific title
 MouseListener mouseListener = new MouseAdapter( ){
     
 };
JFrame frame = new JFrame("Alumnos");
frame.setResizable(false); 
frame.setSize(700, 400);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

JPanel panel = new JPanel();
panel.setLayout(null);
frame.add(panel);

JLabel lblNombre = new JLabel();
panel.add(lblNombre);
lblNombre.setText("Nombre");
lblNombre.setBounds(25,25,100,35);

JLabel lblApellido = new JLabel();
panel.add(lblApellido);
lblApellido.setText("Apellido");
lblApellido.setBounds(25,75,100,35);

JLabel lblMatricula = new JLabel();
panel.add(lblMatricula);
lblMatricula.setText("Matricula");
lblMatricula.setBounds(25,125,100,35);

JLabel lblTel = new JLabel();
panel.add(lblTel);
lblTel.setText("Telefono");
lblTel.setBounds(25,175,100,35);

JButton btnInsertar = new JButton("Aceptar");
btnInsertar.setBounds(100,300,100, 35);
panel.add(btnInsertar);

JButton btnLimpiar = new JButton("Limpiar");
btnLimpiar.setBounds(400,300,100, 35);
panel.add(btnLimpiar);

JTextField txtNombre = new JTextField();
txtNombre.setBounds(100, 28, 150,25);
panel.add(txtNombre);

JTextField txtApellido = new JTextField();
txtApellido.setBounds(100, 78, 150,25);
panel.add(txtApellido);

JTextField txtMatricula = new JTextField();
txtMatricula.setBounds(100, 128, 150,25);
panel.add(txtMatricula);

JTextField txtTelefono = new JTextField();
txtTelefono.setBounds(100, 178, 150,25);
panel.add(txtTelefono);

frame.setVisible(true);
    }
}
