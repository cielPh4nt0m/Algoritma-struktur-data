package MINGGU2;

public class MataKuliahMain13 {
    public static void main(String[] args) {
        MataKuliah13 matkul1 = new MataKuliah13();
        matkul1.kodeMk = "asd543";
        matkul1.nama = " Mas Pramoedya Ananta";
        matkul1.sks = 10;
        matkul1.jumlahJam = 10;

        matkul1.tampilkanInformasi();
        matkul1.ubahSKS(12);
        matkul1.tambahJam(2);
        matkul1.kurangiJam(1);
        matkul1.tampilkanInformasi();
    }
}
