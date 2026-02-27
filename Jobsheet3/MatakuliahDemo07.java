package Jobsheet3;

import java.util.Scanner;

public class MatakuliahDemo07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah matakuliah: ");
        int n = Integer.parseInt(sc.nextLine());

        Matakuliah07[] arrayOfMatakuliah07 = new Matakuliah07[n];
        String kode, nama, dummy;
        int sks, jumlahJam;
        
        for (int i = 0; i < arrayOfMatakuliah07.length; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i+1));
            System.out.print("Kode    : ");
            kode = sc.nextLine();
            System.out.print("Nama    : ");
            nama = sc.nextLine();
            System.out.print("SKS     : ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam  : ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("----------------------------");

            arrayOfMatakuliah07[i] = new Matakuliah07(kode, nama, sks, jumlahJam);

            arrayOfMatakuliah07[i].tambahData(kode, nama, sks, jumlahJam);

        }

        for (int i = 0; i < arrayOfMatakuliah07.length; i++) {
            System.out.println("Data Matakuliah ke-" + (i+1));
            arrayOfMatakuliah07[i].cetakInfo();
        }

        

        sc.close();
    }
}
