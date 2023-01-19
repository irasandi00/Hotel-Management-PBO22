package main;
import controllers.LoginPageController;
import models.Hotel;
import gui.LoginFrame;

public class Main {
    public static void main(String[] args) {
        Hotel.initalStaff();
        Hotel.initialKamar();
//        new LoginPageController();

//       LoginFrame login = new LoginFrame();
        new LoginFrame().setVisible(true);

    }
}