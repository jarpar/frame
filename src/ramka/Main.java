package ramka;

import javax.swing.*;
import java.awt.*;

public class Main {
    public Main() {
        JFrame frame = new JFrame("Tytuł ramki");
        //frame.setTitle("Tytuł ramki");
        frame.setSize(640, 480);
        //frame.setSize(new Dimension(640, 480));
        //frame.setLocation(100, 50);
        frame.setLocation(new Point(100, 50));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
}
