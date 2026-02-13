import java.util.Scanner;

public class Pemilihan07 {
    public static void main (String []args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("=============================");

        System.out.print("Masukkan Nilai Tugas : ");
        double tugas = sc.nextDouble();
        
        System.out.print("Masukkan Nilai Kuis : ");
        double kuis = sc.nextDouble();

        System.out.print("Masukkan Nilai UTS : ");
        double uts = sc.nextDouble();

        System.out.print("Masukkan Nilai UAS : ");
        double uas = sc.nextDouble();

        System.out.println("============================");
        System.out.println("============================");

        double nilaiAkhir = (tugas * 0.2) + (kuis * 0.2) + (uts * 0.3) + (uas * 0.3);

        if (tugas < 0 || tugas > 100 || kuis > 100 || uts > 100 || uas > 100) {
             System.out.println("nilai  tidak valid");
        } 

        System.out.printf("Nilai Akhir : %.2f%n" , nilaiAkhir);

        if (nilaiAkhir >= 80) {
            System.out.println("Nilai Huruf : A");
        } else if (nilaiAkhir >= 73) {
            System.out.println("Nilai Huruf : B+");
        } else if (nilaiAkhir >= 65) {
            System.out.println("Nilai Huruf : B");
        } else if (nilaiAkhir >= 60) {
            System.out.println("Nilai Huruf : C+");
        } else if (nilaiAkhir >= 50) {
            System.out.println("Nilai Huruf : C");
        } else if (nilaiAkhir >= 39) {
            System.out.println("Nilai Huruf : D");
        } else {
            System.out.println("Nilai Huruf : E");
        }

        System.out.println("============================");
        System.out.println("============================");

        if (nilaiAkhir >= 50) {
            System.out.println("SELAMAT ANDA LULUS");
            return;
        } 
        
        sc.close();
    }
}