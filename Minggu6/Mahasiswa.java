package Minggu6;

public class Mahasiswa {
    String nim;
    String nama;
    String kelas;
    double ipk;

    // Constructor default
    Mahasiswa() {
    }

    // Constructor berparameter
    Mahasiswa(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    // Method untuk menampilkan informasi mahasiswa
    void tampilInformasi() {
        System.out.println("NIM     : " + nim);
        System.out.println("Nama    : " + nama);
        System.out.println("Kelas   : " + kelas);
        System.out.println("IPK     : " + ipk);
    }
}