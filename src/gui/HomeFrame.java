package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import controllers.Auth;
import views.HomePage;
import models.Hotel;
import entity.ReservasiEntity;
import entity.KamarEntity;
import entity.TamuEntity;
import entity.Penduduk;


public class HomeFrame extends MainFrame {
    private JLabel titleLabel;
    private JTextField nipField;
    private JPasswordField passwordField;
    private JButton checkinButton, checkoutButton, daftarReservasiButton, daftarKamarButton;
    private JButton refresButton;
    private JButton keluarButton;

    private JTable hotelTable;
    private JScrollPane scrollPane;

    private JTextField selectedField = new JTextField();

    public HomeFrame(){
        super("Hotel Management",800,600);
        component();
        event();
    }

    @Override
    protected void component(){
        titleLabel = new JLabel("Hotel Management");
        setFontSize(titleLabel,24);
        setFontStyle(titleLabel, Font.BOLD);
        boundedAdd(titleLabel,25,25, 200,30);

        checkinButton = new JButton("Check In");
        checkinButton.setFocusPainted(false);
        checkinButton.setBackground(primaryColor);
        checkinButton.setBackground(Color.cyan);
        boundedAdd(checkinButton, 25,70,130,35);

        checkoutButton = new JButton("Check Out");
        checkoutButton.setFocusPainted(false);
        checkoutButton.setBackground(primaryColor);
        checkoutButton.setBackground(Color.cyan);
        boundedAdd(checkoutButton, 25,70,150,55);

        daftarKamarButton = new JButton("Daftar Kamar");
        daftarKamarButton.setFocusPainted(false);
        daftarKamarButton.setBackground(thirdColor);
        daftarKamarButton.setBackground(Color.cyan);
        boundedAdd(daftarKamarButton, 75,230,80,30);

        daftarReservasiButton = new JButton("Daftar Reservasi");
        daftarReservasiButton.setFocusPainted(false);
        daftarReservasiButton.setBackground(thirdColor);
        daftarReservasiButton.setBackground(Color.cyan);
        boundedAdd(daftarReservasiButton, 95,250,100,50);

        refresButton = new JButton("Refresh");
        refresButton.setFocusPainted(false);
        refresButton.setBackground(thirdColor);
        refresButton.setBackground(Color.cyan);
        boundedAdd(refresButton, 75,275,80,30);

        hotelTable = new JTable();
        scrollPane = new JScrollPane(hotelTable);
        boundedAdd(scrollPane,165,75,610,470);

        keluarButton = new JButton("Keluar");
        keluarButton.setFocusPainted(false);
        keluarButton.setBackground(secondaryColor);
        keluarButton.setForeground(Color.blue);
        boundedAdd(keluarButton, 25,510,90,30);
    }

    @Override
    protected void event() {
        checkinButton.addActionListener(e -> {
            new CheckInFrame().setVisible(true);
        });

        hotelTable.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int i = hotelTable.getSelectedRow();
                String selectedNo = hotelTable.getValueAt(i,0).toString();
                selectedField.setText(selectedNo);
            }
        });

        checkoutButton.addActionListener(e ->{
            new CheckOutFrame().setVisible(true);
        });

        refresButton.addActionListener(e -> {
            hotelTable.setModel(createDataTabel());
        });
    }

    private DefaultTableModel createDataTabel(){
        DefaultTableModel dataTable = new DefaultTableModel();

        Object column[] = {
                "No",
                "Kode Kamar",
                "Nik",
                "Nama",
                "No Telp",
                "Tanggal Check In",
                "Tanggal Check Out",
        };
        dataTable.setColumnIdentifiers(column);

        return dataTable;
    }
}
