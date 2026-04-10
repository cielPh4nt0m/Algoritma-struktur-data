package MINGGU5;
import java.util.Scanner;
public class DosenMain13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen13 dd = new DataDosen13(); // Pastikan class DataDosen sudah dibuat
        int pilih;
        do {
            System.out.println("\n=== MENU DATA DOSEN ===");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampil Data");
            System.out.println("3. Sorting ASC (Bubble Sort)");
            System.out.println("4. Sorting DSC (Selection/Insertion)");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            
            while (!sc.hasNextInt()) {
                System.out.println("Masukkan angka saja!");
                sc.next();
            }
            pilih = sc.nextInt();
            sc.nextLine(); 

            switch (pilih) {
                case 1:
                    System.out.print("Kode         : "); String kd = sc.nextLine();
                    System.out.print("Nama         : "); String nm = sc.nextLine();
                    System.out.print("JK (P/W)     : "); String jkStr = sc.nextLine();
                    boolean jk = jkStr.equalsIgnoreCase("P");
                    System.out.print("Usia         : "); int us = sc.nextInt();
                    dd.tambah(new Dosen13(kd, nm, jk, us));
                    break;
                case 2:
                    System.out.println("\n--- Daftar Dosen ---");
                    dd.tampil();
                    break;
                case 3:
                    dd.sortingASC();
                    System.out.println("Data berhasil diurutkan termuda ke tertua.");
                    break;
                case 4:
                    dd.sortingDSC(); 
                    System.out.println("Data berhasil diurutkan tertua ke termuda.");
                    break;
                case 5:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Menu tidak tersedia.");
            }
        } while (pilih != 5);
        sc.close();
    }
}