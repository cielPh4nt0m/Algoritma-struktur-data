package MINGGU2;

public class MahasiswaMain13 {
    public static void main(String[] args) {
        Mahasiswa13 mhs1 = new Mahasiswa13();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "S1 2KJ";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("S1 2K");
        mhs1.updateIpk(3.60);
        mhs1.tampilkanInformasi();

        Mahasiswa13 mhs2 = new Mahasiswa13("Annisa Nabila", "2141720160", "TI 2L", 3.25);
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();

        Mahasiswa13 mhsFadilaMayamasita = 
            new Mahasiswa13("Fadila Mayamasita", "254107020012", "TI 1C", 3.23);

         mhsFadilaMayamasita.tampilkanInformasi();
            System.out.println("Nilai Kinerja: " + mhsFadilaMayamasita.nilaiKinerja());
    }
}
