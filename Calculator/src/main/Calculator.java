package main;

import javax.swing.*;

public class Calculator implements Runnable {
    public static void main(String[] args) {
            new Calculator().run();
        
    }
    public void run() {
        CalculatorFrame frame = new CalculatorFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

class CalculatorFrame extends JFrame {

	public CalculatorFrame() {
        setTitle("Калькулятор");
        UserInterface panel = new UserInterface();
        add(panel);
        pack();
        setSize(350,350);
        setLocationRelativeTo(null);
    }
}
