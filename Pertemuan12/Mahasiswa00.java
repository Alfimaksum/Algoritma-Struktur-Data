package Pertemuan12;

public class Mahasiswa00 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    public Mahasiswa00() {
    }

    public Mahasiswa00(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void tampilkanInformasi() {
        System.out.printf("%-10s %-10s %-5s %.1f\n", nama, nim, kelas, ipk);
    }
}