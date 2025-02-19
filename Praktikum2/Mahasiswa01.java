package Praktikum2;

public class Mahasiswa01 {
    public static void main(String[] args) {
        // Instansiasi objek Mahasiswa
        Mahasiswa mhs1 = new Mahasiswa();

        // Mengisi nilai atribut 
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        // Menampilkan informasi awal
        System.out.println("Informasi Awal:");
        mhs1.tampilkanInfo();

        // Mengubah kelas dan IPK g
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIpk(3.60);

        // Menampilkan informasi setelah diubah
        System.out.println("\nInformasi Setelah Diubah:");
        mhs1.tampilkanInfo();

        // Instansiasi objek Mahasiswa menggunakan konstruktor berparameter
        Mahasiswa mhs2 = new Mahasiswa("Annisa Nabila", "2141720160", 3.25, "TI 21");

        // Mengupdate IPK mhs2
        mhs2.updateIpk(3.30);

        // Menampilkan informasi mhs2
        System.out.println("\nInformasi Mahasiswa 2:");
        mhs2.tampilkanInfo();

        // Membuat objek baru dengan nama mhsMaksum menggunakan konstruktor berparameter
        Mahasiswa mhsMaksum = new Mahasiswa("Maksum", "24410706009", 3.5, "A");

        // Menampilkan informasi mahasiswa
        mhsMaksum.tampilkanInfo();
    }
}