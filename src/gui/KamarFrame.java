package gui;

import controllers.Auth;
import controllers.LoginPageController;
import entity.KamarEntity;
import entity.ReservasiEntity;
import entity.TamuEntity;
import models.Hotel;
import views.HomePage;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.*;

public class KamarFrame extends MainFrame{
    private JLabel titleLabel;
    private JTextField nipField;
    private JPasswordField passwordField;
    private JButton satuButton, duaButton, tigaButton, empatButton;
    private JButton refresButton;
    private JButton keluarButton;

    private JTable hotelTable;
    private JScrollPane scrollPane;

    private JTextField selectedField = new JTextField();

    public KamarFrame(){
        super("Hotel Management",800,600);
        component();
        event();
    }

    @Override
    protected void component(){
        titleLabel = new JLabel("Daftar Kamar");
        setFontSize(titleLabel,24);
        setFontStyle(titleLabel, Font.BOLD);
        boundedAdd(titleLabel,25,25, 200,30);

        satuButton = new JButton("101");
        satuButton.setFocusPainted(false);
        satuButton.setBackground(primaryColor);
        satuButton.setBackground(Color.cyan);
        boundedAdd(satuButton, 25,70,130,35);

        duaButton = new JButton("102");
        duaButton.setFocusPainted(false);
        duaButton.setBackground(primaryColor);
        duaButton.setBackground(Color.cyan);
        boundedAdd(duaButton, 25,70,160,55);

        tigaButton = new JButton("103");
        tigaButton.setFocusPainted(false);
        tigaButton.setBackground(thirdColor);
        tigaButton.setBackground(Color.cyan);
        boundedAdd(tigaButton, 75,230,80,30);

        empatButton = new JButton("104");
        empatButton.setFocusPainted(false);
        empatButton.setBackground(thirdColor);
        empatButton.setBackground(Color.cyan);
        boundedAdd(empatButton, 75,230,100,50);

        hotelTable = new JTable();
        scrollPane = new JScrollPane(hotelTable);
        boundedAdd(scrollPane,165,75,610,470);

    }

    @Override
    protected void event() {
        satuButton.addActionListener(e -> {
            new CheckInFrame().setVisible(true);
        });
    }
}

