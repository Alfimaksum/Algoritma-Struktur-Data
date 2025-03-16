package Minggu5;

import java.util.Scanner;
class Sum {
    double[] kountungan;

    // Constructor untuk menginisialisasi array kountungan
    Sum(int e1) {
        kountungan = new double[e1];
    }

    // Metode untuk menghitung total nilai array menggunakan Brute Force
    double totalBF() {
        double total = 0;
        for (int i = 0; i < kountungan.length; i++) {
            total += kountungan[i];
        }
        return total;
    }

    // Metode untuk menghitung total nilai array menggunakan Divide and Conquer
    double totalDC(double arr[], int l, int r) {
        if (l == r) {
            return arr[l];
        }
        int mid = (l + r) / 2;
        double lsum = totalDC(arr, l, mid);
        double rsum = totalDC(arr, mid + 1, r);
        return lsum + rsum;
    }
}

public class MainSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah element: ");
        int element = input.nextInt();

        Sum sum = new Sum(element);

        for (int i = 0; i < element; i++) {
            System.out.print("Masukkan kountungan ke-" + (i + 1) + ": ");
            sum.kountungan[i] = input.nextDouble();
        }

        System.out.println("Total kountungan menggunakan Brute Force: " + sum.totalBF());
        System.out.println("Total kountungan menggunakan Divide and Conquer: " + sum.totalDC(sum.kountungan, 0, element - 1));

        input.close();
    }
}