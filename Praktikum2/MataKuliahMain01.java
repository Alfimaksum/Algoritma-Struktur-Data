package Praktikum2;

public class MataKuliahMain01 {
    public static void main(String[] args) {
        // Instansiasi objek MataKuliah menggunakan konstruktor default
        MataKuliah mk1 = new MataKuliah();
        System.out.println("=== Informasi Mata Kuliah 1 (Default) ===");
        mk1.tampilInformasi();

        // Instansiasi objek MataKuliah menggunakan konstruktor berparameter
        MataKuliah mk2 = new MataKuliah("MK001", "Algoritma dan Struktur Data", 3, 4);
        System.out.println("=== Informasi Mata Kuliah 2 (Diberikan Parameter) ===");
        mk2.tampilInformasi();

        // Mengubah SKS mk1
        System.out.println("=== Mengubah SKS Mata Kuliah 1 ===");
        mk1.ubahSKS(2);
        mk1.tampilInformasi();

        // Menambahkan jam mk2
        System.out.println("=== Menambahkan Jam Mata Kuliah 2 ===");
        mk2.tambahJam(2);
        mk2.tampilInformasi();

        // Mengurangi jam mk2
        System.out.println("=== Mengurangi Jam Mata Kuliah 2 ===");
        mk2.kurangiJam(1);
        mk2.tampilInformasi();
    }
}
