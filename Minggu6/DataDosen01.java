package Minggu6;

public class DataDosen01 {
    Dosen01[] dataDosen01 = new Dosen01[10];
    int idx = 0;

    // Method untuk menambahkan dosen ke dalam list
    void tambah(Dosen01 dsn) {
        if (idx < dataDosen01.length) {
            dataDosen01[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    // Method untuk menampilkan semua data dosen
    void tampil() {
        for (int i = 0; i < idx; i++) {
            dataDosen01[i].tampil();
        }
    }

    // Method untuk mengurutkan data dosen berdasarkan usia secara ascending menggunakan Bubble Sort
    void sortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (dataDosen01[j].usia > dataDosen01[j + 1].usia) {
                    // Tukar posisi dosen
                    Dosen01 temp = dataDosen01[j];
                    dataDosen01[j] = dataDosen01[j + 1];
                    dataDosen01[j + 1] = temp;
                }
            }
        }
    }

    // Method untuk mengurutkan data dosen berdasarkan usia secara descending menggunakan Selection Sort
    void sortingDSC() {
        for (int i = 0; i < idx - 1; i++) {
            int idxMax = i;
            for (int j = i + 1; j < idx; j++) {
                if (dataDosen01[j].usia > dataDosen01[idxMax].usia) {
                    idxMax = j;
                }
            }
            // Tukar posisi dosen
            Dosen01 temp = dataDosen01[idxMax];
            dataDosen01[idxMax] = dataDosen01[i];
            dataDosen01[i] = temp;
        }
    }
}