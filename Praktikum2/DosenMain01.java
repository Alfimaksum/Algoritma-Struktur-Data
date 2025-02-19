package Praktikum2;

public class DosenMain01 {
    public static void main(String[] args) {
        // Instansiasi objek Dosen menggunakan konstruktor default
        Dosen dosen1 = new Dosen();
        System.out.println("=== Informasi Dosen 1 (Default) ===");
        dosen1.tampilInformasi();

        // Instansiasi objek Dosen menggunakan konstruktor berparameter
        Dosen dosen2 = new Dosen("D001", "Dr. Maksum", true, 2010, "Ilmu Komputer");
        System.out.println("=== Informasi Dosen 2 (Diberikan Parameter) ===");
        dosen2.tampilInformasi();

        // Mengubah status aktif dan keahlian dosen1
        System.out.println("=== Mengubah Status dan Keahlian Dosen 1 ===");
        dosen1.setStatusAktif(true);
        dosen1.ubahKeahlian("Matematika");
        dosen1.tampilInformasi();

        // Menghitung masa kerja dosen2
        System.out.println("=== Menghitung Masa Kerja Dosen 2 ===");
        int masaKerja = dosen2.hitungMasaKerja(2023);
        System.out.println("Masa Kerja Dosen2: " + masaKerja + " tahun\n");
    }
}
