package Jobsheet11;

public class QueueLinkedList13 {
    private NodeMahasiswa213 head;
    private NodeMahasiswa213 tail;
    private int size;
    private int maxCapacity;

public QueueLinkedList13(int maxCapacity) {
    this.head = null;
    this.tail = null;
    this.size = 0;
    this.maxCapacity = maxCapacity;
}

// method cek antrian kosong (queue)
public boolean isEmpty() {
    if (size == 0) {
        return true;
    } else {
        return false;
    }
 }

// method cek antrian penuh (queue)
public boolean isFull() {
    if (size == maxCapacity) {
        return true;
    } else {
        return false;
    }
}

// method mengosongkan antrian (queue)
public void clear() {
   head = null;
   tail = null;
   size = 0;
   System.out.println("Antrian telah dikosong!");
}

//  method menambahkan antrian (Enqueue)
public void enqueue(Mahasiswa213 mhs) {
    if(isFull()) {
        System.out.println("Maaf antrian penuh tidak dapat menambahkan data saat ini!");
        return;
    }
    NodeMahasiswa213 newNode = new NodeMahasiswa213(mhs);
    if (isEmpty()) {
        head = newNode;
        tail = newNode;
   } else {
    tail.next = newNode;
    tail = newNode;
   }
   size++;
   System.out.println(mhs.nama + "Berhasil masuk ke dalam antrian");
 }

// method memanggil / mengeluarkan antrian terdepan (dequeue)
public void dequeue() {
    if (isEmpty()) {
        System.out.println("Antrian kosong! tidak ada mahasiswa yang dapat dipanggil");
        return;
    }

    Mahasiswa213 mhsDipanggil = head.data;
    head = head.next;
    size--;
    
    if (head == null) {
        tail = null;
    }
    System.out.println("--- Memanggil Antrian ---");
    mhsDipanggil.tampilkanData();
    System.out.println("Silahkan menuju ke loket unit kemahasiswaan ");
}

// method menampilkan antrian terdepan dan paling akhir
public void tampilTerdepanDanTerakhir() {
    if (isEmpty()) {
        System.out.println("Antrian kosonng.");
        return;
    }
    System.out.println("--------------------------------");
    System.out.println("[ANTRIAN TERDEPAN]");
    head.data.tampilkanData();
    System.out.println("[ANTREAN BELAKANG]");
    tail.data.tampilkanData();
    System.out.println("--------------------------------");
}

// method menampilkan jumlah mahasiswa yang masih mengantri
public int getSize() {
    return size;
}

// method menampilkan seluru isi antrian saat ini
public void print() {
    if (isEmpty()) {
        System.out.println("Antrian saat ini masih kosong");
        return;
    }
    System.out.println("\n---DAFTAR MAHASISWA DALAM ANTRIAN---");
    NodeMahasiswa213 current = head;
    int no = 1;
    while (current != null) {
        System.out.println("No. Antrian: " + no);
        current.data.tampilkanData();
        System.out.println("------------------------------------");
        current = current.next;
        no++;
    }

}
}