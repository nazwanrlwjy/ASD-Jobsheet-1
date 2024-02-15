import java.util.Scanner;

public class Pemilihan_23 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menampilkan judul program
        System.out.println("PERHITUNGAN NILAI AKHIR MAHASISWA");
        System.out.println("=================================");

        // Membaca nilai tugas, kuis, UTS, dan UAS
        System.out.print("Masukkan Nilai Tugas  : ");
        int nilaiTugas = scanner.nextInt();

        System.out.print("Masukkan Nilai Kuis   : ");
        int nilaiKuis = scanner.nextInt();

        System.out.print("Masukkan Nilai UTS    : ");
        int nilaiUTS = scanner.nextInt();

        System.out.print("Masukkan Nilai UAS    : ");
        int nilaiUAS = scanner.nextInt();

        System.out.println("==================================");
        System.out.println("==================================");

        // Memeriksa validitas nilai
        boolean isNilaiValid = true;
        String nilaiYangTidakValid = "";

        if (nilaiTugas < 0 || nilaiTugas > 100) {
            isNilaiValid = false;
            nilaiYangTidakValid += "Nilai Tugas ";
        }

        if (nilaiKuis < 0 || nilaiKuis > 100) {
            isNilaiValid = false;
            nilaiYangTidakValid += "Nilai Kuis ";
        }

        if (nilaiUTS < 0 || nilaiUTS > 100) {
            isNilaiValid = false;
            nilaiYangTidakValid += "Nilai UTS ";
        }

        if (nilaiUAS < 0 || nilaiUAS > 100) {
            isNilaiValid = false;
            nilaiYangTidakValid += "Nilai UAS, ";
        }
    
        // Menampilkan output berdasarkan validitas nilai
        if (isNilaiValid) {
            // Menghitung nilai akhir
            double nilaiAkhir = 0.2 * nilaiTugas + 0.2 * nilaiKuis + 0.3 * nilaiUTS + 0.3 * nilaiUAS;
            System.out.println("==================================");
            System.out.println("==================================");
            // Menampilkan nilai akhir dan nilai huruf
            System.out.println("Nilai akhir: " + nilaiAkhir);

            // Menentukan nilai huruf
            String nilaiHuruf = "";
            if (nilaiAkhir >= 80) {
                nilaiHuruf = "A";
            } else if (nilaiAkhir >= 73) {
                nilaiHuruf = "B+";
            } else if (nilaiAkhir >= 65) {
                nilaiHuruf = "B";
            } else if (nilaiAkhir >= 60) {
                nilaiHuruf = "C+";
            } else if (nilaiAkhir >= 50) {
                nilaiHuruf = "C";
            } else if (nilaiAkhir >= 39) {
                nilaiHuruf = "D";
            } else {
                nilaiHuruf = "E";
            }

            // Menampilkan nilai huruf
            System.out.println("Nilai huruf: " + nilaiHuruf);
            System.out.println("==================================");
            System.out.println("==================================");
            // Menentukan keterangan lulus/tidak lulus
            String keterangan = "";
            if (nilaiHuruf.equals("A") || nilaiHuruf.equals("B+") || nilaiHuruf.equals("B") || nilaiHuruf.equals("C+") || nilaiHuruf.equals("C")) {
                keterangan = "SELAMAT ANDA LULUS";
            } else {
                keterangan = "ANDA DINYATAKAN TIDAK LULUS";
            }

            // Menampilkan keterangan lulus/tidak lulus
            System.out.println("Keterangan: " + keterangan);

        } else {
            // Menampilkan pesan error
            System.out.println("NILAI ANDA TIDAK VALID");
            System.out.println("Nilai yang tidak valid: " + nilaiYangTidakValid);
            System.out.println("==================================");
            System.out.println("==================================");
        }
    }
}
