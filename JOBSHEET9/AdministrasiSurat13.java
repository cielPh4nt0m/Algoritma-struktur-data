package JOBSHEET9;

import java.util.Scanner;
public class AdministrasiSurat13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackSurat13 kotakSurat = new StackSurat13(10);
        int pilih;

        do {
            System.out.println("\n--- Menu Admin Prodi ---");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat (Validasi)");
            System.out.println("3. Lihat Surat Terakhir");
            System.out.println("4. Cari Surat Berdasarkan Nama");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine(); // Pembersihan buffer 

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: "); String id = sc.nextLine();
                    System.out.print("Nama: "); String nama = sc.nextLine();
                    System.out.print("Kelas: "); String kls = sc.nextLine();
                    System.out.print("Jenis (S/I): "); char jns = sc.next().charAt(0);
                    System.out.print("Durasi (hari): "); int dur = sc.nextInt();
                    kotakSurat.push(new Surat13(id, nama, kls, jns, dur));
                    break;
                case 2:
                    Surat13 s = kotakSurat.pop();
                    if (s != null) System.out.println("Memproses surat milik: " + s.namaMahasiswa);
                    else System.out.println("Tidak ada surat untuk diproses.");
                    break;
                case 3:
                    Surat13 top = kotakSurat.peek();
                    if (top != null) System.out.println("Surat teratas: " + top.namaMahasiswa);
                    break;
                case 4:
                    System.out.print("Masukkan nama yang dicari: ");
                    String cari = sc.nextLine();
                    kotakSurat.cariSurat13(cari);
                    break;
            }
        } while (pilih >= 1 && pilih <= 4);
    }
}
