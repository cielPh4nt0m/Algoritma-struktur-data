package MINGGU3;

import java.util.Scanner;
public class MataKuliahDemo13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah MataKuliah: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        MataKuliah13[] arrayOfMataKuliah13 = new MataKuliah13[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nMasukkan Data MataKuliah ke-" + (i + 1));

            arrayOfMataKuliah13[i] = new MataKuliah13();
            arrayOfMataKuliah13[i].tambahData();
        }

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nMasukkan Data MataKuliah ke-" + (i + 1));

            arrayOfMataKuliah13[i] = new MataKuliah13();
            arrayOfMataKuliah13[i].tambahData();
        }

        System.out.println("\n===== DATA MATAKULIAH =====");
        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nData MataKuliah ke-" + (i + 1));
            arrayOfMataKuliah13[i].cetakInfo();
        }
        
       /*  MataKuliah13[] arrayOfMataKuliah13 = new MataKuliah13[3];
        String kode, nama, dummy;
        int sks, jumlahJam;
        

         for (int i = 0; i < 3; i++) {
         System.out.println("Masukkan Data MataKuliah ke-" + (i + 1));
         System.out.print("Kode        : ");
         kode = sc.nextLine();
         System.out.print("Nama        : ");
         nama = sc.nextLine();
         System.out.print("Sks         : ");
         dummy = sc.nextLine();
         sks = Integer.parseInt(dummy);
         System.out.print("Jumlah Jam  : ");
         dummy = sc.nextLine();
         jumlahJam = Integer.parseInt(dummy);
         System.out.println("------------------------------------------------");

   
         arrayOfMataKuliah13[i] = new MataKuliah13(kode, nama, sks, jumlahJam);
}

            for (int i = 0; i < 3; i++) {
           System.out.println("Data MataKuliah ke-" + (i + 1));
           System.out.println("Kode      : " + arrayOfMataKuliah13[i].kode);
           System.out.println("Nama      : " + arrayOfMataKuliah13[i].nama);
           System.out.println("Sks       : " + arrayOfMataKuliah13[i].sks);
           System.out.println("Jumlah Jam: " + arrayOfMataKuliah13[i].jumlahJam);

           
        } */

        MataKuliah13 mk = new MataKuliah13();
        mk.tambahData();
        mk.cetakInfo(); 


    }

    
}