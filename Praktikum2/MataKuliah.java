package Praktikum2;

public class MataKuliah {
    // Atribut
    private String kodeMK;
    private String nama;
    private int sks;
    private int jumlahJam;
    
    // Konstruktor default
    public MataKuliah() {
        this.kodeMK = "";
        this.nama = "";
        this.sks = 0;
        this.jumlahJam = 0;
    }

    // Konstruktor berparameter
    public MataKuliah(String kodeMK, String nama, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    // Method untuk menampilkan informasi mata kuliah
    public void tampilInformasi() {
        System.out.println("Kode MK     : " + kodeMK);
        System.out.println("Nama        : " + nama);
        System.out.println("SKS         : " + sks);
        System.out.println("Jumlah Jam  : " + jumlahJam);
    }

    // Method untuk mengubah SKS
    public void ubahSKS(int sksBaru) {
        this.sks = sksBaru;
        System.out.println("SKS telah diubah menjadi: " + sksBaru);
    }

    // Method untuk menambahkan jam
    public void tambahJam(int jam) {
        this.jumlahJam += jam;
        System.out.println("Jam telah ditambahkan. Jumlah jam sekarang: " + jumlahJam);
    }

    // Method untuk mengurangi jam
    public void kurangiJam(int jam) {
        if (this.jumlahJam >= jam) {
            this.jumlahJam -= jam;
            System.out.println("Jam telah dikurangi. Jumlah jam sekarang: " + jumlahJam);
        } else {
            System.out.println("Pengurangan jam tidak dapat dilakukan. Jumlah jam tidak mencukupi.");
        }
    }
}