package Praktikum2;

public class Dosen {
    // Atribut
    private String idDosen;
    private String nama;
    private boolean statusAktif;
    private int tahunBergabung;
    private String bidangKeahlian;

    // Konstruktor default
    public Dosen() {
        this.idDosen = "";
        this.nama = "";
        this.statusAktif = false;
        this.tahunBergabung = 0;
        this.bidangKeahlian = "";
    }

    // Konstruktor berparameter
    public Dosen(String idDosen, String nama, boolean statusAktif, int tahunBergabung, String bidangKeahlian) {
        this.idDosen = idDosen;
        this.nama = nama;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }

    // Method untuk menampilkan informasi dosen
    public void tampilInformasi() {
        System.out.println("ID Dosen         : " + idDosen);
        System.out.println("Nama             : " + nama);
        System.out.println("Status Aktif     : " + (statusAktif ? "Aktif" : "Tidak Aktif"));
        System.out.println("Tahun Bergabung  : " + tahunBergabung);
        System.out.println("Bidang Keahlian  : " + bidangKeahlian);
    }

    // Method untuk mengatur status aktif dosen
    public void setStatusAktif(boolean status) {
        this.statusAktif = status;
    }

    // Method untuk menghitung masa kerja dosen
    public int hitungMasaKerja(int thnSkrg) {
        return thnSkrg - tahunBergabung;
    }

    // Method untuk mengubah bidang keahlian dosen
    public void ubahKeahlian(String bidang) {
        this.bidangKeahlian = bidang;
    }
}