package controllers;
import entity.StaffEntity;
import models.Hotel;

// Class Inti (Core)
public class Auth {
    static StaffEntity staffLogged = null;

    public static StaffEntity getStaffLogged() {
        return staffLogged;
    }

    public static boolean login(String nip, String password) {

        for (StaffEntity staff : Hotel.daftarStaff) {
            if ((staff.getNip().equals(nip)) && (staff.getPassword().equals(password))) {
                staffLogged = staff;
                return true;
            }
        }
        return false;
    }

    public static void logout() {
        staffLogged = null;
    }
}