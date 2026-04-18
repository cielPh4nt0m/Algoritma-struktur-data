package CM1;

//menyimpan data buku
public class Buku13 {
 String kodeBuku;
 String judul;
 String tahunTerbit;

  //Konstruktor default dipakai untuk objek tanpa isi data
  public Buku13() {
    }
  
  //Konstruktor berparameter dipakai untuk langusng isi data objek dibuat
  //this milik objek itu sendiri
  public Buku13 (String kodeBuku, String judul, String tahunTerbit){
  this.kodeBuku = kodeBuku;
  this.judul = judul;
  this.tahunTerbit = tahunTerbit;
  }

  //digunakan untuk mengambil buku saja
  public String getJudul(){
    return judul;
  }

  //menampilkan semua data buku
  void tampilBuku13(){
  System.out.println("Kode Buku: " + kodeBuku+ "| Judul: " +judul+ "| Tahun: " +tahunTerbit);
 }
}
