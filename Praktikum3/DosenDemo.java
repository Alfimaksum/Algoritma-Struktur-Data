package Praktikum3;

import java.util.Scanner;
public class DosenDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Meminta input jumlah dosen
        System.out.print("Masukkan jumlah dosen: ");
        int jumlahDosen = Integer.parseInt(sc.nextLine());

        // Membuat array of object Dosen
        Dosen[] arrayOfDosen = new Dosen[jumlahDosen];

        // Input data dosen
        for (int i = 0; i < jumlahDosen; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode Dosen   : ");
            String kode = sc.nextLine();
            System.out.print("Nama Dosen   : ");
            String nama = sc.nextLine();
            System.out.print("Jenis Kelamin (true = Laki-laki, false = Perempuan): ");
            Boolean jeniskelamin = Boolean.parseBoolean(sc.nextLine());
            System.out.print("Usia         : ");
            int usia = Integer.parseInt(sc.nextLine());
            System.out.println("-------------------------------");

            // Membuat objek Dosen dan menyimpannya dalam array
            arrayOfDosen[i] = new Dosen(kode, nama, jeniskelamin, usia);
        }

        // Menampilkan data dosen menggunakan foreach
        System.out.println("\nData Dosen:");
        for (Dosen dosen : arrayOfDosen) {
            dosen.cetakInfo();
        }

        sc.close();
    }
}