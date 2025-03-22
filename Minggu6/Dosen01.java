package Minggu6;

public class Dosen01 {
    String kode;
    String nama;
    boolean jenisKelamin;
    int usia;

    // Constructor
    Dosen01(String kode, String nama, boolean jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }

    // Method untuk menampilkan informasi dosen
    void tampil() {
        System.out.println("Kode            : " + kode);
        System.out.println("Nama            : " + nama);
        System.out.println("Jenis Kelamin   : " + (jenisKelamin ? "Laki-laki" : "Perempuan"));
        System.out.println("Usia            : " + usia);
        System.out.println("--------------------------");
    }
}