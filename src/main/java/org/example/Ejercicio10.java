package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejercicio10 extends JFrame{
    public Ejercicio10() {
        setTitle("Ventana Básica");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLocationRelativeTo(null);
        setLayout(null);

        JMenuBar jMenuBar = new JMenuBar();

        JMenu archivo = new JMenu("Archivo");
        JMenu edicion = new JMenu("Edicion");

        JMenuItem abrir = new JMenuItem("Abrir");
        JMenuItem guardar = new JMenuItem("Guardar");

        abrir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Abrir");
            }
        });

        // Acción para "Guardar"
        guardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Guardar");
            }
        });

        edicion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Edición");
            }
        });

        archivo.add(abrir);
        archivo.add(guardar);

        jMenuBar.add(archivo);
        jMenuBar.add(edicion);

        setJMenuBar(jMenuBar);



    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Ejercicio10 frame = new Ejercicio10();
            frame.setVisible(true);
        });
    }
}
