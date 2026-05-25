package Jobsheet11;
/* import java.util.Scanner; */

public class SLLMain13 {
    public static void main(String[] args) {
        SingleLinkedList13 sll = new SingleLinkedList13();
       /*  Scanner sc = new Scanner(System.in); */


        // 1. Membuat objek mahasiswa
         Mahasiswa13 mhs1= new Mahasiswa13("24212200", "Alvaro", "1A", 4.0);
        Mahasiswa13 mhs2 = new Mahasiswa13("23212201", "Bimon", "2B", 3.8);
        Mahasiswa13 mhs3 = new Mahasiswa13("22212202", "Cintia", "3C", 3.5);
        Mahasiswa13 mhs4 = new Mahasiswa13("21212203", "Dirga", "4D", 3.6); 

        // 2. Pemanggilan method linked list
        sll.print();
        sll.addFirst(mhs4);
        sll.print();
        sll.addLast(mhs1);
        sll.print();
        sll.insertAfter("Dirga", mhs3); 
        sll.insertAt(2, mhs2);
        sll.print();  

        System.out.println("data index 1 : ");
        sll.getData(1);

        System.out.println("data mahasiswa an Bimon berada pada index : "+sll.indexOf("bimon"));
        System.out.println();

        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();

       /*   System.out.println("--- Input Data Mahasiswa ke linked list ---");
         System.out.print("Masukkan jumlah mahasiswa yang ingin diinput: ");
         int jumlah = sc.nextInt();
         sc.nextLine(); 
 
        for (int i = 0; i < jumlah; i++) {
         System.out.println("\nData Mahasiswa ke-" + (i + 1));
         System.out.print("NIM   : ");
         String nim = sc.nextLine(); 
         System.out.print("Nama  : ");
         String nama = sc.nextLine(); 
         System.out.print("Kelas : ");
         String kelas = sc.nextLine(); 
         System.out.print("IPK   : ");
         double ipk = sc.nextDouble();
         sc.nextLine(); 
        
        Mahasiswa13 mhs = new Mahasiswa13(nim, nama, kelas, ipk);
        sll.addLast(mhs);
    }

        System.out.println("\n--- Hasil Traverser linked list ---");
        sll.print();

        sc.close(); */

       
    }
}