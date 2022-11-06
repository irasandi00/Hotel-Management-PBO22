public class Auth {
    static Staff staffLogged = null;

    public static Staff getStaffLogged() {
        return staffLogged;
    }

    public static boolean login(String nip, String password) {

        if ((Hotel.staffAktif.nip.equals(nip)) &&
                (Hotel.staffAktif.password.equals(password))) {

            staffLogged = Hotel.staffAktif;
            return true;
        } else {
            return false;
        }
    }

    public static void logout() {
    }
}