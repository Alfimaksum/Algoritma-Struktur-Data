package Jobsheet12;

import java.util.Scanner;
public class LayananAkademikSIAKAD {
    public static void menu() {
        System.out.println("\n== Menu Layanan Akademik ==");
        System.out.println("1. Tambah Mahasiswa ke Antrian");
        System.out.println("2. Layani Mahasiswa");
        System.out.println("3. Lihat Mahasiswa Terdepan");
        System.out.println("4. Tampilkan Semua Antrian");
        System.out.println("5. Jumlah Mahasiswa dalam Antrian");
        System.out.println("6. Lihat Mahasiswa Terakhir");
        System.out.println("0. Keluar");
        System.out.print("Pilihan Anda: ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kapasitas antrian: ");
        int kapasitas = sc.nextInt();
        sc.nextLine(); // Membersihkan newline
        
        AntrianLayanan01 antrian = new AntrianLayanan01(kapasitas);
        int pilihan;
        
        do {
            menu();
            pilihan = sc.nextInt();
            sc.nextLine(); // Membersihkan newline
            
            switch (pilihan) {
                case 1:
                    System.out.print("NIM   : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama  : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi : ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();
                    Mahasiswa01 mhs = new Mahasiswa01(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;
                case 2:
                    Mahasiswa01 dilayani = antrian.layaniMahasiswa();
                    if (dilayani != null) {
                        System.out.print("Melayani mahasiswa: ");
                        dilayani.tampilkanData();
                    }
                    break;
                case 3:
                    antrian.lihatTerdepan();
                    break;
                case 4:
                    antrian.tampilkanSemua();
                    break;
                case 5:
                    System.out.println("Jumlah dalam antrian: " + antrian.getJumlahAntrian());
                    break;
                case 6:
                    antrian.lihatAkhir();
                    break;
                case 0:
                    System.out.println("Terima kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);
        
        sc.close();
    }
}