package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejercicio9 extends JFrame{
    public Ejercicio9() {
        setTitle("Ventana Básica");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLocationRelativeTo(null);
        setLayout(null);

        JCheckBox check1 = new JCheckBox("Queso Extra");
        check1.setBounds(50, 30, 150, 30);
        JCheckBox check2 = new JCheckBox("Pepperoni");
        check2.setBounds(50, 60, 150, 30);
        JCheckBox check3 = new JCheckBox("Aceitunas");
        check3.setBounds(50, 90, 150, 30);

        JButton jButton = new JButton("Ordenar");
        jButton.setBounds(100, 130, 100, 30);

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder sb = new StringBuilder();
                if (check1.isSelected()) {
                    sb.append("Queso Extra ");
                }
                if (check2.isSelected()) {
                    sb.append("Pepperoni ");
                }
                if (check3.isSelected()) {
                    sb.append("Aceitunas ");
                }

                if (sb.isEmpty()) {
                    System.out.println("No se seleccionaron toppings.");
                } else {
                    System.out.println(sb);
                }
            }
        });

        add(check1);
        add(check2);
        add(check3);
        add(jButton);


    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Ejercicio9 frame = new Ejercicio9();
            frame.setVisible(true);
        });
    }
}
