package centerFrame;

import javax.swing.*;
import java.awt.*;

public class CenterFrame extends JFrame {
    public CenterFrame() {
        int width = Toolkit.getDefaultToolkit().getScreenSize().width;
        int height = Toolkit.getDefaultToolkit().getScreenSize().height;
        //System.out.println(width + " x " + height);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(width / 2, height / 2);
        //this.setLocation(width / 4, height / 4);
        int widthFrame = this.getSize().width;
        int heightFrame = this.getSize().height;
        this.setLocation((width - widthFrame) / 2, (height - heightFrame) / 2);
    }


    public static void main(String[] args) {
        new CenterFrame().setVisible(true);
    }
}
