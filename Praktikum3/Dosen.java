package Praktikum3;

public class Dosen {
    // Atribut
    public String kode;
    public String nama;
    public Boolean jeniskelamin; // true = Laki-laki, false = Perempuan
    public int usia;

    // Constructor berparameter
    public Dosen(String kode, String nama, Boolean jeniskelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jeniskelamin = jeniskelamin;
        this.usia = usia;
    }

    // Method untuk menampilkan informasi dosen
    public void cetakInfo() {
        System.out.println("Kode Dosen   : " + kode);
        System.out.println("Nama Dosen   : " + nama);
        System.out.println("Jenis Kelamin: " + (jeniskelamin ? "Laki-laki" : "Perempuan"));
        System.out.println("Usia         : " + usia + " tahun");
        System.out.println("--------------------------------------");
    }
}