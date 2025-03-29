package Minggu7;

import java.util.Scanner;

public class MahasiswaDemo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input jumlah mahasiswa
        System.out.println("=== PROGRAM PENCARIAN MAHASISWA ===");
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMhs = getPositiveInteger(sc);
        
        MahasiswaBerprestasi list = new MahasiswaBerprestasi(jumlahMhs);

        // Input data mahasiswa
        System.out.println("\n=== INPUT DATA MAHASISWA ===");
        for (int i = 0; i < jumlahMhs; i++) {
            System.out.println("\nMasukkan Data Mahasiswa ke-" + (i + 1));
            
            System.out.print("NIM\t     : ");
            String nim = sc.nextLine();
            
            System.out.print("Nama\t    : ");
            String nama = sc.nextLine();
            
            System.out.print("Kelas\t   : ");
            String kelas = sc.nextLine();
            
            System.out.print("IPK\t     : ");
            double ipk = getValidIPK(sc);
            
            list.tambah(new Mahasiswa(nim, nama, kelas, ipk));
            System.out.println("----------------------");
        }

        // Verifikasi urutan data
        int sortOrder = list.checkSortOrder();
        if (sortOrder == 0) {
            System.out.println("\nERROR: Data IPK harus terurut (ascending/descending) untuk binary search!");
            System.out.println("Silahkan jalankan program kembali dan input data dengan IPK terurut.");
            sc.close();
            return;
        }

        // Tampilkan semua data
        list.tampilSemua();

        // Pencarian data
        System.out.println("\n=== PENCARIAN DATA ===");
        System.out.print("Masukkan IPK mahasiswa yang dicari: ");
        double cariIpk = sc.nextDouble();
        sc.nextLine(); // Membersihkan buffer
        
        System.out.println("\nMenggunakan Binary Search");
        System.out.println("----------------------");
        
        int posisi = list.findBinarySearch(cariIpk, 0, jumlahMhs-1, sortOrder == 1);
        list.tampilPosisi(cariIpk, posisi);
        list.tampilDataSearch(cariIpk, posisi);
        
        sc.close();
    }

    // Helper method untuk validasi input integer positif
    private static int getPositiveInteger(Scanner sc) {
        while (true) {
            try {
                int input = sc.nextInt();
                sc.nextLine(); // Membersihkan newline
                if (input > 0) {
                    return input;
                } else {
                    System.out.print("Masukkan bilangan positif: ");
                }
            } catch (Exception e) {
                System.out.print("Input tidak valid. Masukkan angka: ");
                sc.nextLine(); // Membersihkan input yang salah
            }
        }
    }

    // Helper method untuk validasi IPK (0-4)
    private static double getValidIPK(Scanner sc) {
        while (true) {
            try {
                double ipk = sc.nextDouble();
                sc.nextLine(); // Membersihkan newline
                if (ipk >= 0 && ipk <= 4) {
                    return ipk;
                } else {
                    System.out.print("IPK harus antara 0-4. Masukkan kembali: ");
                }
            } catch (Exception e) {
                System.out.print("Input tidak valid. Masukkan angka: ");
                sc.nextLine(); // Membersihkan input yang salah
            }
        }
    }
}