package MINGGU2;

public class DosenMain13 {
    public static void main(String[] args) {
        Dosen13 dosen1 = new Dosen13();
        dosen1.idDosen = "RI13";
        dosen1.nama = "Ryu Ian";
        dosen1.statusAktif = true;
        dosen1.tahunBergabung = 2012;
        dosen1.bidangKeahlian = "Sastra Rusia";

        dosen1.tampilkanInformasi();
        dosen1.setStatusAktif(false);
        dosen1.hitungMasaKerja(2025);
        dosen1.ubahKeahlian("Sastra Korea");
    }
    
}
