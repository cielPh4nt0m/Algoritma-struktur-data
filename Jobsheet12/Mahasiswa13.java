package Jobsheet12;

//method untuk menyimpan data mahasiswa
public class Mahasiswa13 {
    String nim;
    String nama;
    String kelas;
    double ipk;

// constructor untuk menginisialisasi data mahasiswa
public Mahasiswa13(String nim, String nama, String kelas, double ipk) {
    this.nim = nim;
    this.nama = nama;
    this.kelas =kelas;
    this.ipk = ipk;
}
// method untuk menampilkan data mahasiswa
public void tampil() {
    System.out.println(
        "NIM      : " + nim +
        "\nNama   : " + nama +
        "\nKelas  : " + kelas +
        "\nIPK    : " + ipk
    );
}
}
