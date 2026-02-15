package MINGGU1;
//import scanner : dipakai membaca input dari user
import java.util.Scanner;

public class tugas1 {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    //array kode plat : berisikan kode plat mobil
    char[] kodeplatMobil = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};

    //Array nama kota : bersiskan nama kota sesuai urutan kode
    String[] namaKota = {"BANTEN", "JAKARTA", "BANDUNG", "CIREBON",
                         "BOGOR", "PEKALONGAN", "SEMARANG", "SUARABYA", "MALANG", "TEGAL"};

            System.out.println("Program pencari kota dari kode plat");
            System.out.println("masukkan kode plat : ");

    //menginput user yang dimana dilakukan mengambil teks input kemudian ubah ke huruf besar dan ambil huruf pertama
           char inputKode = sc.next().toUpperCase().charAt(0);

    //mencari kode plat yang sesuai dengan input user
           boolean found = false;

        // proses pencarian menggunakan perulangan for untuk mengecek setiap elemen dalam array kode plat 
        for (int i = 0; i < kodeplatMobil.length; i++) {
            if (kodeplatMobil[i] == inputKode) {
                System.out.println("Kode plat " + inputKode + " berasal dari kota " + namaKota[i]);
                found = true;
                break; // keluar dari loop setelah menemukan kecocokan
            }
            
        }
        if (!found) {
            System.out.println("Kode plat tidak ditemukan.");
        }
        sc.close();
 }
    
}
