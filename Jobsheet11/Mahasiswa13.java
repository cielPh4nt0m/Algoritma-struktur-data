package Jobsheet11;

public class Mahasiswa13 {
    String nama;
    String nim;
    String kelas;
    double ipk;

public Mahasiswa13(String nim, String nama, String kelas, double ipk) {
    this.nim = nim;
    this.nama = nama;
    this.kelas = kelas;
    this.ipk = ipk;
}
public void tampilInformasi() {
    System.out.println(nama + "\t" + nim + "\t" + kelas + "\t" + ipk);
}
}
