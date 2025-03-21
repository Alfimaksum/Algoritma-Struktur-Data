package Minggu6;

public class Sorting01 {
    int[] data;
    int jmlData;

    // Constructor untuk menginisialisasi data
    Sorting01(int[] data, int jmlData) {
        this.jmlData = jmlData;
        this.data = new int[jmlData];
        for (int i = 0; i < jmlData; i++) {
            this.data[i] = data[i];
        }
    }

    // Method untuk melakukan Bubble Sort
    void bubbleSort() {
        int temp;
        for (int i = 0; i < jmlData - 1; i++) {
            for (int j = 0; j < jmlData - i - 1; j++) {
                if (data[j] > data[j + 1]) {
                    // Tukar data[j] dan data[j+1]
                    temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }

    // Method untuk melakukan Selection Sort
    void selectionSort() {
        for (int i = 0; i < jmlData - 1; i++) {
            int min = i;
            for (int j = i + 1; j < jmlData; j++) {
                if (data[j] < data[min]) {
                    min = j;
                }
            }
            // Tukar data[i] dan data[min]
            int temp = data[i];
            data[i] = data[min];
            data[min] = temp;
        }
    }

    // Method untuk melakukan Insertion Sort
    void insertionSort() {
        for (int i = 1; i < jmlData; i++) {
            int temp = data[i];
            int j = i - 1;
            while (j >= 0 && data[j] > temp) {
                data[j + 1] = data[j];
                j--;
            }
            data[j + 1] = temp;
        }
    }

    // Method untuk menampilkan data
    void tampil() {
        for (int i = 0; i < jmlData; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}