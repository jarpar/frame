package swingExample;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppBattlefield extends JFrame {
    public AppBattlefield() {
        super("Super application to train");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 250);
        setLocationRelativeTo(null);
        setVisible(true);
        setLayout(null);
        int deleteMe;
        JLabel lblName = new JLabel();
        lblName.setText("Hello, World!");
        lblName.setBounds(40, 20, 100, 30);
        add(lblName);

        JTextField inputName = new JTextField();
        inputName.setBounds(160, 20, 100, 30);
        inputName.setToolTipText("Enter name");
        add(inputName);

        JLabel author = new JLabel();
        author.setBounds(100, 100, 120, 30);
        add(author);

        JButton buttonName = new JButton("Print");
        buttonName.setBounds(100, 60, 120, 30);
        buttonName.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                author.setText("Hello, " + inputName.getText() + "!");
            }
        });
        add(buttonName);

        JPanel redPanel = new JPanel();
        redPanel.setBounds(100, 125, 120, 20);
        redPanel.setLayout(new BorderLayout());
        add(redPanel);

        JButton colorRed = new JButton("Red");
        colorRed.setBounds(100, 150, 120, 30);
        colorRed.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                redPanel.setBackground(Color.red);
            }
        });
        add(colorRed);

    }


    public static void main(String[] args) {
        new AppBattlefield();
    }
}
