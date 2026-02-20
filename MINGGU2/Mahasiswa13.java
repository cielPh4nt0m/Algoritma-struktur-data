package MINGGU2;

 public class Mahasiswa13 {
    String nama;
    String nim;
    String kelas;
    double ipk;

    public Mahasiswa13() {
    }

 void tampilkanInformasi () {
    System.out.println("Nama: " + nama);
    System.out.println("NIM: "  + nim);
    System.out.println("IPK: " + ipk);
    System.out.println("Kelas: " + kelas);
 }

 void ubahKelas(String kelasBaru) {
    kelas = kelasBaru;
  }

 void updateIpk (double ipkBaru) {
    ipk = ipkBaru;
  }
 
  String nilaiKinerja() {
    if (ipk >= 3.5) {
        return "kinerja sangat baik";
    } else if (ipk >= 3.0) {
        return "kinerja baik";
    } else if (ipk >= 2.0) {
        return "kinerja cukup";
    } else {
        return "kinerja kurang";
    }
  }

  public Mahasiswa13(String nm, String nim, String kelas, double ipk) {
    this.nama = nm;
    this.nim = nim;
    this.kelas = kelas;
    this.ipk = ipk;
  }
  
  Mahasiswa13 mhsFadilaMayamasita = new Mahasiswa13("Fadila Mayamasita", "254107020012", "TI 1C", 3.23);

}

 