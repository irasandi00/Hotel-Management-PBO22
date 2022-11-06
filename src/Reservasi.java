public class Reservasi {
    Tamu tamu;
    Kamar kamar;
    int malam;
    String TanggalCheckIn;
    String TanggalCheckOut;

    public Reservasi(int malam, String TanggalCheckIn, String TanggalCheckOut) {
        this.malam = malam;
        this.TanggalCheckIn = TanggalCheckIn;
        this.TanggalCheckOut = TanggalCheckOut;
    }

    public void datakamar(){
        tamu.dataTamu();
        kamar.datakamar();
        System.out.println("Malam                       : " + malam);
        System.out.println("Tanggal Check In            : " + TanggalCheckIn);
        System.out.println("Tanggal Check Out           : " + TanggalCheckOut);
    }
}
