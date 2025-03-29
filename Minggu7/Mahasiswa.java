package Minggu7;

public class Mahasiswa {
    private String nim;
    private String nama;
    private String kelas;
    private double ipk;

    public Mahasiswa(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getKelas() {
        return kelas;
    }

    public double getIpk() {
        return ipk;
    }

    public void tampilInformasi() {
        System.out.println("NIM\t          : " + nim);
        System.out.println("Nama\t         : " + nama);
        System.out.println("Kelas\t        : " + kelas);
        System.out.printf("IPK\t    : %.1f\n", ipk);
    }
}