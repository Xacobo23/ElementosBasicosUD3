package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejercicio5 extends JFrame{
    public Ejercicio5() {
        setTitle("Ventana Básica");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setLocationRelativeTo(null);
        setLayout(null);

        JButton boton = new JButton("Boton");
        boton.setBounds(115, 100,70,30);
        add(boton);

        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String edad = JOptionPane.showInputDialog("¿Cuál es tu edad?", JOptionPane.QUESTION_MESSAGE);


                String resultado;
                if (edad != null && !edad.trim().isEmpty()) {
                    resultado= "Tienes " + edad + "años";
                } else {
                    // Si el nombre es vacío o se canceló el cuadro de diálogo
                    resultado="No se ingresó un nombre.";
                }

                JOptionPane.showMessageDialog(null, resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);
            }
        });



    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Ejercicio5 frame = new Ejercicio5();
            frame.setVisible(true);
        });
    }
}
