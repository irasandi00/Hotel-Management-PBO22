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

public class CheckInFrame extends MainFrame{

    private JLabel titleLabel;
    private JLabel nikLabel, namaLabel, alamatLabel, notelpLabel, kodeLabel;
    private JTextField nikField, namaField, alamatField, notelpField, kodeField;
    private JButton lanjutBtn;
    private JButton pesanBtn;
    private JTextField tamuField, kamarField, malamField;
    private JButton refresButton;
    private JButton keluarButton;

    private JTable hotelTable;
    private JScrollPane scrollPane;

    public CheckInFrame(){
        super("Hotel Management",800,600);
        component();
        event();
    }

    @Override
    protected void component() {
        titleLabel = new JLabel("Check In");
        setFontSize(titleLabel, 24);
        setFontStyle(titleLabel, Font.BOLD);
        boundedAdd(titleLabel, 25, 25, 200, 30);

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

        alamatLabel = new JLabel("Alamat");
        alamatLabel.setFont(new Font("Arial", Font.BOLD, 13));
        boundedAdd(alamatLabel, 65, 330, 25, 18);

        alamatField = new JTextField();
        boundedAdd(alamatField, 65, 350, 270, 30);

        notelpLabel = new JLabel("No. Telp");
        notelpLabel.setFont(new Font("Arial", Font.BOLD, 13));
        boundedAdd(notelpLabel, 65, 330, 25, 18);

        notelpField = new JTextField();
        boundedAdd(notelpField, 65, 350, 270, 30);

        lanjutBtn = new JButton("Lanjut");
        lanjutBtn.setForeground(Color.white);
        lanjutBtn.setBackground(primaryColor);
        lanjutBtn.setFocusPainted(false);
        boundedAdd(lanjutBtn, 157, 480, 85, 30);

        kodeLabel = new JLabel("Kode Kamar");
        kodeLabel.setFont(new Font("Arial", Font.BOLD, 13));
        boundedAdd(kodeLabel, 65, 330, 25, 18);

        kodeField = new JTextField();
        boundedAdd(kodeField, 65, 350, 270, 30);

        namaLabel = new JLabel("Jenis Kamar");
        namaLabel.setFont(new Font("Arial", Font.BOLD, 13));
        boundedAdd(namaLabel, 65, 370, 25, 18);

        namaField = new JTextField();
        boundedAdd(namaField, 65, 390, 270, 30);

        alamatLabel = new JLabel("Alamat");
        alamatLabel.setFont(new Font("Arial", Font.BOLD, 13));
        boundedAdd(alamatLabel, 65, 330, 25, 18);

        alamatField = new JTextField();
        boundedAdd(alamatField, 65, 350, 270, 30);

        lanjutBtn = new JButton("Pesan");
        lanjutBtn.setForeground(Color.white);
        lanjutBtn.setBackground(primaryColor);
        lanjutBtn.setFocusPainted(false);
        boundedAdd(lanjutBtn, 157, 480, 85, 30);
    }

    @Override
    protected void event() {
        lanjutBtn.addActionListener(e -> {
            String nik = nikField.getText();
            String nama = namaField.getText();
            String alamat = alamatField.getText();
            String notelp = notelpField.getText();
            TamuEntity tamu= tamuField.getText();
            int malam = Integer.parseInt(malamField.getText());
            KamarEntity kamar = kamarField.getText();

            if (Hotel.checkIn(tamu,kamar,malam)) {
                setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Gagal Check In");
            }
        });
    }
}
