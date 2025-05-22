package Pertemuan12;

public class Mahasiswa01 {
    private String nim;
    private String nama;
    private String jurusan;

    public Mahasiswa01(String nim, String nama, String jurusan) {
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void displayInfo() {
        System.out.printf("%-10s %-20s %-15s\n", nim, nama, jurusan);
    }
}