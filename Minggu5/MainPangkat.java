package Minggu5;

import java.util.Scanner;
class Pangkat {
    int nilai, pmgkst;

    // Constructor untuk menginisialisasi nilai dan pmgkst
    Pangkat(int n, int p) {
        nilai = n;
        pmgkst = p;
    }

    // Metode untuk menghitung pangkat menggunakan Brute Force
    int pangkatBF(int a, int n) {
        int hasil = 1;
        for (int i = 0; i < n; i++) {
            hasil = hasil * a;
        }
        return hasil;
    }

    // Metode untuk menghitung pangkat menggunakan Divide and Conquer
    int pangkatDC(int a, int n) {
        if (n == 0) {
            return 1;
        } else if (n % 2 == 0) {
            int temp = pangkatDC(a, n / 2);
            return temp * temp;
        } else {
            return a * pangkatDC(a, n - 1);
        }
    }
}

public class MainPangkat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah data: ");
        int jumlah = input.nextInt();

        Pangkat[] pgt = new Pangkat[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nilai basis ke-" + (i + 1) + ": ");
            int basis = input.nextInt();
            System.out.print("Masukkan nilai pangkat ke-" + (i + 1) + ": ");
            int pangkat = input.nextInt();
            pgt[i] = new Pangkat(basis, pangkat);
        }

        System.out.println("HASIL PANGKAT - BRUTE FORCE");
        for (Pangkat p : pgt) {
            System.out.println("Nilai " + p.nilai + " pangkat " + p.pmgkst + " adalah: " + p.pangkatBF(p.nilai, p.pmgkst));
        }

        System.out.println("HASIL PANGKAT - DIVIDE AND CONQUER");
        for (Pangkat p : pgt) {
            System.out.println("Nilai " + p.nilai + " pangkat " + p.pmgkst + " adalah: " + p.pangkatDC(p.nilai, p.pmgkst));
        }

        input.close();
    }
}