package MINGGU2;

public class MataKuliah13 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    void tampilkanInformasi() {
        System.out.println("Kode MK: " + kodeMK);
        System.out.println("Nama: " + nama);
        System.out.println("Jumlah SKS: " + sks);
        System.out.println("Jumlah Jam: " + jumlahJam);
    }

    void ubahSKS(int sksBaru) {
        sks = sksBaru;
    }

    void tambahJam(int tambahJam) {
        jumlahJam += tambahJam;
    }

    void kurangiJam(int kurangiJam) {
        jumlahJam -= kurangiJam;
    }
}