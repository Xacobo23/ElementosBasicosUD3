package org.example;

import javax.swing.*;

public class Ejercicio2 extends JFrame{
    public Ejercicio2() {
        setTitle("Ventana Básica");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);
        setLayout(null);

        JButton aceptar = new JButton("Aceptar");
        JButton cancelar = new JButton("Cancelar");

        aceptar.setBounds(50, 80, 100, 30);
        aceptar.addActionListener(e -> System.out.println("Aceptado"));
        add(aceptar);

        cancelar.setBounds(150, 80, 100, 30);
        cancelar.addActionListener(e -> System.out.println("Cancelado"));
        add(cancelar);


    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Ejercicio3 frame = new Ejercicio3();
            frame.setVisible(true);
        });
    }
}
