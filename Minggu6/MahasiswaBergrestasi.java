package Minggu6;

public class MahasiswaBergrestasi {
    Mahasiswa[] listMhs = new Mahasiswa[5];
    int idx;

    // Method untuk menambahkan mahasiswa ke dalam list
    void tambah(Mahasiswa m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    // Method untuk menampilkan semua data mahasiswa
    void tampil() {
        for (Mahasiswa m : listMhs) {
            m.tampilInformasi();
            System.out.println("--------------------------");
        }
    }

    // Method untuk mengurutkan mahasiswa berdasarkan IPK secara descending menggunakan Insertion Sort
    void insertionSort() {
        for (int i = 1; i < listMhs.length; i++) {
            Mahasiswa temp = listMhs[i];
            int j = i;
            while (j > 0 && listMhs[j - 1].ipk < temp.ipk) { // Perubahan kondisi di sini
                listMhs[j] = listMhs[j - 1];
                j--;
            }
            listMhs[j] = temp;
        }
    }
}