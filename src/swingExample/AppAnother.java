package swingExample;

import javax.swing.*;

public class AppAnother extends JFrame {
    public AppAnother() {
        super("Super application to train");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);
        setVisible(true);
        setLayout(null);

        JLabel lblName = new JLabel();
        lblName.setText("Jarek");
        lblName.setBounds(40, 20, 100, 30);
        add(lblName);

        JTextField inputName = new JTextField();
        inputName.setBounds(160, 20, 100, 30);
        add(inputName);


    }

    public static void main(String[] args) {
        new AppAnother();
    }
}
