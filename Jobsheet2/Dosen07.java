package Jobsheet2;

public class Dosen07 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    public Dosen07() {

    }

    public Dosen07(String idDs, String nm, boolean staktf, int thn, String bidAhli) {
        idDosen = idDs;
        nama = nm;
        statusAktif = staktf;
        tahunBergabung = thn;
        bidangKeahlian = bidAhli;
    }

    void tampilkanInformasi() {
        System.out.println("ID Dosen: " + idDosen);
        System.out.println("Nama Dosen: " + nama);
        System.out.println("Status: " + (statusAktif ? "Aktif":"Tidak Aktif"));
        System.out.println("Tahun Bergabung: " + tahunBergabung);
        System.out.println("Masa Kerja: " + hitungMasaKerja(2026) + " Tahun");
        System.out.println("Bidang Keahlian: " + bidangKeahlian);
        System.out.println();

    }

    void setStatusAktif(boolean status) {
        statusAktif = status;
    }

    int hitungMasaKerja(int thnSkrg) {
        int lamaBergabung = thnSkrg - tahunBergabung;
        return lamaBergabung;
    }

    void ubahKeahlian(String bidang) {
        bidangKeahlian = bidang;
    }

    
}
