package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import controllers.Auth;
public class LoginFrame extends MainFrame {

    private JLabel hotelLabel;
    private JLabel nipLabel, passwordLabel;
    private JTextField nipField;
    private JPasswordField passwordField;

    private JButton loginBtn;

    public LoginFrame() {
        super("Hotel Management", 400, 600);
        component();
        event();
    }
    @Override
    protected void component() {
        hotelLabel = new JLabel("Hotel Management");
        hotelLabel.setFont(new Font("Arial", Font.BOLD, 24));
        hotelLabel.setForeground(primaryColor);
        boundedAdd(hotelLabel, 100, 265, 200, 45);

        nipLabel = new JLabel("NIP");
        nipLabel.setFont(new Font("Arial", Font.BOLD, 13));
        boundedAdd(nipLabel, 65, 330, 25, 18);

        nipField = new JTextField();
        boundedAdd(nipField, 65, 350, 270, 30);

        passwordLabel = new JLabel("Password");
        passwordLabel.setFont(new Font("Arial", Font.BOLD, 13));
        boundedAdd(passwordLabel, 65, 395, 65, 18);

        passwordField = new JPasswordField();
        boundedAdd(passwordField, 65, 415, 270, 30);

        loginBtn = new JButton("Masuk");
        loginBtn.setForeground(Color.white);
        loginBtn.setBackground(primaryColor);
        loginBtn.setFocusPainted(false);
        boundedAdd(loginBtn, 157, 480, 85, 30);
    }

        @Override
    protected void event() {
        loginBtn.addActionListener(e -> {
            String nip = nipField.getText();
            String password = String.valueOf(passwordField.getPassword());

            if (Auth.login(nip, password)) {
                new HomeFrame().setVisible(true);
                setVisible(false);
            } else {
                JOptionPane.showMessageDialog(null, "NIP Atau PASSWORD Salah");
            }
        });
    }
}