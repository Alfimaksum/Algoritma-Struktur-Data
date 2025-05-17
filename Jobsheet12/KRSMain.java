package Jobsheet12;

import java.util.Scanner;
public class KRSMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKRS antrian = new AntrianKRS(10);
        int pilihan;

        do { 
            System.out.println("\n=== Menu Antrian KRS ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Layani Antrian");
            System.out.println("3. Lihat Semua Antrian");
            System.out.println("4. Lihat 2 antrian terdepan");
            System.out.println("5. Lihat Antrian Terakhir");
            System.out.println("6. Lihat Jumlah Antrian");
            System.out.println("7. Lihat Jumlah yang Telah Dilayani");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

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
                    KRS krs = new KRS(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(krs);
                    break;
                case 2:
                    KRS dilayani = antrian.layaniMahasiswa();
                    if (dilayani != null) {
                        System.out.print("Melayani mahasiswa: ");
                        dilayani.tampilkanData();
                    }
                    KRS dilayani2 = antrian.layaniMahasiswa();
                    if (dilayani2 != null) {
                        System.out.print("Melayani mahasiswa: ");
                        dilayani2.tampilkanData();
                    }
                    break;
                case 3:
                    antrian.tampilkanSemua();
                    break;
                case 4:
                    antrian.lihatTerdepan();
                    break;
                case 5:
                    antrian.lihatTerakhir();
                    break;
                case 6:
                    System.out.println("Jumlah dalam antrian: " + antrian.getJumlahAntrian());
                    break;
                case 7:
                    antrian.jumlahDilayani();
                    break;
                case 0:
                    System.out.println("Terima kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");;
            }
        } while (pilihan != 0);

        sc.close();
    }
}