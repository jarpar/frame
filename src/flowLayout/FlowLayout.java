package flowLayout;

import javax.swing.*;
import java.awt.*;

public class FlowLayout extends JFrame {
    public FlowLayout() {
        this.setBounds(300, 300, 300, 200);
        initComponents();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void initComponents() {

        //button1.setPreferredSize(new Dimension(100, 100));

        jPanel1.add(button1);
        jPanel1.add(button2);
        jPanel1.add(button3);
        jPanel1.add(button4);

        this.getContentPane().add(jPanel1, BorderLayout.CENTER);

    }

    JPanel jPanel1 = new JPanel();

    JButton button1 = new JButton("Button 1");
    JButton button2 = new JButton("Button 2");
    JButton button3 = new JButton("Button 3");
    JButton button4 = new JButton("Button 4");

    public static void main(String[] args) {

        new FlowLayout().setVisible(true);

    }
}
