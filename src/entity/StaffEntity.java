package entity;

// Class Entitas
public class StaffEntity extends Penduduk {
    private String password;

    public StaffEntity() {
    }

    // Constructor dengan Parameter
    public StaffEntity(String nama, String nip, String password) {
        this.nama = nama;
        this.nip = nip;
        this.password = password;
    }

    // Method
    public void dataStaff() {
        System.out.println("Nama Staff      : " + nama);
        System.out.println("NIP Staff       : " + nip);
        System.out.println("Password        : " + password);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}