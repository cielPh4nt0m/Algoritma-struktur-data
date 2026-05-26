package Jobsheet11;

public class Mahasiswa213 {
    String nim;
    String nama;
    String keperluan;

// konstruktor buat mendaftar data mahasiswa
public Mahasiswa213(String nim, String nama, String keperluan) {
    this.nim = nim;
    this.nama = nama;
    this.keperluan = keperluan;
 }

// method buat menampilkan informasi mahasiswa
public void tampilkanData() {
    System.out.println("NIM         : " + nim);
    System.out.println("NAMA        : " + nama);
    System.out.println("KEPERLUAN   : " + keperluan);
}
}


