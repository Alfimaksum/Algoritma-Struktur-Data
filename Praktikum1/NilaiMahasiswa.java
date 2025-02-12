import java.util.Scanner;

public class NilaiMahasiswa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input nilai tugas
        System.out.print("Masukkan nilai tugas (0-100): ");
        double tugas = sc.nextDouble();
        if (tugas < 0 || tugas > 100) {
            System.out.println("nilai tidak valid");
            return;
        }

        // Input nilai kuis
        System.out.print("Masukkan nilai kuis (0-100): ");
        double kuis = sc.nextDouble();
        if (kuis < 0 || kuis > 100) {
            System.out.println("nilai tidak valid");
            return;
        }

        // Input nilai UTS
        System.out.print("Masukkan nilai UTS (0-100): ");
        double uts = sc.nextDouble();
        if (uts < 0 || uts > 100) {
            System.out.println("nilai tidak valid");
            return;
        }

        // Input nilai UAS
        System.out.print("Masukkan nilai UAS (0-100): ");
        double uas = sc.nextDouble();
        if (uas < 0 || uas > 100) {
            System.out.println("nilai tidak valid");
            return;
        }

        // Menghitung nilai akhir
        double nilaiAkhir = (0.20 * tugas) + (0.20 * kuis) + (0.30 * uts) + (0.40 * uas);

        // Konversi nilai angka ke nilai huruf
        String nilaiHuruf;
        double nilaiSetara;
        String keterangan;

        if (nilaiAkhir > 80) {
            nilaiHuruf = "A";
            nilaiSetara = 4.0;
            keterangan = "Sangat Baik";
        } else if (nilaiAkhir > 73) {
            nilaiHuruf = "B+";
            nilaiSetara = 3.5;
            keterangan = "Lebih dari Baik";
        } else if (nilaiAkhir > 65) {
            nilaiHuruf = "B";
            nilaiSetara = 3.0;
            keterangan = "Baik";
        } else if (nilaiAkhir > 60) {
            nilaiHuruf = "C+";
            nilaiSetara = 2.5;
            keterangan = "Lebih dari Cukup";
        } else if (nilaiAkhir > 50) {
            nilaiHuruf = "C";
            nilaiSetara = 2.0;
            keterangan = "Cukup";
        } else if (nilaiAkhir > 39) {
            nilaiHuruf = "D";
            nilaiSetara = 1.0;
            keterangan = "Kurang";
        } else {
            nilaiHuruf = "E";
            nilaiSetara = 0.0;
            keterangan = "Gagal";
        }

        // Menentukan kelulusan
        String status;
        if (nilaiHuruf.equals("A") || nilaiHuruf.equals("B+") || nilaiHuruf.equals("B") || nilaiHuruf.equals("C+") || nilaiHuruf.equals("C")) {
            status = "LULUS";
        } else {
            status = "TIDAK LULUS";
        }

        // Output hasil
        System.out.println("Nilai Akhir: " + nilaiAkhir);
        System.out.println("Nilai Huruf: " + nilaiHuruf);
        System.out.println("Keterangan: " + keterangan);
        System.out.println("Status: " + status);
    }
}