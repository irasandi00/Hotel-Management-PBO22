package models;
import java.util.ArrayList;

import entity.KamarEntity;
import entity.ReservasiEntity;
import entity.StaffEntity;
import entity.TamuEntity;
import utils.DateString;

// Class Inti (Core)
public class Hotel {
    public static ArrayList<KamarEntity> daftarKamar = new ArrayList<>();
    public static ArrayList<StaffEntity> daftarStaff = new ArrayList<>();

    public static ArrayList<ReservasiEntity> daftarReservasi = new ArrayList<>();

    public static void initialKamar() {
        daftarKamar.add(new KamarEntity("101", "Single Bed", 400000, true));
        daftarKamar.add(new KamarEntity("102", "Single Bed", 400000, true));
        daftarKamar.add(new KamarEntity("103", "Double Bed", 600000, true));
        daftarKamar.add(new KamarEntity("104", "Superior Room", 820000, true));
    }

    public static void initalStaff() {
        daftarStaff.add(new StaffEntity("Staff 1", "123", "1"));
        daftarStaff.add(new StaffEntity("Staff 2", "654321", "123321"));
    }

    public static KamarEntity cariKamar(String kode) {
        for (KamarEntity kamar : daftarKamar) {
            if (kamar.getKodeKamar().equals(kode)) {
                return kamar;
            }
        }
        return null;
    }

    private static void updateStatusKamar(KamarEntity kamar, boolean status) {
        for (KamarEntity kamar2 : daftarKamar) {
            if (kamar.getKodeKamar().equals(kamar2.getKodeKamar())) {
                kamar2.setStatus(status);
                break;
            }
        }
    }

    public static boolean checkIn(TamuEntity tamu, KamarEntity kamar, int malam) {
        ReservasiEntity checkIn = new ReservasiEntity(tamu, kamar, malam);

        updateStatusKamar(kamar, false);

        daftarReservasi.add(checkIn);
        return true;
    }

    public static int cariReservasibyKodeKamar(String kodeKamar) {
        int i = -1;
        for (ReservasiEntity reservasi : daftarReservasi) {
            i += 1;
            if (reservasi.getKamar().getKodeKamar().equals(kodeKamar)) {
                if (!reservasi.getKamar().isStatus()) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static void checkOut(int indexReservasi) {
        ReservasiEntity reservasi = daftarReservasi.get(indexReservasi);
        reservasi.setTanggalCheckOut(DateString.now());
        KamarEntity kamar = reservasi.getKamar();
        updateStatusKamar(kamar, true);

        daftarReservasi.set(indexReservasi, reservasi);
    }
}