package CM1;

//penyimpanan data peminjaman
public class Peminjaman13 {
    Mahasiswa13 mhs;
    Buku13 buku ;
    int lamaPinjam = 5;
    int batasPinjam;
    int terlambat;
    int denda;
    
    //konstruktor default digunakan untuk memanggil objek tanpa isi data
     Peminjaman13() {
    }
    
    //konstruktor berparameter digunakan saat menbuat transaksi
    public Peminjaman13(Mahasiswa13 mhs, Buku13 buku, int lamaPinjam) {
        this.mhs = mhs;
        this.buku = buku;
        this.lamaPinjam = lamaPinjam;
    }

    // method hitung denda
    void hitungDenda(){
        if (lamaPinjam > batasPinjam){
            terlambat = lamaPinjam - batasPinjam;
            denda = terlambat * 2000;
        } else {
            terlambat = 0;
            denda = 0;
        }
    }
    
    //method tampil peminjaman
    void tampilPeminjaman() {
    System.out.printf("%-6s | %-12s | Lama: %-2d | Terlambat: %-1d | Denda: %d\n",
        mhs.getnama(),
        buku.getJudul(),
        lamaPinjam,
        terlambat,
        denda
    );
}
    
}
