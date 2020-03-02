package frame;

import javax.swing.*;

public class Main extends JFrame {
    public Main() {
/*        JFrame frame = new JFrame("Tytuł ramki");
        //frame.setTitle("Tytuł ramki");
        //frame.setSize(640, 480);
        //frame.setSize(new Dimension(640, 480));
        //frame.setLocation(100, 50);
        //frame.setLocation(new Point(100, 50));
        frame.setBounds(100, 50, 640, 480);
        //frame.setResizable(false);
        frame.setIconImage(Toolkit.getDefaultToolkit().getImage("/home/user/IdeaProjects/ramka/src/ramka/icon.jpg"));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        */

        super("Tytuł ramki");
        this.setBounds(100, 50, 640, 480);

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //this.pack();
    }

    public static void main(String[] args) {
        new Main().setVisible(true);
    }
}
