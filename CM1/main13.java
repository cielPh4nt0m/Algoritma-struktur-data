package CM1;
import java.util.Scanner;

public class main13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // menginisialisasi data mahasiswa
        Mahasiswa13[] mhs = {
            new Mahasiswa13("22001", "Andi","Teknik Informatika"),
            new Mahasiswa13("22002", "Budi", "Teknik Informatika"),
            new Mahasiswa13("22003", "Citra", "Sistem Informasi Bisnis")
        };

        // data Buku
        Buku13[] buku = {
            new Buku13("B001", "Algoritma", "2020"),
            new Buku13("B002", "Basis Data", "2019"),
            new Buku13("B003", "Pemrograman", "2021"),
            new Buku13("B004", "Fisika", "2024")
        };

        // data peminjaman
        Peminjaman13[] pinjam = {
            new Peminjaman13(mhs[0], buku[0], 7),
            new Peminjaman13(mhs[1], buku[0], 3),
            new Peminjaman13(mhs[2], buku[0], 10),
            new Peminjaman13(mhs[2], buku[0], 6),
            new Peminjaman13(mhs[0], buku[0], 4)
        };

        int pilih;
        //mengulang menu terus - menerus sampai user memilih keluar
        do {
            // Menampilkan Menu
            System.out.println("\n=== SISTEM PEMINJAMAN RUANG BACA JTI ===");
            System.out.println("1. Tampilkan Mahasiswa");
            System.out.println("2. Tampilkan Buku");
            System.out.println("3. Tampilkan Peminjaman");
            System.out.println("4. Urutkan Berdasarkan Denda");
            System.out.println("5. Cari Berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine(); // buang enter

            // Menentukan aksi berdasarkan user
            switch (pilih) {
                case 1:
                    System.out.println("Daftar Mahasiswa");
                    for (Mahasiswa13 m : mhs) {
                        m.tampilMahasiswa13();
                    }
                    break;
                case 2:
                    System.out.println("Daftar Buku");
                    for (Buku13 b : buku) {
                        b.tampilBuku13();
                    }
                    break;
                case 3:
                    System.out.println("Data Peminjaman");
                    for (Peminjaman13 p : pinjam) {
                        p.hitungDenda();
                        p.tampilPeminjaman();
                    }
                    break;
                case 4:
                    // bubble sort berdasarkan denda
                    for (Peminjaman13 p : pinjam) {
                        p.hitungDenda();
                    }
                    for (int i = 0; i < pinjam.length - 1; i++) {
                        for (int j = 0; j < pinjam.length - 1 - i; j++) {
                            if (pinjam[j].denda < pinjam[j + 1].denda) {
                                Peminjaman13 temp = pinjam[j];
                                pinjam[j] = pinjam[j + 1];
                                pinjam[j + 1] = temp;
                            }
                        }
                    }
                    System.out.println("Setelah diurutkan (Denda Terbesar)");
                    for (Peminjaman13 p : pinjam) {
                        p.tampilPeminjaman();
                    }
                    break;
                case 5:
                    // sequential search
                    System.out.print("Masukkan NIM: ");
                    String cariNim = sc.nextLine();
                    boolean ketemu = false;
                    for (Peminjaman13 p : pinjam) {
                        if (p.mhs.nim.equals(cariNim)) {
                            p.hitungDenda();
                            p.tampilPeminjaman();
                            ketemu = true;
                        }
                    }
                    if (!ketemu) {
                        System.out.println("Data Peminjaman tidak ditemukan");
                    }
                    break;
            }
        } while (pilih != 0);
    }
}

