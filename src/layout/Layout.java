package layout;

import javax.swing.*;
import java.awt.*;

public class Layout extends JFrame {
    public Layout() {
        super("Layout");
        this.setBounds(300, 320, 300, 200);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        initComponents();
        this.pack();

    }

    public void initComponents() {

        center = new JButton("Center");
        up = new JButton("Up");
        down = new JButton("Down");
        left = new JButton("Left");
        right = new JButton("Right");

        Container container = this.getContentPane();

        container.add(center, BorderLayout.CENTER);
        container.add(up, BorderLayout.PAGE_START);
        container.add(down, BorderLayout.PAGE_END);
        container.add(left, BorderLayout.LINE_START);
        container.add(right, BorderLayout.LINE_END);

//        container.setLayout(null);
//        center.setLocation(100, 20);
//        center.setSize(100, 50);
//        container.add(center);

    }

    JButton center;
    JButton up;
    JButton down;
    JButton left;
    JButton right;

    public static void main(String[] args) {
        new Layout().setVisible(true);
    }
}
