package Jobsheet2;

public class MataKuliahMain07 {
    public static void main(String[] args) {
        MataKuliah07 matkul1 = new MataKuliah07();

        matkul1.kodeMK = "102938";
        matkul1.nama = "Praktikum ALgoritma dan Struktur Data";
        matkul1.sks = 3;
        matkul1.jumlahJam = 6;

        matkul1.tampilkanInformasi();
        matkul1.ubahSKS(2);
        matkul1.tambahJam(1);
        matkul1.kurangiJam(5);
        matkul1.tampilkanInformasi();

        MataKuliah07 matkul2 = new MataKuliah07("192837", "Teori Algoritma dan Struktur Data", 2, 4);

        matkul2.tambahJam(1);
        matkul2.kurangiJam(2);
        matkul2.tampilkanInformasi();

    }

    
}
