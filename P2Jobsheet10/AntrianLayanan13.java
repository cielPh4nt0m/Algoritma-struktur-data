package P2Jobsheet10;

public class AntrianLayanan13 {
    Mahasiswa13[] data; //Array menampung Objek Mahasiswa
    int front;
    int rear;
    int size;
    int max;
    
    // Constructor Antrean
    public AntrianLayanan13(int max) {
        this.max = max;
        this.data = new Mahasiswa13[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void lihatTerdepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.print("Mahasiswa terdepan: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[front].tampilkanData();
        }
    }
 
   public void tampilkanSemua() {
    if (isEmpty()) {
        System.out.println("Antrian kosong.");
        return;
    }
    System.out.println("Daftar Mahasiswa dalam antrian:");
    System.out.println("NIM - NAMA - PRODI - KELAS");
    for (int i = 0; i < size; i++) {
        int index = (front + i) % max;
        System.out.print((i + 1) + ". ");
        data[index].tampilkanData();
    }
   }

   public int getJumlahAntrian() {
    return size;
   }

    // Mengosongkan total antrean
    public void clear() {
        if (!isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    
    public void tambahAntrian13(Mahasiswa13 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh, tidak dapat menambah mahasiswa.");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + "Berhasil massuk ke antrian");
    }


    public Mahasiswa13 layaniMahasiswa13() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return null;
        }
        Mahasiswa13 mhs = data[front];
        front = (front + 1) % max;
        size--;
        return mhs;
    }

    // modifikasi lihatAkhir
    public void lihatAkhir() {
        if (!isEmpty()) {
            System.out.println("Antrian paling belakang: ");
            data[rear].tampilkanData();
        } else {
            System.out.println("Antrian masih kosong!");
        }
    }
}


    
    