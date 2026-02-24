package MINGGU2;

public class Dosen13 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    void tampilkanInformasi() {
        System.out.println("ID Dosen: " + idDosen);
        System.out.println("Nama Dosen:" + nama);
        System.out.println("Status Aktif: " + statusAktif);
        System.out.println("Tahun Bergabung: " + tahunBergabung);
    }

    void setStatusAktif(boolean status) {
        statusAktif = status;
    }

    void hitungMasaKerja(int tahunSekarang) {
        int masaKerja = tahunSekarang - tahunBergabung;
        System.out.println("Masa Kerja: " + masaKerja + "tahun");
    }

    void ubahKeahlian(String keahlianBaru) {
        System.out.println("Keahlian Dosen :" + keahlianBaru);
    }
}
