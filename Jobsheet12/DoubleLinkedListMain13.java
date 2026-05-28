package Jobsheet12;

// import untuk menggunakan kelas Scanner
import java.util.Scanner;

// method untuk menguji kelas double linked list
public class DoubleLinkedListMain13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DoubleLinkedList13 list = new DoubleLinkedList13();
        int pilihan;

    

      do { 
        System.out.println("\n===== MENU DOUBLE LINKED LIST =====");
        System.out.println("1. Tambah data di awal");
        System.out.println("2. Tambah data di akhir");
        System.out.println("3. Sisipkan data di tengah (setelah NIM");
        System.out.println("4. Hapus data awal");
        System.out.println("5. Hapus data akhir");
        System.out.println("6. Tampilkan data");
        System.out.println("0. Keluar");
        System.out.print("Pilih menu : ");
        pilihan = scan.nextInt();
        scan.nextLine();
      switch(pilihan) {
        case 1:
            Mahasiswa13 mhsAwal = inputMahasiswa(scan);
            list.addFirst(mhsAwal);
            break;
        case 2:
            Mahasiswa13 mhsAkhir = inputMahasiswa(scan);
            list.addLast(mhsAkhir);
            break;
        case 3:
            System.out.print("Masukkan NIM yang dicari: "); 
            String keyNim = scan.nextLine(); 
            System.out.println("Masukkan data baru: ");
            Mahasiswa13 dataBaru = inputMahasiswa(scan); 
            list.insertAfter(keyNim, dataBaru); 
            break; 
        case 4:
            list.removeFirst();
            break;
        case 5:
            list.removeLast();
            break;
        case 6: 
            list.print();
            break;
        case 7:
          System.out.println("Cetak Data Terbalik (Mundur):");
          list.printReverse();
          break;
        case 0:
            System.out.println("Program selesai.");
            break;
        default:
            System.out.println("Menu tidak valid");
      }
      } while (true);
    }

    public static Mahasiswa13 inputMahasiswa(Scanner scan) { 
    System.out.print("Masukkan NIM   : ");
    String nim = scan.nextLine();
    
    System.out.print("Masukkan Nama  : ");
    String nama = scan.nextLine();
    
    System.out.print("Masukkan Kelas : ");
    String kelas = scan.nextLine();
    
    System.out.print("Masukkan IPK   : ");
    double ipk = scan.nextDouble();
    scan.nextLine(); 
    
    // Memanggil konstruktor class Mahasiswa13
    return new Mahasiswa13(nim, nama, kelas, ipk); 
}
}