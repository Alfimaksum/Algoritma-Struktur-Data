package Minggu7;

import java.util.Scanner;
class Mahasiswa {
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
}

class MahasiswaBerprestasi01 {
    private Mahasiswa[] listMhs;
    private int elemen;

    public MahasiswaBerprestasi01() {
        listMhs = new Mahasiswa[5];
        elemen = 0;
    }

    public void tambah(Mahasiswa mhs) {
        if (elemen < listMhs.length) {
            listMhs[elemen] = mhs;
            elemen++;
        }
    }

    public void tampilData() {
        for (int i = 0; i < elemen; i++) {
            System.out.println("Nama    : " + listMhs[i].getNama());
            System.out.println("NIM     : " + listMhs[i].getNim());
            System.out.println("Kelas   : " + listMhs[i].getKelas());
            System.out.println("IPK     : " + listMhs[i].getIpk());
            System.out.println("-----------------------");
        }
    }

    public int sequentialSearching(double cari) {
        int posisi = -1;
        for (int j = 0; j < elemen; j++) {
            if (listMhs[j].getIpk() == cari) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    public void tampilPosisi(double x, int pos) {
        if (pos != -1) {
            System.out.println("data mahasiswa dengan IPK :" + x + " ditemukan pada indeks :" + pos);
        } else {
            System.out.println("data " + x + " tidak ditemukan");
        }
    }

    public void tampilDataSearch(double x, int pos) {
        if (pos != -1) {
            System.out.println("nim    : " + listMhs[pos].getNim());
            System.out.println("nama   : " + listMhs[pos].getNama());
            System.out.println("kelas  : " + listMhs[pos].getKelas());
            System.out.println("ipk    : " + x);
        } else {
            System.out.println("Data mahasiswa dengan IPK " + x + " tidak ditemukan");
        }
    }
}

public class MahasiswaDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MahasiswaBerprestasi list = new MahasiswaBerprestasi();

        // Input data mahasiswa
        for (int i = 0; i < 5; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            String nim = sc.nextLine();
            System.out.print("Nama  : ");
            String nama = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK   : ");
            double ipk = sc.nextDouble();
            sc.nextLine(); // consume newline
            System.out.println("----------------");

            list.tambah(new Mahasiswa(nim, nama, kelas, ipk));
        }

        // Tampilkan semua data
        System.out.println("\nData Mahasiswa:");
        list.tampilData();

        // Pencarian data
        System.out.println("\nPencarian data");
        System.out.println("---------");
        System.out.print("Masukkan IPK mahasiswa yang dicari:\nIPK: ");
        double cari = sc.nextDouble();
        
        System.out.println("menggunakan sequential searching");
        int posisi = list.sequentialSearching(cari);
        
        list.tampilPosisi(cari, posisi);
        list.tampilDataSearch(cari, posisi);
        
        sc.close();
    }
}