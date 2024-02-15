import java.util.Scanner;

public class Perulangan_23 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan NIM: ");
        String nim = input.nextLine();

        // Mengambil 2-digit terakhir NIM
        int n = Integer.parseInt(nim.substring(nim.length() - 2));

        // Menambahkan 10 jika n kurang dari 10
        if (n < 10) {
            n += 10;
        }

        for (int i = 1; i <= n; i++) {
            if (i == 6 || i == 10) {
                continue;
            } else if (i % 2 == 0) {
                System.out.print(i + " ");
            } else {
                System.out.print("* ");
            }
        }

        System.out.println();
    }
}