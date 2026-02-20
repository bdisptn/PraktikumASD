package Jobsheet2;

public class MataKuliah07 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    public MataKuliah07() {

    }

    public MataKuliah07(String kdMK, String nm, int sks, int jmlJam) {
        kodeMK = kdMK;
        nama = nm;
        this.sks = sks;
        jumlahJam = jmlJam;
    }

    void tampilkanInformasi() {
        System.out.println("Kode Mata Kuliah: " + kodeMK);
        System.out.println("Nama Mata Kuliah: " + nama);
        System.out.println("SKS: " + sks);
        System.out.println("Jumlah jam: " + jumlahJam);
        System.out.println();
    }

    void ubahSKS(int sksBaru) {
        sks = sksBaru;
        System.out.println("SKS telah diubah");
    }

    void tambahJam(int jam) {
        jumlahJam += jam;
    }

    void kurangiJam(int jam) {
        if (!(jumlahJam - jam == 0)) {
            jumlahJam -= jam;
        } else {
            System.out.println("Pengguna tidak dapat mengurangi jam\n");
        }
    }
}
