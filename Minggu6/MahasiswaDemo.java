package Minggu6;

import java.util.Scanner;
public class MahasiswaDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MahasiswaBergrestasi list = new MahasiswaBergrestasi();

        for (int i = 0; i < 5; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM       : ");
            String nim = input.nextLine();
            System.out.print("Nama      : ");
            String nama = input.nextLine();
            System.out.print("Kelas     : ");
            String kelas = input.nextLine();
            System.out.print("IPK       : ");
            double ipk = input.nextDouble();
            input.nextLine(); // Membuang newline

            Mahasiswa m = new Mahasiswa(nim, nama, kelas, ipk);
            list.tambah(m);
            System.out.println("---------------------------");
        }

        // Menampilkan data sebelum sorting
        System.out.println("Data mahasiswa sebelum sorting:");
        list.tampil();

        // Mengurutkan data berdasarkan IPK secara descending menggunakan Insertion Sort
        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (DESC):");
        list.insertionSort();
        list.tampil();

        input.close();
    }
}