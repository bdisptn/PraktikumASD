package Jobsheet2;

public class Mahasiswa07 {
    String nama;
    String nim;
    String kelas;
    double ipk;

    public Mahasiswa07() {

    }

    public Mahasiswa07(String nm, String nim, String kls, double ipk) {
        nama = nm;
        this.nim = nim;
        this.ipk = ipk;
        kelas = kls;
    }

    void tampilkanInformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Kelas: " + kelas);
        System.out.println("IPK: " + ipk);
        System.out.println();
    }

    void ubahKelas(String kelasBaru) {
        kelas = kelasBaru;
    }

    void updateIpk(double ipkBaru) {
        if (0.0 >= ipkBaru || 4.0 <= ipkBaru) {
            ipk = ipkBaru;
        } else {
            System.out.println("IPK tidak valid. Harus diantara 0.0 dan 4.0\n");
        } 
       
    }

    String nilaiKinerja() {
        if (ipk >= 3.5) {
            return "Kinerja sangat baik";
        } else if (ipk >= 3.0) {
            return "Kinerja baik";
        } else if (ipk >= 2.0) {
            return "Kinerja cukup";
        } else {
            return "Kinerja kurang";
        }
    }

}

