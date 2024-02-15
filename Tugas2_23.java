import java.util.Scanner;

public class Tugas2_23 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            menu();
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    double s = inputS(scanner);
                    double t = inputT(scanner);
                    hitungKecepatan(s, t);
                    break;
                case 2:
                    double v2 = inputV(scanner);
                    double t2 = inputT(scanner);
                    hitungJarak(v2, t2);
                    break;
                case 3:
                    double s3 = inputS(scanner);
                    double v3 = inputV(scanner);
                    hitungWaktu(s3, v3);
                    break;
                case 4:
                    System.out.println("-----------------------------------------");
                    System.out.println("Terima kasih!");
                    System.out.println("=========================================");
                    break;
                default:
                    System.out.println("-----------------------------------------");
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
                    System.out.println("=========================================");
            }
        } while (pilihan != 4);

        scanner.close();
    }

    public static void menu() {
        System.out.println("=== Rumus Kecepatan, Jarak, dan Waktu ===");
        System.out.println("1. Hitung Kecepatan");
        System.out.println("2. Hitung Jarak");
        System.out.println("3. Hitung Waktu");
        System.out.println("4. Keluar");
        System.out.println("-----------------------------------------");
        System.out.print("Masukkan pilihan Anda: ");
    }

    public static double inputS(Scanner scanner) {
        System.out.println("-----------------------------------------");
        System.out.print("Masukkan jarak (s): ");
        return scanner.nextDouble();
    }

    public static double inputV(Scanner scanner) {
        System.out.print("Masukkan kecepatan (v): ");
        return scanner.nextDouble();
    }

    public static double inputT(Scanner scanner) {
        System.out.print("Masukkan waktu (t): ");
        return scanner.nextDouble();
    }

    public static void hitungKecepatan(double s, double t) {
        double v = s / t;
        System.out.printf("Kecepatan: %.2f\n\n", v);
    }

    public static void hitungJarak(double v, double t) {
        double s = v * t;
        System.out.printf("Jarak: %.2f\n\n", s);
    }

    public static void hitungWaktu(double s, double v) {
        double t = s / v;
        System.out.printf("Waktu: %.2f\n\n", t);
    }
}