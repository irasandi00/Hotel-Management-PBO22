package entity;

import utils.DateString;

// Class Entitas
public class ReservasiEntity {
    private TamuEntity tamu;
    private KamarEntity kamar;
    private int malam;
    private String tanggalCheckIn;
    private String tanggalCheckOut;

    // Constructor
    public ReservasiEntity(TamuEntity tamu, KamarEntity kamar, int malam) {
        this.tamu = tamu;
        this.kamar = kamar;
        this.malam = malam;
        this.tanggalCheckIn = DateString.now();
    }

    // Method
    public void dataKamar() {
        tamu.dataTamu();
        kamar.dataKamar();
        System.out.println("Malam           : " + malam);
        System.out.println("Tanggal CheckIn : " + tanggalCheckIn);
        System.out.println("Tanggal CheckOut: " + tanggalCheckOut);
    }

    public void setTanggalCheckIn(String tanggalCheckIn) {
        this.tanggalCheckIn = tanggalCheckIn;
    }

    public void setTanggalCheckOut(String tanggalCheckOut) {
        this.tanggalCheckOut = tanggalCheckOut;
    }

    public TamuEntity getTamu() {
        return tamu;
    }

    public void setTamu(TamuEntity tamu) {
        this.tamu = tamu;
    }

    public KamarEntity getKamar() {
        return kamar;
    }

    public void setKamar(KamarEntity kamar) {
        this.kamar = kamar;
    }

    public int getMalam() {
        return malam;
    }

    public void setMalam(int malam) {
        this.malam = malam;
    }

    public String getTanggalCheckIn() {
        return tanggalCheckIn;
    }

    public String getTanggalCheckOut() {
        return tanggalCheckOut;
    }

}