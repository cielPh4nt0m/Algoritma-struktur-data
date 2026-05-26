package Jobsheet11;
import java.util.Scanner;

public class AntrianMain13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueLinkedList13 antrianLayan = new QueueLinkedList13(5);
        int pilihan;

        do { 
            System.out.println("\n----- Sistem antrian layanan mahasiswa -----");
            System.out.println("1. Daftrakan mahasiswa ke antrian");
            System.out.println("2. Panggil/layani antrian terdepan");
            System.out.println("3. Cek jumlah mahasiswa yang mengantre");
            System.out.println("4. Lihat antrian terdepan & paling akhir");
            System.out.println("5. Tampilkan seluruh daftar antrian");
            System.out.println("6. Cek status antrian (kosong/penuh)");
            System.out.println("7. Kosongkan seluruh antrian");
            System.out.println("8. keluar program");
            System.out.print("Pilih Menu (1-8): ");
            pilihan = sc.nextInt();
            sc.nextLine();

        switch (pilihan) {
            case  1:
                if (antrianLayan.isFull()) {
                    System.out.println("Antrian sudah penuh! silahkan tunggu beberapa saat");
                } else {
                    System.out.println("\n--- Pendaftaran data mahaasiswa ---");
                    System.out.print("NIM          : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama         : ");
                    String nama = sc.nextLine();
                    System.out.print("Keperluan    : ");
                    String keperluan = sc.nextLine();

                    Mahasiswa213 mhsBaruMahasiswa213 = new Mahasiswa213(nim, nama, keperluan);
                    antrianLayan.enqueue(mhsBaruMahasiswa213);
                }
                break;

            case 2:
                antrianLayan.dequeue();
                break;
            case 3:
                System.out.println("Jumlah mahasiswa yang masih mengantri: " + antrianLayan.getSize() + " orang.");
                break;
            case 4: 
                antrianLayan.tampilTerdepanDanTerakhir();
                break;
            case 5:
                antrianLayan.print();
                break;
            case 6:
                System.out.println("Apakah antrian kososng? " + (antrianLayan.isEmpty() ? "Ya" : "Tidak"));
                System.out.println("Apakah antrian penuh? " + (antrianLayan.isFull() ? "Ya" : "Tidak"));
                break;
            case 7:
                System.out.print("Apakah ingin mengosongkan antrian? (y/n): ");
                String konfirmasi = sc.nextLine();
                if (konfirmasi.equalsIgnoreCase("y")) {
                    antrianLayan.clear();
                } else {
                    System.out.println("Pengososngan antrian dibatalkan.");
                }
                break;
            case 8:
                System.out.println("Terima kasih! telah menggunakan program ini");
                break;
            
                default:
                    System.out.println("Pilihan tidak valid silahkan masukan angka 1-8");
        }
        } while (pilihan != 8);

        sc.close();
    }
}
