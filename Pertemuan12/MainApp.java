package Pertemuan12;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        AntrianKemahasiswaan01 antrian = new AntrianKemahasiswaan01();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n=== Sistem Antrian Unit Kemahasiswaan ===");
            System.out.println("1. Daftar Antrian");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Lihat Antrian Terdepan");
            System.out.println("4. Lihat Antrian Terakhir");
            System.out.println("5. Jumlah Antrian");
            System.out.println("6. Tampilkan Semua Antrian");
            System.out.println("7. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.println("\n=== Pendaftaran Antrian ===");
                    System.out.print("NIM        : ");
                    String nim = scanner.nextLine();
                    System.out.print("Nama       : ");
                    String nama = scanner.nextLine();
                    System.out.print("Jurusan    : ");
                    String jurusan = scanner.nextLine();
                    antrian.daftarMahasiswa(new Mahasiswa01(nim, nama, jurusan));
                    break;
                case 2:
                    Mahasiswa01 mhs = antrian.panggilAntrian();
                    if (mhs != null) {
                        System.out.println("\nMahasiswa yang dipanggil:");
                        System.out.printf("%-10s %-20s %-15s\n", "NIM", "Nama", "Jurusan");
                        mhs.displayInfo();
                    }
                    break;
                case 3:
                    antrian.lihatAntrianDepan();
                    break;
                case 4:
                    antrian.lihatAntrianBelakang();
                    break;
                case 5:
                    antrian.jumlahAntrian();
                    break;
                case 6:
                    antrian.displayAntrian();
                    break;
                case 7:
                    antrian.clear();
                    break;
                case 0:
                    System.out.println("Terima kasih telah menggunakan sistem antrian");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (choice != 0);

        scanner.close();
    }
}