package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class Ejercicio7 extends JFrame{
    public Ejercicio7() {
        setTitle("Ventana Básica");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLocationRelativeTo(null);
        setLayout(null);

        JTextField jTextField = new JTextField("Usuario");

        jTextField.setBounds(100,50,200,40);

        JPasswordField jPasswordField = new JPasswordField("123");
        jPasswordField.setBounds(100,100,200,40);

        JButton jButton = new JButton("Iniciar sesión");
        jButton.setBounds(100,150,200,40);

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Usuario: "+jTextField.getText());
                System.out.println("Contraseña: "+ Arrays.toString(jPasswordField.getPassword()));
            }
        });

        add(jTextField);
        add(jPasswordField);
        add(jButton);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Ejercicio7 frame = new Ejercicio7();
            frame.setVisible(true);
        });
    }
}
