package Minggu7;

public class Dosen {
    private String nama;
    private String nip;
    private int usia;
    private String mataKuliah;

    public Dosen(String nama, String nip, int usia, String mataKuliah) {
        this.nama = nama;
        this.nip = nip;
        this.usia = usia;
        this.mataKuliah = mataKuliah;
    }

    // Getter methods
    public String getNama() {
        return nama;
    }

    public String getNip() {
        return nip;
    }

    public int getUsia() {
        return usia;
    }

    public String getMataKuliah() {
        return mataKuliah;
    }

    // Method untuk menampilkan informasi
    public void tampilInformasi() {
        System.out.println("Nama\t\t        : " + nama);
        System.out.println("NIP\t\t         : " + nip);
        System.out.println("Usia\t\t        : " + usia);
        System.out.println("Mata Kuliah\t   : " + mataKuliah);
    }
}