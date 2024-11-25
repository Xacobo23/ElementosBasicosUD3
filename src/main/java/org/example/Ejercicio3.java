package org.example;

import javax.swing.*;

public class Ejercicio3 extends JFrame{
    public Ejercicio3() {
        setTitle("Ventana Básica");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setLocationRelativeTo(null);
        setLayout(null);

        JButton aceptar = new JButton("Enviar");
        JTextArea textArea = new JTextArea();

        textArea.setBounds(50,40,200,100);

        add(textArea);

        aceptar.setBounds(50, 140, 100, 30);
        aceptar.addActionListener(e -> System.out.println(textArea.getText()));
        add(aceptar);



    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Ejercicio3 frame = new Ejercicio3();
            frame.setVisible(true);
        });
    }
}
