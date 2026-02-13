public class Fungsi07 {
    public static void main(String[] args) {
        
        int stok[][] = {{10, 5, 15, 7}, 
                        {6, 11, 9, 12}, 
                        {2, 10, 10, 5}, 
                        {5, 7, 12, 9}};
        int[] harga = {75000, 50000, 60000, 10000};

        tampilkanPendapatan(stok, harga);
    }

    static void tampilkanPendapatan(int[][] stok, int[] harga) {

        for (int i = 0; i < stok.length; i++) {

            int totalPendapatan = 0;

            for (int j = 0; j < stok[i].length; j++) {
                totalPendapatan += stok[i][j] * harga[j];
            }

            System.out.println("RoyalGarden " + (i + 1));
            System.out.println("Pendapatan : Rp " + totalPendapatan);

            if (totalPendapatan > 1500000) {
                System.out.println("Status     : Sangat Baik");
            } else {
                System.out.println("Status     : Perlu Evaluasi");
            }

            System.out.println("--------------------------------");
        }

    }
}
