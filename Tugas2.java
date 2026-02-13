import java.util.Scanner;

public class Tugas2 {

    static Scanner sc = new Scanner(System.in);
    static String[][] jadwal;
    static int n;

    static void menu() {
        System.out.println("=== Sistem Penjadwalan Kuliah ===");
        System.out.println("1. Input Jadwal Kuliah");
        System.out.println("2. Tampilkan Jadwal Kuliah");
        System.out.println("3. Cari Jadwal Kuliah berdasarkan hari tertentu");
        System.out.println("4. Cari Jadwal Kuliah berdasarkan mata kuliah tertentu");
        System.out.println("5. Keluar");
        System.out.print("Pilih menu (1-5): ");
    }

    static void inputJadwal(int n) {

        for (int i = 0; i < n; i++) {

            System.out.println("\nJadwal ke-" + (i + 1));

            System.out.print("Nama Mata Kuliah : ");
            jadwal[i][0] = sc.nextLine();

            System.out.print("Ruang            : ");
            jadwal[i][1] = sc.nextLine();

            System.out.print("Hari             : ");
            jadwal[i][2] = sc.nextLine();

            System.out.print("Jam              : ");
            jadwal[i][3] = sc.nextLine();
        }
    }

    static void tampilkanSemua(int n) {

        if (jadwal.length == 0) {
            System.out.println("Tidak ada data jadwal.");
            return;
        }

        System.out.println("\n===== Semua Jadwal Kuliah =====");

        System.out.printf("%-25s %-20s %-10s %-15s\n",
                "Nama MK", "Ruang", "Hari", "Jam");

        for (int i = 0; i < n; i++) {
            System.out.printf("%-25s %-20s %-10s %-15s\n",
                    jadwal[i][0],
                    jadwal[i][1],
                    jadwal[i][2],
                    jadwal[i][3]);
        }
    }

    static void cariBerdasarkanHari(int n) {

        if (jadwal.length == 0) {
            System.out.println("Tidak ada data jadwal.");
            return;
        }

        System.out.print("\nMasukkan hari yang dicari: ");
        String cariHari = sc.nextLine();

        System.out.println("Jadwal pada hari " + cariHari + ":");

        for (int i = 0; i < n; i++) {
            if (jadwal[i][2].equalsIgnoreCase(cariHari)) {

                System.out.printf("%-25s %-20s %-15s\n",
                        jadwal[i][0],
                        jadwal[i][1],
                        jadwal[i][3]);
            }
        }
    }

    static void cariBerdasarkanNama(int n) {

        if (jadwal.length == 0) {
            System.out.println("Tidak ada data jadwal.");
            return;
        }

        System.out.print("\nMasukkan nama mata kuliah yang dicari: ");
        String cariNama = sc.nextLine();

        for (int i = 0; i < n; i++) {
            if (jadwal[i][0].equalsIgnoreCase(cariNama)) {

                System.out.println("Detail Jadwal:");
                System.out.println("Nama MK : " + jadwal[i][0]);
                System.out.println("Ruang   : " + jadwal[i][1]);
                System.out.println("Hari    : " + jadwal[i][2]);
                System.out.println("Jam     : " + jadwal[i][3]);
            }
        }
    }

    public static void main(String[] args) {

        while (true) {
            menu();
            int pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan jumlah jadwal kuliah: ");
                    n = sc.nextInt();
                    sc.nextLine();

                    jadwal = new String[n][4];

                    inputJadwal(n);
                    break;
                case 2 :
                    tampilkanSemua(n);
                    break;
                case 3 :
                    cariBerdasarkanHari(n);
                    break;
                case 4 :
                    cariBerdasarkanNama(n);
                    break;
                case 5 :
                    System.out.println("Keluar");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih menu yang tersedia.");
                    break;
            }
        }
   
    }
}
