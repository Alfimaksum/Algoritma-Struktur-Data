package Praktikum2;

public class DosenMain {
    public static void main(String[] args) {
        // Instansiasi objek Dosen menggunakan konstruktor default
        Dosen dosen1 = new Dosen();
        dosen1.tampilInformasi(); // Menampilkan informasi default

        // Instansiasi objek Dosen menggunakan konstruktor berparameter
        Dosen dosen2 = new Dosen("D001", "Dr. Ahmad", true, 2010, "Ilmu Komputer");
        dosen2.tampilInformasi(); // Menampilkan informasi yang diinisialisasi

        // Mengubah status aktif dosen1
        dosen1.setStatusAktif(true);
        dosen1.ubahKeahlian("Matematika");
        dosen1.tampilInformasi(); // Menampilkan informasi setelah diubah

        // Menghitung masa kerja dosen2
        int masaKerja = dosen2.hitungMasaKerja(2023);
        System.out.println("Masa Kerja Dosen2: " + masaKerja + " tahun");
    }
}