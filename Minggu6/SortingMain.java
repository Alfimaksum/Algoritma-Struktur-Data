package Minggu6;

public class SortingMain {
    public static void main(String[] args) {
        // Data yang akan diurutkan dengan Bubble Sort
        int[] a = {20, 10, 2, 7, 12};

        // Membuat objek dari class Sorting untuk Bubble Sort
        Sorting01 dataSort = new Sorting01(a, a.length);

        // Menampilkan data sebelum diurutkan
        System.out.println("Data awal 1:");
        dataSort.tampil();

        // Melakukan Bubble Sort
        dataSort.bubbleSort();

        // Menampilkan data setelah diurutkan
        System.out.println("Data sudah diurutkan dengan BUBBLE SORT (ASC):");
        dataSort.tampil();

        // Data yang akan diurutkan dengan Selection Sort
        int[] b = {30, 20, 2, 8, 14};

        // Membuat objek dari class Sorting untuk Selection Sort
        Sorting01 dataSort2 = new Sorting01(b, b.length);

        // Menampilkan data sebelum diurutkan
        System.out.println("Data awal 2:");
        dataSort2.tampil();

        // Melakukan Selection Sort
        dataSort2.selectionSort();

        // Menampilkan data setelah diurutkan
        System.out.println("Data sudah diurutkan dengan SELECTION SORT (ASC):");
        dataSort2.tampil();

        // Data yang akan diurutkan dengan Insertion Sort
        int[] c = {40, 10, 4, 9, 3};

        // Membuat objek dari class Sorting untuk Insertion Sort
        Sorting01 dataSort3 = new Sorting01(c, c.length);

        // Menampilkan data sebelum diurutkan
        System.out.println("Data awal 3:");
        dataSort3.tampil();

        // Melakukan Insertion Sort
        dataSort3.insertionSort();

        // Menampilkan data setelah diurutkan
        System.out.println("Data sudah diurutkan dengan INSERTION SORT (ASC):");
        dataSort3.tampil();
    }
}