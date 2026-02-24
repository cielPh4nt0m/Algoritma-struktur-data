package MINGGU2;

public class MataKuliahMain13 {
    public static void main(String[] args) {
        MataKuliah13 mk1 = new MataKuliah13();
        mk1.kodeMK = "asd777";
        mk1.nama = "Pramoedya Ananta";
        mk1.sks = 10;
        mk1.jumlahJam = 10;

        mk1.tampilkanInformasi();
        mk1.ubahSKS(19);
        mk1.tambahJam(9);
        mk1.kurangiJam(5);
        mk1.tampilkanInformasi();
    }
}
