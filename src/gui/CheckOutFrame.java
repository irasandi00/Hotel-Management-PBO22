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

public class CheckOutFrame extends MainFrame{
    private JLabel titleLabel;
    private JLabel nikLabel, namaLabel, tanggalLabel,kodeLabel;
    private JTextField nikField, namaField, tanggalField, indexReservasiField, kodeField;
    private JButton checkoutBtn;

    private JButton checkinButton, checkoutButton, daftarReservasiButton;
    private JButton refresButton;
    private JButton keluarButton;

    private JTable hotelTable;
    private JScrollPane scrollPane;

    public CheckOutFrame(){
        super("Hotel Management",800,600);
        component();
        event();
    }

    @Override
    protected void component() {
        titleLabel = new JLabel("Check Out");
        setFontSize(titleLabel, 24);
        setFontStyle(titleLabel, Font.BOLD);
        boundedAdd(titleLabel, 25, 25, 200, 30);

        kodeLabel = new JLabel("Kode Kamar");
        kodeLabel.setFont(new Font("Arial", Font.BOLD, 13));
        boundedAdd(kodeLabel, 65, 330, 25, 18);

        kodeField = new JTextField();
        boundedAdd(kodeField, 65, 350, 270, 30);

        nikLabel = new JLabel("NIK");
        nikLabel.setFont(new Font("Arial", Font.BOLD, 13));
        boundedAdd(nikLabel, 65, 330, 25, 18);

        nikField = new JTextField();
        boundedAdd(nikField, 65, 350, 270, 30);

        namaLabel = new JLabel("Nama Tamu");
        namaLabel.setFont(new Font("Arial", Font.BOLD, 13));
        boundedAdd(namaLabel, 65, 370, 25, 18);

        namaField = new JTextField();
        boundedAdd(namaField, 65, 390, 270, 30);

        tanggalLabel = new JLabel("Tanggal Pesan");
        tanggalLabel.setFont(new Font("Arial", Font.BOLD, 13));
        boundedAdd(tanggalLabel, 65, 330, 25, 18);

        tanggalField = new JTextField();
        boundedAdd(tanggalField, 65, 350, 270, 30);


        checkoutBtn = new JButton("Check Out");
        checkoutBtn.setForeground(Color.white);
        checkoutBtn.setBackground(primaryColor);
        checkoutBtn.setFocusPainted(false);
        boundedAdd(checkoutBtn, 157, 480, 85, 30);

    }

    @Override
    protected void event() {
        try {
            String checkoutBtn = kodeLabel.getText();
            int index = Hotel.cariReservasibyKodeKamar(String.valueOf(kodeField));
            if (index > -1) {
                Hotel.cariReservasibyKodeKamar(String.valueOf(kodeField));
                JOptionPane.showMessageDialog(
                        null, "Berhasil Chekout", "information", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(
                        null, "Data Tidak Ditemukan", "information", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception exc) {
            JOptionPane.showMessageDialog(
                    null, exc, "information", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
