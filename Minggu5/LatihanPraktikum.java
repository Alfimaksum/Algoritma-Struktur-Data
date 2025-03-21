package Minggu5;

import java.util.Scanner;
class Mahasiswa {
    String nama;
    String nim;
    int tahunMasuk;
    int nilaiUTS;
    int nilaiUAS;

    // Constructor untuk menginisialisasi data mahasiswa
    Mahasiswa(String nama, String nim, int tahunMasuk, int nilaiUTS, int nilaiUAS) {
        this.nama = nama;
        this.nim = nim;
        this.tahunMasuk = tahunMasuk;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }
}

public class LatihanPraktikum {
    // Method untuk mencari nilai UTS tertinggi menggunakan Divide and Conquer
    static int maxUTS(int arr[], int l, int r) {
        if (l == r) {
            return arr[l];
        }
        int mid = (l + r) / 2;
        int lmax = maxUTS(arr, l, mid);
        int rmax = maxUTS(arr, mid + 1, r);
        return Math.max(lmax, rmax);
    }

    // Method untuk mencari nilai UTS terendah menggunakan Divide and Conquer
    static int minUTS(int arr[], int l, int r) {
        if (l == r) {
            return arr[l];
        }
        int mid = (l + r) / 2;
        int lmin = minUTS(arr, l, mid);
        int rmin = minUTS(arr, mid + 1, r);
        return Math.min(lmin, rmin);
    }

    // Method untuk menghitung rata-rata nilai UAS menggunakan Brute Force
    static double averageUAS(int arr[]) {
        int total = 0;
        for (int nilai : arr) {
            total += nilai;
        }
        return (double) total / arr.length;
    }

    public static void main(String[] args) {
        // Data mahasiswa
        Mahasiswa[] mahasiswa = {
            new Mahasiswa("Ahmad", "220101001", 2022, 78, 82),
            new Mahasiswa("Budi", "220101002", 2022, 85, 88),
            new Mahasiswa("Cindy", "220101003", 2021, 90, 87),
            new Mahasiswa("Dian", "220101004", 2021, 76, 79),
            new Mahasiswa("Eko", "220101005", 2023, 92, 95),
            new Mahasiswa("Fajar", "220101006", 2020, 88, 85),
            new Mahasiswa("Gina", "220101007", 2023, 80, 83),
            new Mahasiswa("Hadi", "220101008", 2020, 82, 84)
        };

        // Array untuk menyimpan nilai UTS dan UAS
        int[] nilaiUTS = new int[mahasiswa.length];
        int[] nilaiUAS = new int[mahasiswa.length];

        for (int i = 0; i < mahasiswa.length; i++) {
            nilaiUTS[i] = mahasiswa[i].nilaiUTS;
            nilaiUAS[i] = mahasiswa[i].nilaiUAS;
        }

        // a) Nilai UTS tertinggi menggunakan Divide and Conquer
        int maxUTS = maxUTS(nilaiUTS, 0, nilaiUTS.length - 1);
        System.out.println("Nilai UTS tertinggi: " + maxUTS);

        // b) Nilai UTS terendah menggunakan Divide and Conquer
        int minUTS = minUTS(nilaiUTS, 0, nilaiUTS.length - 1);
        System.out.println("Nilai UTS terendah: " + minUTS);

        // c) Rata-rata nilai UAS menggunakan Brute Force
        double avgUAS = averageUAS(nilaiUAS);
        System.out.println("Rata-rata nilai UAS: " + avgUAS);
    }
}