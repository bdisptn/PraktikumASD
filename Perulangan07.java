import java.util.Scanner;

public class Perulangan07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input NIM : ");
        long nim = sc.nextLong();
        int n = (int) (nim % 100);

        System.out.println("maka n : " + n);
        System.out.print("Output : ");

        for (int i = 1; i <= n; i++) {
            if (i == 10 || i == 15) {
                continue;
            }

            if (i % 3 == 0) {
                System.out.print("# ");
            } else if (i % 2 == 1) {
                System.out.print("* ");
            } else {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}
