package Jobsheet12;

//method untuk menyimpan data mahasiswa
public class Node13 {
    Mahasiswa13 data;
    Node13 prev;
    Node13 next;

    // constructor untuk menginisialisasi data mahasiswa
    public Node13(Mahasiswa13 data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
