package MINGGU1;

import java.util.Scanner;

public class pemilihan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Program menghitung nilai akhir");
        System.out.println("===============================");
        
        System.out.print("Masukkan nilai tugas: ");
        double tugas = sc.nextDouble();

        System.out.print("Masukkan nilai kuis: ");
        double kuis = sc.nextDouble();

        System.out.print("Masukkan nilai UTS: ");
        double UTS = sc.nextDouble();

        System.out.println("Masukkan nilai UAS: ");
        double UAS = sc.nextDouble();

        System.out.println("===============================");

        if ( tugas < 0 || tugas > 100 ||
             kuis < 0 || kuis > 100 ||
             UTS < 0 || UTS > 100 ||
             UAS < 0 || UAS > 100) {

                System.out.println("Nilai tidak valid");
        } else {

            double nilaiAkhir = (0.2 * tugas) +
                               (0.2 * kuis) + 
                               (0.3 * UTS) + 
                               (0.4 * UAS) ;
            
                    String nilaiHuruf;
                    String keterangan;
         
        if (nilaiAkhir > 80 && nilaiAkhir <= 100){
            nilaiHuruf = "A";
            keterangan = "SELAMAT ANDA LULUS";
        } else if (nilaiAkhir > 73) {
            nilaiHuruf = "B+";
            keterangan = "SELAMAT ANDA LULUS";
        } else if (nilaiAkhir > 65) {
            nilaiHuruf = "B";
            keterangan =  "SELAMAT ANDA LULUS";
        } else if (nilaiAkhir > 60) {
            nilaiHuruf ="C+";
            keterangan = "SELAMAT ANDA LULUS";
        } else if ( nilaiAkhir > 50) {
            nilaiHuruf = "C";
            keterangan = "SELAMAT ANDA LULUS";
        } else if (nilaiAkhir > 39) {
            nilaiHuruf = "D";
            keterangan = "ANDA TIDAK LULUS";
        } else {
            nilaiHuruf = "E";
            keterangan = "ANDA TIDAK LULUS";
        }
        
        System.out.printf("nilai akhir : %.1f\n", nilaiAkhir);
        System.out.println("nilai huruf : " + nilaiHuruf);
        System.out.println("===========================================");
        System.out.println(keterangan);

        }
        sc.close();
    
    }
}