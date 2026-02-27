package Jobsheet3;

public class DataDosen07 {
    public int jmlL = 0;
    public int jmlP = 0;


    void dataSemuaDosen(Dosen07[] arrayOfDosen07) {
        for (int i = 0; i < 3; i++) {
            System.out.println("Data Dosen ke-" + (i+1) );
            System.out.println("Kode          : " + arrayOfDosen07[i].kode);
            System.out.println("Nama          : " + arrayOfDosen07[i].nama);
            System.out.println("Jenis Kelamin : " + (arrayOfDosen07[i].jenisKelamin ? "Laki-laki" : "Perempuan"));
            System.out.println("Usia          : " + arrayOfDosen07[i].usia);
            System.out.println("---------------------------------------");
        }
    }

    void jumlahDosenPerJenisKelamin(Dosen07[] arrayOfDosen07) {
        for (int i = 0; i < 3; i++) {
            if (arrayOfDosen07[i].jenisKelamin) {
                jmlL++;
            } else {
                jmlP++;
            }
        }

        System.out.println("Jumlah Dosen Laki-laki : " + jmlL);
        System.out.println("Jumlah Dosen Perempuan : " + jmlP);
    }

    void retataUsiaDosenPerJenisKelamin(Dosen07[] arrayOfDosen07) {
        int totalUsiaL = 0, totalUsiaP = 0;
        
        for (int i = 0; i < 3; i++) {
            if (arrayOfDosen07[i].jenisKelamin) {
                totalUsiaL += arrayOfDosen07[i].usia;
                jmlL++; 
            } else {
                totalUsiaP += arrayOfDosen07[i].usia;
                jmlP++;
            }
        }

        double rataL = (jmlL > 0) ? (double) totalUsiaL / jmlL : 0;
        double rataP = (jmlP > 0) ? (double) totalUsiaP / jmlP : 0;

        System.out.println("Rata-rata Usia Dosen Laki-laki : " + rataL);
        System.out.println("Rata-rata Usia Dosen Perempuan : " + rataP);
    }

    void infoDosenPalingTua(Dosen07[] arrayOfDosen07) {
        Dosen07 dosenTertuaDosen07 = arrayOfDosen07[0];

        for (int i = 0; i < 3; i++) {
            if (arrayOfDosen07[i].usia > dosenTertuaDosen07.usia) {
                dosenTertuaDosen07 = arrayOfDosen07[i];
            }
        }

        System.out.println("=== Dosen Paling Tua ===");
        System.out.println("Kode  : " + dosenTertuaDosen07.kode);
        System.out.println("Nama  : " + dosenTertuaDosen07.nama);
        System.out.println("Jenis Kelamin : " + (dosenTertuaDosen07.jenisKelamin ? "Laki-laki" : "Perempuan"));
        System.out.println("Usia  : " + dosenTertuaDosen07.usia);
    }

    void infoDosenPalingMuda(Dosen07[] arrayOfDosen07) {
        Dosen07 dosenTermudaDosen07 = arrayOfDosen07[0];

        for (int i = 0; i < 3; i++) {
            if (arrayOfDosen07[i].usia < dosenTermudaDosen07.usia) {
                dosenTermudaDosen07 = arrayOfDosen07[i];
            }
        }

        System.out.println("=== Dosen Paling Muda ===");
        System.out.println("Kode  : " + dosenTermudaDosen07.kode);
        System.out.println("Nama  : " + dosenTermudaDosen07.nama);
        System.out.println("Jenis Kelamin : " + (dosenTermudaDosen07.jenisKelamin ? "Laki-laki" : "Perempuan"));
        System.out.println("Usia  : " + dosenTermudaDosen07.usia);
    }    
}
