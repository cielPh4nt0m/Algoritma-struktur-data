package MINGGU3;
import java.util.Scanner; //library untuk input data dari user
public class DosenDemo13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dosen13[] arrayOfDosen13 = new Dosen13[3]; // Membuat Array of Object untuk 3 dosen
        
       //LOOP For untuk input data Dosen
        for (int i = 0; i < arrayOfDosen13.length; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode          : ");
            String kode = sc.nextLine();
            System.out.print("Nama          : ");
            String nama = sc.nextLine();
            System.out.print("Jenis Kelamin : ");
            String jkInput = sc.nextLine();
            boolean jenisKelamin = jkInput.equalsIgnoreCase("Wanita"); // Logika agar input user lebih intuitif (Pria/Wanita)
            System.out.print("Usia          : ");
            int usia = Integer.parseInt(sc.nextLine());
            arrayOfDosen13[i] = new Dosen13(kode, nama, jenisKelamin, usia); // Instansiasi objek ke dalam array
            System.out.println("---------------------------------------");
        }
        // Loop FOREACH untuk menampilkan data
       for (int i = 0; i < 3; i++) {
           System.out.println("Data Dosen  ke-" + (i +1));
           System.out.println("Kode              : "+ arrayOfDosen13[i].kode);
           System.out.println("Nama              : "+ arrayOfDosen13[i].nama);
           System.out.println("Jenis Kelamin     : "+ arrayOfDosen13[i].jenisKelamin);
           System.out.println("Usia            : "+ arrayOfDosen13[i].usia);
           System.out.println("-----------------------------------------");

       }
    }
}
