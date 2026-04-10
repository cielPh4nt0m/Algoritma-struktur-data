package MINGGU5;
import java.util.Scanner;
public class MahasiswaDemo13 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        MahasiswaBerprestasi13 list = new MahasiswaBerprestasi13();

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jml = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < jml; i++) {
            System.out.println("--- Data Mahasiswa ke-" + (i + 1) + " ---");
            System.out.print("NIM : ");
            String nim = sc.nextLine();
            System.out.print("Nama  : ");
            String nama = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK  : ");
            double ipk = sc.nextDouble();
            sc.nextLine();

            Mahasiswa13 m = new Mahasiswa13(nim, nama, kelas, ipk);
            list.tambah(m); 
            System.out.println();
        } 

         /* MahasiswaBerprestasi13 list = new MahasiswaBerprestasi13();
        Mahasiswa13 m1 = new Mahasiswa13("123", "Zidan", "2A", 3.2);
        Mahasiswa13 m2 = new Mahasiswa13("124", "Ayu", "2A", 3.5);
        Mahasiswa13 m3 = new Mahasiswa13("125", "Sofi", "2A", 3.1);
        Mahasiswa13 m4 = new Mahasiswa13("126", "Sita", "2A", 3.9);
        Mahasiswa13 m5 = new Mahasiswa13("127", "Miki", "2A", 3.7); 

         list.tambah(m1);
         list.tambah(m2);
         list.tambah(m3);
         list.tambah(m4);
         list.tambah(m5);

        System.out.println("Data Mahasiswa sebelum sorting: ");
        list.tampil(); */

        /* System.out.println("Data yang sudah terurut menggunakan sorting berdasarkan IPK (DES)");
        list.bubbleSort();
        list.tampil(); */

      /*  System.out.println("Data yang sudah terurut menggunakan SELECTION SORT(ASC)");
        list.SelectionSort(); 
        list.tampil(); */

        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT(ASC)");
        list.InsertionSort();
        list.tampil(); 
    }
}