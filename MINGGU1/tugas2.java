package MINGGU1;
//import scanner : dipakai membaca input dari user
import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan jumlah jadwal kuliah: ");
        int kuliah = sc.nextInt();
        //enter dibuang 
        sc.nextLine();

        //memasukkakn input jumlah jadwal kuliah : user memasukkan beberapa banyak jadwal(kulaih).
        String[][] jadwal = new String[kuliah][4];
             
           ScannerJadwal(jadwal, kuliah, sc);
           tampilSemua(jadwal, kuliah);
           berdasarkanHari(jadwal, kuliah, sc);
           berdasarkanMataKuliah(jadwal, kuliah, sc);

        sc.close();
    }

        // Fungsi input jadwal kuliah
        static void ScannerJadwal(String[][] jadwal, int kuliah, Scanner sc) {
            System.out.println("\n==== INPUT DATA JADWAL ====");
            for (int i = 0; i < kuliah; i++) {
            System.out.println("\n jadwal ke-" + (i + 1));
              System.out.print("Nama Mata Kuliah : ");
              jadwal[i][0] = sc.nextLine();
              System.out.print("Ruang            : ");
              jadwal[i][1] = sc.nextLine();
              System.out.println("Hari            : ");
              jadwal[i][2] = sc.nextLine();
              System.out.println("Jam             : ");
              jadwal[i][3] = sc.nextLine();
            }
        }

        //menampilkan semua jadwal dalam bentuk tabel
         static void tampilSemua(String[][] jadwal, int kuliah) {
            System.out.println("\n ==== SEMUA JADWAL KULIAH ====");
            System.out.printf("%-20s %-15s %-10s\n", "Mata Kuliah", "Ruang", "Hari", "Jam");
            System.out.println("-------------------------------------------------------------------------");

            for (int i = 0; i < kuliah; i++) {
                 System.out.printf("%-20s %-15s %-10s %-10s\n", jadwal[i][0], jadwal[i][1], jadwal[i][2], jadwal[i][3]);
            }
         }

         //mencari berdasarkan hari
         static void berdasarkanHari(String[][] jadwal, int kuliah, Scanner sc){
            System.out.println("\nMASUKKAN HARI YANG DICARI");
            String cariHari = sc.nextLine();
            boolean ditemukan = false;

            System.out.println("\n==== JADWAL HARI " + cariHari + " ====");

            for (int i = 0; i < kuliah; i++) {
                if (jadwal[i][2].equalsIgnoreCase(cariHari)) {
                    System.out.printf("%-20s %-15s %-10s %-10s\n", jadwal[i][0], jadwal[i][1], jadwal[i][2], jadwal[i][3]);
                    ditemukan = true;
                }
            }

            if (!ditemukan) {
                System.out.println("Tidak ada jadwal untuk hari " + cariHari);
            }
         }

         //mencari berdasarkan nama mata kuliah
          static void berdasarkanMataKuliah(String[][] jadwal, int kuliah, Scanner sc) {
            System.out.println("\nMasukkan nama mata kuliah yang dicari: ");
            String cariMatkul = sc.nextLine();
            boolean ditemukan = false;

            System.out.println("\n==== Hasil yang dicari ===");

            for (int i = 0; i < kuliah; i++) {
                if (jadwal[i][0].equalsIgnoreCase(cariMatkul)) {
                    System.out.println("Ruang: " + jadwal[i][1]);
                    ditemukan = true;
                    System.out.println("Hari: " + jadwal[i][2]);
                    ditemukan = true;
                    System.out.println("jam: " + jadwal[i][3]);
                    ditemukan = true;
                }
            }
            if (!ditemukan) {
                System.out.println("Tidak ada jadwal untuk mata kuliah " + cariMatkul);
            }
          } 

}
