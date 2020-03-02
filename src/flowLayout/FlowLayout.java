package flowLayout;

import javax.swing.*;
import java.awt.*;

public class FlowLayout extends JFrame {
    public FlowLayout() {
        this.setBounds(300, 300, 300, 200);
        initComponents();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    JButton button1 = new JButton("Button 1");
    JButton button2 = new JButton("Button 2");
    JButton button3 = new JButton("Button 3");
    JButton button4 = new JButton("Button 4");

    public void initComponents() {
        button1.setPreferredSize(new Dimension(100, 100));
//        this.getContentPane().add(button1, BorderLayout.PAGE_START);
//        this.getContentPane().add(button2, BorderLayout.PAGE_END);
//        this.getContentPane().add(button3, BorderLayout.LINE_START);
//        this.getContentPane().add(button4, BorderLayout.LINE_END);
    }

    JPanel jPanel = new JPanel(new java.awt.FlowLayout());

    public static void main(String[] args) {
        new FlowLayout().setVisible(true);
    }

}
