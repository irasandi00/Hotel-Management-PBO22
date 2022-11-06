public class Kamar {
    String KodeKamar;
    String JenisKamar;
    int HargaPerMalam;
    boolean status;

    public Kamar(String KodeKamar, String JenisKamar, int HargaPerMalam, boolean status) {
        this.KodeKamar = KodeKamar;
        this.JenisKamar = JenisKamar;
        this.HargaPerMalam = HargaPerMalam;
        this.status = status;
    }
    public void datakamar(){
        System.out.println("Kode Kamar                : " + KodeKamar);
        System.out.println("Jenis Kamar               : " + JenisKamar);
        System.out.println("Harga Per Malam           : " + HargaPerMalam);
        System.out.println("Status                    : " + status);
    }
}
