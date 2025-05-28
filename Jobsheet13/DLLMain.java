package Jobsheet13;

import java.util.Scanner;
public class DLLMain {
    public static void main(String[] args) {
        DoubleLinkedLists01 list = new DoubleLinkedLists01();
        Scanner scan = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n== Menu Double Linked List Mahasiswa ==");
            System.out.println("1. Tambah di awal");
            System.out.println("2. Tambah di akhir");
            System.out.println("3. Sisipkan setelah NIM tertentu");
            System.out.println("4. Hapus di awal");
            System.out.println("5. Hapus di akhir");
            System.out.println("6. Tampilkan data");
            System.out.println("7. Cari Mahasiswa berdasarkan NIM");
            System.out.println("8. Tambah data pada indeks tertentu");
            System.out.println("9. Hapus data setelah NIM tertentu");
            System.out.println("10. Hapus data pada indeks tertentu");
            System.out.println("11. Tampilkan data pertama");
            System.out.println("12. Tampilkan data terakhir");
            System.out.println("13. Tampilkan data pada indeks");
            System.out.println("14. Tampilkan jumlah data");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scan.nextInt();
            scan.nextLine(); // Membersihkan newline

            switch (pilihan) {
                case 1 -> {
                    Mahasiswa01 mhs = inputMahasiswa(scan);
                    list.addFirst(mhs);
                }
                case 2 -> {
                    Mahasiswa01 mhs = inputMahasiswa(scan);
                    list.addLast(mhs);
                }
                case 3 -> {
                    System.out.print("Masukkan NIM referensi: ");
                    String nimRef = scan.nextLine();
                    Mahasiswa01 mhs = inputMahasiswa(scan);
                    list.insertAfter(nimRef, mhs);
                }
                case 4 -> list.removeFirst();
                case 5 -> list.removeLast();
                case 6 -> list.print();
                case 7 -> {
                    System.out.print("Masukkan NIM yang dicari: ");
                    String nim = scan.nextLine();
                    Node01 found = list.search(nim);
                    if (found != null) {
                        System.out.println("Data ditemukan:");
                        found.data.tampil();
                    } else {
                        System.out.println("Data tidak ditemukan.");
                    }
                }
                case 8 -> {
                    System.out.print("Masukkan indeks: ");
                    int index = scan.nextInt();
                    scan.nextLine();
                    Mahasiswa01 mhs = inputMahasiswa(scan);
                    list.add(index, mhs);
                }
                case 9 -> {
                    System.out.print("Masukkan NIM referensi: ");
                    String nimRef = scan.nextLine();
                    list.removeAfter(nimRef);
                }
                case 10 -> {
                    System.out.print("Masukkan indeks: ");
                    int idx = scan.nextInt();
                    scan.nextLine();
                    list.remove(idx);
                }
                case 11 -> {
                    Mahasiswa01 first = list.getFirst();
                    if (first != null) {
                        System.out.println("Data pertama:");
                        first.tampil();
                    }
                }
                case 12 -> {
                    Mahasiswa01 last = list.getLast();
                    if (last != null) {
                        System.out.println("Data terakhir:");
                        last.tampil();
                    }
                }
                case 13 -> {
                    System.out.print("Masukkan indeks: ");
                    int idx = scan.nextInt();
                    scan.nextLine();
                    Mahasiswa01 data = list.getIndex(idx);
                    if (data != null) {
                        System.out.println("Data pada indeks " + idx + ":");
                        data.tampil();
                    }
                }
                case 14 -> {
                    System.out.println("Jumlah data: " + list.size());
                }
                case 0 -> System.out.println("Keluar dari program.");
                default -> System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);
        scan.close();
    }

    private static Mahasiswa01 inputMahasiswa(Scanner scan) {
        System.out.print("Masukkan NIM  : ");
        String nim = scan.nextLine();
        System.out.print("Masukkan Nama : ");
        String nama = scan.nextLine();
        System.out.print("Masukkan Kelas: ");
        String kelas = scan.nextLine();
        System.out.print("Masukkan IPK  : ");
        double ipk = scan.nextDouble();
        scan.nextLine(); // Membersihkan newline
        return new Mahasiswa01(nim, nama, kelas, ipk);
    }
}