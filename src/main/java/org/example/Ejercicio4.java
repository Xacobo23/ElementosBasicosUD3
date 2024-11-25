package org.example;

import javax.swing.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class Ejercicio4 extends JFrame{
    public Ejercicio4() {
        setTitle("Ventana Básica");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setLocationRelativeTo(null);
        setLayout(null);

        JButton aceptar = new JButton("Enviar");
        JTextArea nombre = new JTextArea("nombre");
        JTextArea apellido = new JTextArea("apellidos");

        nombre.setBounds(50,40,200,30);

        apellido.setBounds(50,100,200,30);


        add(nombre);
        add(apellido);

        aceptar.setBounds(50, 140, 100, 30);
        aceptar.addActionListener(e -> System.out.println("Hola "+nombre.getText()+" "+apellido.getText()));
        add(aceptar);



    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Ejercicio4 frame = new Ejercicio4();
            frame.setVisible(true);
        });
    }
}
