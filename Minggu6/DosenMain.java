package Minggu6;

import java.util.Scanner;
public class DosenMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DataDosen01 dataDosen01 = new DataDosen01();
        int pilihan;

        do {
            System.out.println("Menu:");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampil Data Dosen");
            System.out.println("3. Sorting ASC (Bubble Sort)");
            System.out.println("4. Sorting DSC (Selection Sort)");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine(); // Membuang newline

            switch (pilihan) {
                case 1:
                    System.out.print("Kode      : ");
                    String kode = input.nextLine();
                    System.out.print("Nama      : ");
                    String nama = input.nextLine();
                    System.out.print("Jenis Kelamin (true untuk Laki-laki, false untuk Perempuan): ");
                    boolean jenisKelamin = input.nextBoolean();
                    System.out.print("Usia      : ");
                    int usia = input.nextInt();
                    input.nextLine(); // Membuang newline

                    Dosen01 dsn = new Dosen01 (kode, nama, jenisKelamin, usia);
                    dataDosen01.tambah(dsn);
                    break;
                case 2:
                    System.out.println("Data Dosen:");
                    dataDosen01.tampil();
                    break;
                case 3:
                    dataDosen01.sortingASC();
                    System.out.println("Data Dosen setelah sorting ASC (Bubble Sort):");
                    dataDosen01.tampil();
                    break;
                case 4:
                    dataDosen01.sortingDSC();
                    System.out.println("Data Dosen setelah sorting DSC (Selection Sort):");
                    dataDosen01.tampil();
                    break;
                case 5:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 5);

        input.close();
    }
}