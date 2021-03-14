package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Laboratorium_11 {
    public static void main(String[] args) {
        JFrame window = new JFrame("Kalkulator Jednostek Temperatury");
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setSize(400, 225);
        window.setLocationRelativeTo(null);
        window.setLayout(null);
        JLabel num1 = new JLabel("Celcjusz");
        num1.setBounds(130, 20, 100, 30);
        window.add(num1);;
        JLabel add = new JLabel("Fahrenheit");
        add.setBounds(20, 90, 200, 30);
        window.add(add);
        JTextField textNum1 = new JTextField();
        textNum1.setBounds(20, 20, 100, 25);
        window.add(textNum1);
        JButton button = new JButton("Przelicz");
        button.setBounds(20, 60, 100, 30);
        window.add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String num1 = textNum1.getText();
                int sum = Integer.parseInt(num1) * 2 + 32;
                add.setText("Fahrenheit " + sum);

            }
        });
        window.setVisible(true);
    }
}