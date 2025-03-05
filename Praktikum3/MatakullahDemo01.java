package Praktikum3;

import java.util.Scanner;
public class MatakullahDemo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah matakuliah: ");
        int jumlahMatakuliah = Integer.parseInt(sc.nextLine());
        Matakullah01[] arrayOfMatakullah = new Matakullah01[jumlahMatakuliah];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for (int i = 0; i < jumlahMatakuliah; i++) {
            System.out.println("Masukkan Data Matakullah ke-" + (i + 1));
            System.out.print("Kode       : ");
            kode = sc.nextLine();
            System.out.print("Nama       : ");
            nama = sc.nextLine();
            System.out.print("Sks        : ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam : ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("-------------------------------");

            arrayOfMatakullah[i] = new Matakullah01(kode, nama, sks, jumlahJam);
        }

        // Menampilkan data yang telah dimasukkan
        for (int i = 0; i < arrayOfMatakullah.length; i++) {
            System.out.println("Data Matakullah ke-" + (i + 1));
            arrayOfMatakullah[i].cetakInfo();
        }

        sc.close();
    }
}