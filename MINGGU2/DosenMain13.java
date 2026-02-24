package MINGGU2;

public class DosenMain13 {
    public static void main(String[] args) {
        Dosen13 dosen1 = new Dosen13();
        dosen1.idDosen = "D012";
        dosen1.nama = "Dr. Ryu Ian";
        dosen1.statusAktif = true;
        dosen1.tahunBergabung = 2012;
        dosen1.bidangKeahlian = "sastra Inggris";

        dosen1.tampilkanInformasi();
        dosen1.setStatusAktif(false);
        dosen1.hitungMasaKerja(2024);
        dosen1.ubahKeahlian("sastra Jepang");

    }
    
}
