public class Tamu {
    String nik;
    String nama;
    String alamat;
    String notelp;

    public Tamu(String nik, String nama, String alamat, String notelp) {
        this.nik = nik;
        this.nama = nama;
        this.alamat = alamat;
        this.notelp = notelp;
    }

    public void dataTamu(){
        System.out.println("Nama Tamu             : " + nama);
        System.out.println("Nik Tamu              : " + nik);
        System.out.println("Alamat                : " + alamat);
        System.out.println("No Telp               : " + notelp);
    }
}
