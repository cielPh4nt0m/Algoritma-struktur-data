package T1Jobsheet10;

public class QueueKRS13 {
    Mahasiswa13[] data;
    int front;
    int rear;
    int size;
    int max;
    int sudahKRS;
    int totalKapasitasDPA = 30;

public QueueKRS13(int n) {
    max = n;
    data =  new Mahasiswa13[max];
    size = 0;
    front = 0;
    rear = -1;
    sudahKRS = 0;
}

// Cek antrian kosong
public boolean isEmpty() {
    return size == 0;
}

// cek antrian penuh
public boolean isFull() {
    return size == max;
}

// mengosongkan antrian
public void clear() {
    front = 0;
    rear = -1;
    size = 0;
    System.out.println("Antrian berhasil dikosongkan");
}

// Menambahkan antrian
public void tambahAntrian(Mahasiswa13 mhs) {
    if (!isFull()) {
        rear = ( rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println("Mahasiswa " + mhs.nama + " berhasil masuk ke antrian");
    } else {
        System.out.println("Gagal tambah! Antrian sudah penuh (maks 10).");
    }
 }

 // Memanggil antrian untuk proses KRS
 public void panggilKRS() {
    if (isEmpty()) {
        System.out.println("Antrian kosong! tidak ada mahasiswa yang di panggil");
        return;
    }

    System.out.println("=== MEMANGGIL MAHASISWA UNTUK PROSES KRSS ===");
    int jumlahDipanggil = (size >= 2) ? 2 : 1;

    for (int i = 0; i < jumlahDipanggil; i++) {
        Mahasiswa13 mhs = data[front];
        System.out.print("Diproses: ");
        mhs.tampilkanData();

        front = (front + 1) % max;
        size --;
        sudahKRS++;
    }

    if (isEmpty()) {
        front = 0;
        rear = -1;
    }
 }

 // Menampilkan semua antrian
 public void tampilkanSemua() {
    if (!isEmpty()) {
        System.out.println("--- DAFTAR SEMUA ANTRIAN KRS ---");
        int i = front;
        int count = 0;
        while (count < size) {
            System.out.print((count + 1) + ". ");
            data[i].tampilkanData();
            i = (i + 1) % max;
            count++;
        }
    } else {
        System.out.println("Antrian kosong");
    }
 }

 // Menampilkan 2 antrian terdepan
 public void tampilkanDuaTerdepan() {
    if (isEmpty()) {
        System.out.println("Antrian kosong");
        return;
    }
    System.out.println("--- 2 ANTRIAN TERDEPAN ---");
    System.out.print("1. ");
    data[front].tampilkanData();

    if (size >= 2) {
        int indeksKedua = (front + 1) %  max;
        System.out.print("2. ");
        data[indeksKedua].tampilkanData();
    }
 }

 // Menampilkan antrian paling akhir
 public void tampilkanPalingAkhir() {
    if (!isEmpty()) {
        System.out.println("--- ANTRIAN PALING AKHIR ---");
        data[rear].tampilkanData();
    } else {
        System.out.println("Antrian kosong!");
    }
 }

 // jumlah antrian saat ini
 public void cetakJumlahAntrian() {
    System.out.println("Jumlalh mahasiswa dalam antrian saat ini: " + size);
 }

 // cetak KRS berdasarkan Sudah ada KRS / belum ada KRS berdasarkan kuota DPA)
 public void cetakStatistikKRS() {
    int belumKRS = totalKapasitasDPA - sudahKRS;
    System.out.println("--- STATISTIK PROSES KRS OLEH DPA ---");
    System.out.println("Jumlah mahasiswa SUDAH proses KRS : " + sudahKRS);
    System.out.println("Sisa mahasiswa BELUM proses KRS : " + (belumKRS < 0 ? 0 : belumKRS) + " dari kuota 30 mahasiswa");
 }
}
