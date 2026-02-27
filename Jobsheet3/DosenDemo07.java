package Jobsheet3;

import java.util.Scanner;

public class DosenDemo07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dosen07 arrayOfDosen07[] = new Dosen07[3];
        String kode, nama, dummy;
        boolean jenisKelamin;
        int usia;

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i+1));
            System.out.print("Kode        : ");
            kode = sc.nextLine();
            System.out.print("Nama        : ");
            nama = sc.nextLine();
            System.out.print("Jenis Kelamin (L/P)  : ");
            dummy = sc.nextLine();
            while (!dummy.equalsIgnoreCase("L") && !dummy.equalsIgnoreCase("P")) {
                if (!dummy.equalsIgnoreCase("L") && !dummy.equalsIgnoreCase("P")) {
                    System.out.println("Input salah! Masukkan P/L.");
                    System.out.print("Jenis Kelamin (L/P)  : ");
                    dummy = sc.nextLine();
                }
            }

            jenisKelamin = dummy.equalsIgnoreCase("L");
            
            System.out.print("Usia        : ");
            dummy = sc.nextLine();
            usia = Integer.parseInt(dummy);
            System.out.println("-------------------------------------");

            arrayOfDosen07[i] = new Dosen07(kode, nama, jenisKelamin, usia);
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Data Dosen ke-" + (i+1) );
            System.out.println("Kode          : " + arrayOfDosen07[i].kode);
            System.out.println("Nama          : " + arrayOfDosen07[i].nama);
            System.out.println("Jenis Kelamin : " + (arrayOfDosen07[i].jenisKelamin ? "Laki-laki" : "Perempuan"));
            System.out.println("Usia          : " + arrayOfDosen07[i].usia);
            System.out.println("---------------------------------------");
        }

        DataDosen07 arrayOfData07 = new DataDosen07();

        arrayOfData07.dataSemuaDosen(arrayOfDosen07);
        arrayOfData07.jumlahDosenPerJenisKelamin(arrayOfDosen07);
        arrayOfData07.retataUsiaDosenPerJenisKelamin(arrayOfDosen07);
        arrayOfData07.infoDosenPalingTua(arrayOfDosen07);
        arrayOfData07.infoDosenPalingMuda(arrayOfDosen07);

        sc.close();
    }

}
