package MINGGU2;

public class MataKuliah13 {
    String kodeMk;
    String nama;
    int sks;
    int jumlahJam;

    void tampilkanInformasi() {
        System.out.println("kode Mk: " + kodeMk);
        System.out.println("Nama: " + nama);
        System.out.println("jumlah SKS: " + sks);
        System.out.println("Jumlah jam: " + jumlahJam);
    }

    void ubahSKS(int sksBaru) {
        sks = sksBaru;
    }

    void tambahJam(int Tambahjam) {
        jumlahJam += Tambahjam;
    }

    void kurangiJam(int Kurangijam) {
        jumlahJam -= Kurangijam;
    }


}
