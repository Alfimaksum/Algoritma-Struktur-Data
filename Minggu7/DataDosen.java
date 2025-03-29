package Minggu7;

public class DataDosen {
    private Dosen[] listDosen;
    private int size;
    private int capacity;

    public DataDosen(int capacity) {
        this.capacity = capacity;
        this.listDosen = new Dosen[capacity];
        this.size = 0;
    }

    // Method untuk menambahkan data dosen
    public void tambahDosen(Dosen dosen) {
        if (size < capacity) {
            listDosen[size] = dosen;
            size++;
        } else {
            System.out.println("Kapasitas data dosen penuh!");
        }
    }

    // Method untuk menampilkan semua data dosen
    public void tampilSemuaDosen() {
        System.out.println("\n=== DAFTAR DOSEN ===");
        for (int i = 0; i < size; i++) {
            System.out.println("\nDosen ke-" + (i + 1));
            listDosen[i].tampilInformasi();
            System.out.println("----------------------");
        }
    }

    // Sequential Search berdasarkan nama (bisa multiple results)
    public void pencarianDataSequential(String namaCari) {
        System.out.println("\n=== HASIL PENCARIAN SEQUENTIAL ===");
        System.out.println("Mencari dosen dengan nama: " + namaCari);
        
        int hasil = 0;
        for (int i = 0; i < size; i++) {
            if (listDosen[i].getNama().equalsIgnoreCase(namaCari)) {
                System.out.println("\nDitemukan pada indeks: " + i);
                listDosen[i].tampilInformasi();
                hasil++;
            }
        }
        
        if (hasil == 0) {
            System.out.println("Tidak ditemukan dosen dengan nama tersebut");
        } else if (hasil > 1) {
            System.out.println("\nPeringatan: Ditemukan " + hasil + " hasil dengan nama yang sama!");
        }
    }

    // Binary Search berdasarkan usia (data harus terurut)
    public void pencarianDataBinary(int usiaCari) {
        System.out.println("\n=== HASIL PENCARIAN BINARY ===");
        System.out.println("Mencari dosen dengan usia: " + usiaCari);
        
        // Urutkan data berdasarkan usia terlebih dahulu (Ascending)
        sortByUsia();
        
        int left = 0;
        int right = size - 1;
        int hasil = 0;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (listDosen[mid].getUsia() == usiaCari) {
                // Tampilkan semua data dengan usia yang sama (bisa lebih dari 1)
                hasil++;
                System.out.println("\nDitemukan pada indeks: " + mid);
                listDosen[mid].tampilInformasi();
                
                // Cek data sebelah kiri mid
                int temp = mid - 1;
                while (temp >= 0 && listDosen[temp].getUsia() == usiaCari) {
                    System.out.println("\nDitemukan pada indeks: " + temp);
                    listDosen[temp].tampilInformasi();
                    hasil++;
                    temp--;
                }
                
                // Cek data sebelah kanan mid
                temp = mid + 1;
                while (temp < size && listDosen[temp].getUsia() == usiaCari) {
                    System.out.println("\nDitemukan pada indeks: " + temp);
                    listDosen[temp].tampilInformasi();
                    hasil++;
                    temp++;
                }
                
                break;
            }
            
            if (listDosen[mid].getUsia() < usiaCari) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        if (hasil == 0) {
            System.out.println("Tidak ditemukan dosen dengan usia tersebut");
        } else if (hasil > 1) {
            System.out.println("\nPeringatan: Ditemukan " + hasil + " hasil dengan usia yang sama!");
        }
    }

    // Method untuk sorting data dosen berdasarkan usia (Ascending)
    private void sortByUsia() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (listDosen[j].getUsia() > listDosen[j + 1].getUsia()) {
                    // Swap
                    Dosen temp = listDosen[j];
                    listDosen[j] = listDosen[j + 1];
                    listDosen[j + 1] = temp;
                }
            }
        }
    }

    // Method untuk mengecek apakah data sudah terurut berdasarkan usia
    public boolean isSortedByUsia() {
        for (int i = 0; i < size - 1; i++) {
            if (listDosen[i].getUsia() > listDosen[i + 1].getUsia()) {
                return false;
            }
        }
        return true;
    }
}