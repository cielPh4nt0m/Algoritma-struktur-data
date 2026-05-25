package T1Jobsheet10;

import java.util.Scanner;
public class MainKRS13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            QueueKRS13 antrianKRS13 = new QueueKRS13(10);
            
            int pilihan;
            do { 
                System.out.println("=== SISTEM ANTRIAN PERSETUJUAN KRS OLEH DPA ===");
                System.out.println("1. Tambah Mahasiswa Ke Antrian");
                System.out.println("2. Panggil Mahasiswa Untuk KRS");
                System.out.println("3. Lihat Semua Antrian");
                System.out.println("4. Lihat 2 Antrian Terdepan");
                System.out.println("5. Lihat Antrian Paling Akhir");
                System.out.println("6. Cetak Jumlah Baris Saat Ini");
                System.out.println("7. Cetak Statistik KRS ( sudah / belum KRS)");
                System.out.println("8. Kosongkan Antrian");
                System.out.println("0. Keluar Program");
                System.out.print("Pilih menu: ");
                pilihan = sc.nextInt();
                sc.nextLine();

            switch (pilihan) {
             case 1:
                System.out.print("NIM   : "); 
                String nim = sc.nextLine();
                System.out.print("Nama  : ");
                String nama =  sc.nextLine();
                System.out.print("Prodi  : ");
                String prodi = sc.nextLine();
                System.out.print("Kelas  : ");
                String kelas = sc.nextLine();
               Mahasiswa13 mhs = new Mahasiswa13(nim, nama, prodi, kelas);
                antrianKRS13.tambahAntrian(mhs);
                break;
             case 2:
                antrianKRS13.panggilKRS();
                break;
             case 3:
                antrianKRS13.tampilkanSemua();
                break;
             case 4:
                antrianKRS13.tampilkanDuaTerdepan();
                break;
             case 5:
                antrianKRS13.tampilkanPalingAkhir();
                break;
             case 6:
                antrianKRS13.cetakJumlahAntrian();
                break;
             case 7:
                antrianKRS13.cetakStatistikKRS();
                break;
             case 8:
                antrianKRS13.clear();
                break;
             case 0:
                System.out.println("Program selesai. Terima kasih");
                break;
             default:
                System.out.println("Pilihan tidak valid! Silahkan pilih menu kembali");
                }
            } while (pilihan !=0);

            sc.close();
    }
    
}
