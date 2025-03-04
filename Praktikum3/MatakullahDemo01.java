package Praktikum3;

import java.util.Scanner;
public class MatakullahDemo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Matakullah01[] arrayOfMatakullah = new Matakullah01[3];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for (int i = 0; i < 3; i++) {
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

            arrayOfMatakullah[i] = new Matakullah01("", "", 0, 0);
            arrayOfMatakullah[i].tambahData(kode, nama, sks, jumlahJam);
        }

        // Menampilkan data yang telah dimasukkan
        for (int i = 0; i < arrayOfMatakullah.length; i++) {
            System.out.println("Data Matakullah ke-" + (i + 1));
            System.out.println("Kode : " + arrayOfMatakullah[i].kode);
            System.out.println("Nama : " + arrayOfMatakullah[i].nama);
            System.out.println("Sks : " + arrayOfMatakullah[i].sks);
            System.out.println("Jumlah Jam : " + arrayOfMatakullah[i].jumlahJam);
            System.out.println("--------------------------------------");
        }

        sc.close();
    }
}