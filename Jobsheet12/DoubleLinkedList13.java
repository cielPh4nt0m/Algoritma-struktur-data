package Jobsheet12;

public class DoubleLinkedList13 {
    Node13 head;
    Node13 tail;

// constructor untuk menginisialisasi double linked list
public DoubleLinkedList13() {
    this.head = null;
    this.tail = null;
 }

// isEmpty untuk mengecek apakah double linked list kosong atau tidak
 public boolean isEmpty() {
    return head == null;
 }

 // addFirst untuk menambahkan data mahasiswa di awal double linked list
 public void addFirst(Mahasiswa13 data) {
    Node13 newNode = new Node13(data);
    if (isEmpty()) {
        head = tail = newNode;
    } else {
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
 }

//addLast untuk menambahkan data mahasiswa di akhir double linked list
 public void addLast(Mahasiswa13 data) {
   Node13 newNode = new Node13(data);
   if (isEmpty()) {
        head = tail = newNode;
   } else {
    tail.next = newNode;
    newNode.prev = tail;
    tail = newNode;
   }
 }

 //InsertAfter untuk menambahkan data mahasiswa setelah data tertentu di double linked list
 public void insertAfter(String keyNim, Mahasiswa13 data) {
    Node13 current = head; 
    
    while (current != null && !current.data.nim.equals(keyNim)) { 
        current = current.next; 
    }
    
    if (current == null) { 
        System.out.println("Data dengan NIM " + keyNim + " tidak ditemukan."); 
        return; 
    }

    Node13 newNode = new Node13(data); 
    
    
    if (current == tail) { 
        newNode.prev = current; 
        current.next = newNode; 
        tail = newNode; 
    } else { 
        newNode.prev = current; 
        newNode.next = current.next; 
        current.next.prev = newNode; 
        current.next = newNode; 
    }
    System.out.println("Data berhasil disisipkan setelah NIM " + keyNim); 
}

 // method untuk menghapus data mahasiswa di awal double linked list
 public void removeFirst() {
    if(isEmpty()) {
        System.out.println("Linked list kosong..");
        return;
    }
    System.out.println("Data berhasil dihapus");
    head.data.tampil();
    System.out.println();
    
    if (head == tail) {
        head = tail = null;
    } else {
        head = head.next;
        head.prev = null;
    }
 }

 // method untuk menghapus data mahasiswa di akhir double linked list
 public void removeLast() {
    if (isEmpty()) {
        System.out.println("Linked list kosong.");
        return;
    }

    System.out.println("Data berhasil dihapus.");
    tail.data.tampil();
    System.out.println();

    if (head == tail)  {
        head = tail = null;
    } else {
        tail = tail.prev;
        tail.next = null;
    }
 }

 // method untuk menampilkab data secara terbalik dari tail ke head
 public void printReverse() {
    if (isEmpty()) {
        System.out.println("Linked list masih koasong");
        return;
    }

    Node13 current = tail;

    while (current != null) {
        current.data.tampil();
        current = current.prev;
    }
 }

 // print untuk menampilkan data mahasiswa di double linked list
 public void print() {
    if (isEmpty()) {
        System.out.println("Linked list masih kosong");
        return;
    }
    Node13 current = head;
    while (current != null) {
        current.data.tampil();
        current = current.next;
    }
 }

 
 }

