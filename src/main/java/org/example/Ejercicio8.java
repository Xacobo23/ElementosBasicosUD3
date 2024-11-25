package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class Ejercicio8 extends JFrame{
    public Ejercicio8() {
        setTitle("Ventana Básica");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLocationRelativeTo(null);
        setLayout(null);

        JRadioButton j1 = new JRadioButton("Tarjeta de Crédito");
        j1.setBounds(50, 30, 150, 30);  // Posición y tamaño
        JRadioButton j2 = new JRadioButton("PayPal");
        j2.setBounds(50, 60, 150, 30);  // Posición y tamaño
        JRadioButton j3 = new JRadioButton("Transferencia Bancaria");
        j3.setBounds(50, 90, 200, 30);

        ButtonGroup grupo = new ButtonGroup();
        grupo.add(j1);
        grupo.add(j2);
        grupo.add(j3);

        JButton jButton = new JButton("Confirmar");
        jButton.setBounds(100, 130, 100, 30);

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String metodoPagoSeleccionado = "";
                if (j1.isSelected()) {
                    metodoPagoSeleccionado = "Tarjeta de Crédito";
                } else if (j2.isSelected()) {
                    metodoPagoSeleccionado = "PayPal";
                } else if (j3.isSelected()) {
                    metodoPagoSeleccionado = "Transferencia Bancaria";
                }

                if (!metodoPagoSeleccionado.isEmpty()) {
                    System.out.println("Método de pago seleccionado: " + metodoPagoSeleccionado);
                } else {
                    System.out.println("No se ha seleccionado un método de pago.");
                }
            }
        });

        add(j1);
        add(j2);
        add(j3);
        add(jButton);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Ejercicio8 frame = new Ejercicio8();
            frame.setVisible(true);
        });
    }
}
