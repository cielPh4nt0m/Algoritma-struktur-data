package JOBSHEET9;

public class StackSurat13 {
    Surat13[] tumpukan;
    int size, top;

public StackSurat13(int size) {
    this.size = size;
    this.tumpukan = new Surat13[size];
    this.top =  -1; // -1 tumpukan masih kosong
}

// pengecekan apakah kotak penuh 
public boolean isFull() {
    return top  == size -1;
}

// pengecekan apakah kotak kosong
public boolean isEmpty() {
    return top  == -1;
}

// 1. menerima surat (push)
public void push(Surat13 s) {
    if (!isFull()) {
        top++;
        tumpukan[top] = s;
    } else {
        System.out.println("Kotak Penuh! tidak bisa menerima surat lagi.");
    }
}

// 2. proses Surat (pop)
public Surat13 pop() {
    if (!isEmpty()) {
        Surat13 s = tumpukan[top];
        top--;
        return s;
    }
    return null;
}

// 3. melilhat surat terakhir (peek)
public Surat13 peek() {
    if (!isEmpty()) {
        return tumpukan[top];
    }
    return null;
}

// 4. mencari surat berdasarkan nama (Linear Search)
public void cariSurat13(String nama) {
    boolean ketemu = false;
    for (int i = top; i >= 0; i--) {
        if (tumpukan[i].namaMahasiswa.equalsIgnoreCase(nama)) {
            System.out.println("Surat ditemukan pada posisi ke-" + (top - i + 1) + "dari atas.");
            System.out.println("ID: " + tumpukan[i].idSurat + " | Alasan: " + tumpukan[i].jenisIzin);
            ketemu = true;
            break;
        }
    }
    if (!ketemu) System.out.println("Surat atas nama" + nama + "tidak ditemukan.");
}
}
