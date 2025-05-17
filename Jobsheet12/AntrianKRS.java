package Jobsheet12;

public class AntrianKRS {
    KRS[] data;
    int front, rear, size, max, count;

    public AntrianKRS(int n) {
        this.max = n;
        this.data = new KRS[max];
        this.size = 0;
        this.front = 0; 
        this.rear = -1;
        this.count = 0;
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
            System.out.println("Antian kosong.");
        } else {
            System.out.println("Mahasiswa terdepan: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[front].tampilkanData();
            data[(front + 1) % max].tampilkanData();
        }
    }

    public void lihatTerakhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Mahasiswa terakhir: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[rear].tampilkanData();
        }
    }    

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        } 
        System.out.println("Daftar Mahasiswa dalam Antrian:");
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

    public void clear() {
        if (!isEmpty()) {
            front = rear = 1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void tambahAntrian(KRS krs) {
        if (isFull()) {
            System.out.println("Antrian penuh, tidak dapat menambah mahasiswa.");
            return;
        } 
        rear = (rear + 1) % max;
        data[rear] = krs;
        size++;
        System.out.println(krs.nama + " berhasil masuk ke antrian.");
    }

    public KRS layaniMahasiswa() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return null;
        }
        KRS krs = data[front];
        front = (front + 1) % max;
        size--;
        count++;
        return krs;
    }

    public void jumlahDilayani() {
        System.out.println("Jumlah yang telah dilayani: " + count);
    }    
}
