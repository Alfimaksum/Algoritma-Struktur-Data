package Minggu7;

import java.util.Scanner;
public class DosenDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=== PROGRAM PENCARIAN DATA DOSEN ===");
        System.out.print("Masukkan jumlah dosen: ");
        int jumlahDosen = getPositiveInteger(sc);
        
        DataDosen dataDosen = new DataDosen(jumlahDosen);

        // Input data dosen
        System.out.println("\n=== INPUT DATA DOSEN ===");
        for (int i = 0; i < jumlahDosen; i++) {
            System.out.println("\nMasukkan Data Dosen ke-" + (i + 1));
            
            System.out.print("Nama\t\t      : ");
            String nama = sc.nextLine();
            
            System.out.print("NIP\t\t       : ");
            String nip = sc.nextLine();
            
            System.out.print("Usia\t\t      : ");
            int usia = getPositiveInteger(sc);
            
            System.out.print("Mata Kuliah\t : ");
            String mataKuliah = sc.nextLine();
            
            dataDosen.tambahDosen(new Dosen(nama, nip, usia, mataKuliah));
        }

        // Tampilkan semua data dosen
        dataDosen.tampilSemuaDosen();

        // Menu pencarian
        int pilihan;
        do {
            System.out.println("\n=== MENU PENCARIAN ===");
            System.out.println("1. Cari berdasarkan nama (Sequential Search)");
            System.out.println("2. Cari berdasarkan usia (Binary Search)");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            pilihan = getPositiveInteger(sc);
            
            switch (pilihan) {
                case 1:
                    System.out.print("\nMasukkan nama dosen yang dicari: ");
                    String namaCari = sc.nextLine();
                    dataDosen.pencarianDataSequential(namaCari);
                    break;
                case 2:
                    if (!dataDosen.isSortedByUsia()) {
                        System.out.println("\nData akan diurutkan berdasarkan usia terlebih dahulu...");
                    }
                    System.out.print("\nMasukkan usia dosen yang dicari: ");
                    int usiaCari = getPositiveInteger(sc);
                    dataDosen.pencarianDataBinary(usiaCari);
                    break;
                case 0:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);
        
        sc.close();
    }

    // Helper method untuk validasi input integer positif
    private static int getPositiveInteger(Scanner sc) {
        while (true) {
            try {
                int input = sc.nextInt();
                sc.nextLine(); // Membersihkan newline
                if (input >= 0) {
                    return input;
                } else {
                    System.out.print("Masukkan bilangan positif : ");
                }
            } catch (Exception e) {
                System.out.print("Input tidak valid. Masukkan angka : ");
                sc.nextLine(); // Membersihkan input yang salah
            }
        }
    }
}