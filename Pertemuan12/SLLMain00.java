package Pertemuan12;

import java.util.Scanner;
public class SLLMain00 {
    public static void main(String[] args) {
        SingleLinkedList00 sll = new SingleLinkedList00();
        Scanner sc = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n==Menu Operasi Linked List==");
            System.out.println("1. Tambah Data di Awal");
            System.out.println("2. Tambah Data di Akhir");
            System.out.println("3. Sisipkan Data Setelah Node");
            System.out.println("4. Sisipkan Data pada Indeks");
            System.out.println("5. Tampilkan Data");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            pilihan = sc.nextInt();
            sc.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.println("\nTambah Data di Awal");
                    sll.addFirst(inputMahasiswa(sc));
                    break;
                case 2:
                    System.out.println("\nTambah Data di Akhir");
                    sll.addLast(inputMahasiswa(sc));
                    break;
                case 3:
                    System.out.println("\nSisipkan Data Setelah Node");
                    System.out.print("Masukkan nama mahasiswa referensi: ");
                    String key = sc.nextLine();
                    sll.insertAfter(key, inputMahasiswa(sc));
                    break;
                case 4:
                    System.out.println("\nSisipkan Data pada Indeks");
                    System.out.print("Masukkan indeks: ");
                    int idx = sc.nextInt();
                    sc.nextLine();
                    sll.insertAt(idx, inputMahasiswa(sc));
                    break;
                case 5:
                    System.out.println("\nIsi Linked List:");
                    sll.print();
                    break;
                case 0:
                    System.out.println("Program selesai");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);

        sc.close();
    }

    private static Mahasiswa00 inputMahasiswa(Scanner sc) {
        System.out.print("NIM     : ");
        String nim = sc.nextLine();
        System.out.print("Nama    : ");
        String nama = sc.nextLine();
        System.out.print("Kelas   : ");
        String kelas = sc.nextLine();
        System.out.print("IPK     : ");
        double ipk = sc.nextDouble();
        sc.nextLine(); 

        return new Mahasiswa00(nim, nama, kelas, ipk);
    }
}