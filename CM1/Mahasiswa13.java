package CM1;

//menhyimpan data mahasiswa
public class Mahasiswa13 {
    String nim;
    String nama;
    String prodi;
    
    //Konstruktor default digunakan untuk membuat objek tanpa langsung isi data
    public Mahasiswa13() {
    }

    //Konstruktor berparameter digunakan langsung mengisi data saat objek dibuat
    //this berarti atribut milik objek itu sendiri
    public Mahasiswa13(String nim, String nama, String prodi){
       this.nim = nim;
       this.nama = nama;
       this.prodi = prodi;
    }

    //menampilkan nama mahasiswa karena sebelumnya tampilannya nama hanya sebuah object
    //mengambil nilai saja (get)
    public String getnama() {
        return nama;
    }

    //menampilkan semua data mahasiswa
    void tampilMahasiswa13(){
        System.out.println("NIM: " + nim + " | Nama: " +nama + " | Prodi: " + prodi);
        
    }
}


