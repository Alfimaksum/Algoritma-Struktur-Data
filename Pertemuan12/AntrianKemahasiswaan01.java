package Pertemuan12;

public class AntrianKemahasiswaan01 {
    private Node01 front;
    private Node01 rear;
    private int size;
    private final int MAX_SIZE = 50; 

    public AntrianKemahasiswaan01() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }
    public boolean isEmpty() {
        return front == null;
    }
    public boolean isFull() {
        return size == MAX_SIZE;
    }
    public void clear() {
        front = null;
        rear = null;
        size = 0;
        System.out.println("Antrian telah dikosongkan");
    }
    public void daftarMahasiswa(Mahasiswa01 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh! Silakan datang kembali lain waktu.");
            return;
        }

        Node01 newNode = new Node01(mhs);
        if (isEmpty()) {
            front = newNode;
        } else {
            rear.next = newNode;
        }
        rear = newNode;
        size++;
        System.out.println("Mahasiswa " + mhs.getNama() + " berhasil mendaftar antrian");
    }
    public Mahasiswa01 panggilAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return null;
        }

        Mahasiswa01 mhs = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
        return mhs;
    }
    public void lihatAntrianDepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }
        System.out.println("Antrian terdepan:");
        System.out.printf("%-10s %-20s %-15s\n", "NIM", "Nama", "Jurusan");
        front.data.displayInfo();
    }
    public void lihatAntrianBelakang() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }
        System.out.println("Antrian terakhir:");
        System.out.printf("%-10s %-20s %-15s\n", "NIM", "Nama", "Jurusan");
        rear.data.displayInfo();
    }
    public void jumlahAntrian() {
        System.out.println("Jumlah mahasiswa yang mengantri: " + size);
    }
    public void displayAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }

        System.out.println("Daftar Antrian:");
        System.out.printf("%-10s %-20s %-15s\n", "NIM", "Nama", "Jurusan");
        
        Node01 current = front;
        while (current != null) {
            current.data.displayInfo();
            current = current.next;
        }
        System.out.println("Total antrian: " + size);
    }
}