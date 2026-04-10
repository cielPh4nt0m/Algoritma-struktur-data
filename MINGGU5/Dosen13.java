package MINGGU5;

public class Dosen13 {
    String kode;
    String nama;
    boolean jenisKelamin;
    int usia;

public Dosen13(String kd, String name, boolean jk, int age){
    this.kode = kd;
    this.nama = name;
    this.jenisKelamin = jk;
    this.usia = age;
}

public void tampil() {
     String jk = (jenisKelamin) ? "Pria" : "Wanita";
     System.out.printf("Kode: %s | Nama: %-15s | JK: %-7s | Usia: %d\n", kode, nama, jk, usia);
    }
}
