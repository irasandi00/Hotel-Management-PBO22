package entity;

// Class Entitas
public class KamarEntity {
    private String kodeKamar;
    private String jenisKamar;
    private int hargaPerMalam;
    private boolean status;

    public KamarEntity() {
    }

    // Constructor
    public KamarEntity(String kodeKamar, String jenisKamar,
                 int hargaPerMalam, boolean status) {
        this.kodeKamar = kodeKamar;
        this.jenisKamar = jenisKamar;
        this.hargaPerMalam = hargaPerMalam;
        this.status = status;
    }

    // Method
    public void dataKamar() {
        System.out.println("Kode Kamar      : " + kodeKamar);
        System.out.println("Jenis Kamar     : " + jenisKamar);
        System.out.println("Harga Per Malam : " + hargaPerMalam);
        System.out.println("Status          : " + status);
    }

    public String getKodeKamar() {
        return kodeKamar;
    }

    public void setKodeKamar(String kodeKamar) {
        this.kodeKamar = kodeKamar;
    }

    public String getJenisKamar() {
        return jenisKamar;
    }

    public void setJenisKamar(String jenisKamar) {
        this.jenisKamar = jenisKamar;
    }

    public int getHargaPerMalam() {
        return hargaPerMalam;
    }

    public void setHargaPerMalam(int hargaPerMalam) {
        this.hargaPerMalam = hargaPerMalam;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}