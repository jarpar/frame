package swingExample;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppBattlefield extends JFrame {
    public AppBattlefield() {
        super("Super application to train");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);
        setVisible(true);
        setLayout(null);

        JLabel lblName = new JLabel();
        lblName.setText("Hello, World!");
        lblName.setBounds(40, 20, 100, 30);
        add(lblName);

        JTextField inputName = new JTextField();
        inputName.setBounds(160, 20, 100, 30);
        add(inputName);

        JLabel author = new JLabel(inputName.getText());
        author.setBounds(150, 100, 120, 30);
        add(author);

        JButton buttonName = new JButton("Print input");
        buttonName.setBounds(100, 70, 120, 30);
        buttonName.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                author.setText(inputName.getText());
            }
        });
        add(buttonName);

    }

    public static void main(String[] args) {
        new AppBattlefield();
    }
}
