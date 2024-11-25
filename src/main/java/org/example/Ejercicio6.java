package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejercicio6 extends JFrame{
    public Ejercicio6() {
        setTitle("Ventana Básica");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);
        setLayout(null);

        String[] colores = {"Rojo", "Azul", "Verde"};

        JComboBox<String> comboBox = new JComboBox<>(colores);
        comboBox.setBounds(100, 50, 100, 30);

        add(comboBox);

        comboBox.addActionListener(e -> System.out.println(comboBox.getSelectedItem()));



    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Ejercicio6 frame = new Ejercicio6();
            frame.setVisible(true);
        });
    }
}
