import java.util.Scanner;

public class Array07 {

    static Scanner sc = new Scanner (System.in);

       
    static String[] namaMK = {
        "Pancasila",
        "Konsep Teknologi Informasi",
        "CriticaL Thinking dan Problem Solving",
        "Mataematika Dasar",
        "Bahasa Inggris",
        "Dasar Pemograman",
        "Praktikum Dasar Pemograman",
        "Keselamatan dan Kesehatan Kerja"};

    static double[] nilaiAngka = new double[namaMK.length];
    static String[] nilaiHuruf = new String[namaMK.length];
    static double[] nilaiBobot = new double[namaMK.length];

    static void inputNilai() {
        for (int i = 0; i < namaMK.length;i++) {
            System.out.print("Masukkan nilai angka untuk MK " + namaMK[i] + ": ");
            nilaiAngka[i] = sc.nextDouble();
            
        }
  
    }

    static String konversiNilaiHuruf(double h) {
        if (h > 80 && h <= 100) {
            return "A";
        } else if (h > 73 && h <= 80) {
            return "B+";
        } else if (h > 65 && h <= 73) {
            return "B";
        } else if (h > 60 && h <= 65) {
            return "C+";
        } else if (h > 50 && h <= 60) {
            return "C";
        } else if (h > 39 && h <= 50) {
            return "D";
        } else {
            return "E";
        }
        
    }

    static double konversiNilaiBobot(String b) {

        double bobot;

        switch (b) {
            case "A":
                bobot = 4.0;
                break;
            case "B+" :
                bobot = 3.5;
                break;
            case "B" :
                bobot = 3.0;
                break;
            case "C+" :
                bobot = 2.5;
                break;
            case "C" :
                bobot = 2.0;
                break;
            case "D" :
                bobot = 1;
                break;
            case "E" :
                bobot = 0;
                break;
            default:
                bobot = -1;
            
        }

        return bobot;
    }

    static double hitungIP() {
        double totalBobot = 0;

        System.out.printf("%-45s %-15s %-15s %-15s\n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");

        for (int i = 0; i < namaMK.length; i++) {
            nilaiHuruf[i] = konversiNilaiHuruf(nilaiAngka[i]);
            nilaiBobot[i] = konversiNilaiBobot(nilaiHuruf[i]);

            totalBobot += nilaiBobot[i];

            System.out.printf("%-45s %-15.2f %-15s %-15.2f\n",
                    namaMK[i], nilaiAngka[i], nilaiHuruf[i], nilaiBobot[i]);
        }

        return totalBobot / namaMK.length;

    }
    

    public static void main(String[] args) {
        System.out.println("=========================");
        System.out.println("Program menghitung IP Semester");
        System.out.println("=========================");

        inputNilai();

        System.out.println("=========================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("=========================");

        double ipk = hitungIP();

        System.out.println("=========================");
        System.out.println("IP : " + ipk);

    
    }
        
}

