package ukladGraficzny;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    public Main() {
        super("Layout");
        this.setBounds(300, 320, 300, 200);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Main().setVisible(true);
    }
}
