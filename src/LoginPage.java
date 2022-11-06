import java.util.Scanner;

public class LoginPage {
    Scanner scanner = new Scanner(System.in);

    public LoginPage() {
        run();
    }

    void run() {
        while (true) {
            loginMenu();
        }
    }

    void loginMenu() {
        String nip, password;
        boolean status = false;
        System.out.println("\n-----------LOGIN-----------");

        System.out.print("NIP     :");
        nip = scanner.nextLine();
        System.out.print("Password :");
        password = scanner.nextLine();
        status = Auth.login(nip, password);
        if (status) {
            System.out.println("Berhasil Login... ");
        } else {
            gagalLogin();
        }
    }

    void gagallogin() {
        System.out.println("NIP atau password salah ! ");
    }
}