package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejercicio1 {
    public static void main(String[] args) {
        // Crear el marco (ventana)
        JFrame frame = new JFrame("Ventana Básica");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(null); // Usaremos diseño absoluto

        // Crear un botón
        JButton button = new JButton("Boton");
        button.setBounds(100, 80, 100, 30); // Posición y tamaño del botón

        // Agregar acción al botón
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Mostrar un mensaje en la consola
                System.out.println("Hola");
            }
        });

        // Agregar el botón a la ventana
        frame.add(button);

        // Hacer visible la ventana
        frame.setVisible(true);
    }
}
