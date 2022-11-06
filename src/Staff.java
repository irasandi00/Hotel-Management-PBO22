public class Staff {
    String nama;
    String nip;
    String password;

    public Staff(String nama, String nip, String pasword) {
        this.nama = nama;
        this.nip = nip;
        this.password = password;
    }
    public void dataStaff(){
        System.out.println("Nama Staff             : " + nama);
        System.out.println("Nip Staff              : " + nip);
        System.out.println("Password               : " + password);
    }

}
