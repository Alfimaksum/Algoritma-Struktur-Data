package Minggu7;

public class MahasiswaBerprestasi {
    private Mahasiswa[] listMhs;
    private int size;
    private int capacity;

    // Konstruktor dengan kapasitas dinamis
    public MahasiswaBerprestasi(int capacity) {
        this.capacity = capacity;
        this.listMhs = new Mahasiswa[capacity];
        this.size = 0;
    }

    public void tambah(Mahasiswa mhs) {
        if (size < capacity) {
            listMhs[size] = mhs;
            size++;
        } else {
            System.out.println("Data mahasiswa sudah penuh!");
        }
    }

    public void tampilSemua() {
        System.out.println("\n=== DAFTAR MAHASISWA (" + size + " data) ===");
        for (int i = 0; i < size; i++) {
            System.out.println("\nMahasiswa ke-" + (i + 1));
            listMhs[i].tampilInformasi();
            System.out.println("---------------------------");
        }
    }

    // Binary Search yang bisa menangani ascending/descending
    public int findBinarySearch(double cari, int left, int right, boolean ascending) {
        if (right >= left) {
            int mid = left + (right - left) / 2;

            if (listMhs[mid].getIpk() == cari) {
                return mid;
            }

            if (ascending ? (listMhs[mid].getIpk() > cari) 
                         : (listMhs[mid].getIpk() < cari)) {
                return findBinarySearch(cari, left, mid - 1, ascending);
            } else {
                return findBinarySearch(cari, mid + 1, right, ascending);
            }
        }
        return -1;
    }

    public void tampilPosisi(double ipk, int pos) {
        if (pos != -1) {
            System.out.println("Data mahasiswa dengan IPK " + ipk + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("Data mahasiswa dengan IPK " + ipk + " tidak ditemukan");
        }
    }

    public void tampilDataSearch(double ipk, int pos) {
        if (pos != -1) {
            System.out.println("\n=== DETAIL MAHASISWA ===");
            listMhs[pos].tampilInformasi();
        }
    }

    // Method untuk mengecek urutan data
    public int checkSortOrder() {
        if (size < 2) return 1; // Data tunggal dianggap terurut
        
        boolean ascending = true;
        boolean descending = true;
        
        for (int i = 0; i < size - 1; i++) {
            if (listMhs[i].getIpk() > listMhs[i+1].getIpk()) {
                ascending = false;
            }
            if (listMhs[i].getIpk() < listMhs[i+1].getIpk()) {
                descending = false;
            }
            if (!ascending && !descending) break;
        }
        
        if (ascending) return 1;
        if (descending) return -1;
        return 0; // tidak terurut
    }
}