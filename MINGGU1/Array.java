package MINGGU1;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] mataKuliah = {"pancasila", 
                             "Konsep Teknologi Informasi", 
                             "Crtitical Thinking dan Problem Solving", 
                             "Matematika dasar", 
                             "Bahasa Inggris", 
                             "Dasar Pemrograman", 
                             "Praktikum Dasar Pemrograman", 
                             "Keselamatan dan Kesehatan Kerja"};

        int[] sks = {2, 2, 2, 3, 2, 3, 1, 2};
        double[] nilaiAngka = new double[mataKuliah.length];
        String[] nilaiHuruf = new String[mataKuliah.length];
        double[] nilaiMutu = new double[mataKuliah.length];

        double totalBobot = 0;
        int totalSKS = 0;

        System.out.println("PROGRAM MENGHITUNG IP SEMESTER");
        System.out.println("==================================");

        for (int i = 0; i < mataKuliah.length; i++){
            System.out.print("Masukkan nilai angka untuk MK " + mataKuliah[i] + ": ");
            nilaiAngka[i] = sc.nextDouble();

            if(nilaiAngka[i] > 80 && nilaiAngka[i] <= 100) {
                nilaiHuruf[i] = "A";
                nilaiMutu[i] = 4.0;
            } else if (nilaiAngka[i] > 73) {
                nilaiHuruf[i] = "B+";
                nilaiMutu[i] = 3.5;
            } else if (nilaiAngka[i] > 65) {
                nilaiHuruf[i] = "B";
                nilaiMutu[i] = 3.0;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
            } else if ( nilaiAngka[i] > 60) {
                nilaiHuruf[i] = "C+";
                nilaiMutu[i] = 2.5;
            } else if (nilaiAngka[i] > 50) {
                nilaiHuruf[i] = "C";
                nilaiMutu[i] = 2.0;
            } else if (nilaiAngka[i] > 39) {
                nilaiHuruf[i] = "D";
                nilaiMutu[i] = 1.0;
            } else {
                nilaiHuruf[i] = "E";
                nilaiMutu[i] = 0.0;
            }
            totalBobot += nilaiMutu[i] * sks[i];
            totalSKS += sks[i];
        }

        double ip = totalBobot / totalSKS;

        System.out.println("\nHasil konversi Nilai");

        System.out.println("===========================================================================");
        System.out.printf("%-40s %-10s %-10s %-10s\n", "MK", "Nilai", "Huruf", "Bobot");

        for(int i = 0; i < mataKuliah.length; i++) {
            System.out.printf("%-40s %-10.2f %-10s %-10.2f\n", mataKuliah[i], nilaiAngka[i], nilaiHuruf[i], nilaiMutu[i]);
        }

        System.out.println("==============================================================================");
        System.out.printf("IP : %.2f\n", ip);

        sc.close();
                             
    }
}
