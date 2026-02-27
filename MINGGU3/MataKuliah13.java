package MINGGU3;

import java.util.Scanner;

public class MataKuliah13 {

    public String kode;
    public String nama;
    public int sks;          // dari String jadi int
    public int jumlahJam;    // dari String jadi int

    
    public MataKuliah13() {
    }

 
    public MataKuliah13(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    public void tambahData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kode        : ");
        kode = sc.nextLine();
        System.out.print("Nama        : ");
        nama = sc.nextLine();
        System.out.print("SKS         : ");
        sks = sc.nextInt();
        System.out.print("Jumlah Jam  : ");
        jumlahJam = sc.nextInt();
        sc.nextLine(); 
    }

     public void cetakInfo() {
        System.out.println("Kode        : " + kode);
        System.out.println("Nama        : " + nama);
        System.out.println("SKS         : " + sks);
        System.out.println("Jumlah Jam  : " + jumlahJam);
    }

   
}