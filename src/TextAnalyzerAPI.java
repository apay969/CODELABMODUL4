import java.util.Scanner;

public class TextAnalyzerAPI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Selamat datang di Text Analyzer!");
        System.out.print("Masukkan teks: ");
        String teks = input.nextLine();

        // Menampilkan pilihan menu
        int pilihan = 0;
        while (pilihan != 4) {
            System.out.println("\nPilih operasi:");
            System.out.println("1. Hitung Jumlah Karakter");
            System.out.println("2. Hitung Jumlah Kata");
            System.out.println("3. Cari Kata dalam Teks");
            System.out.println("4. Keluar");
            System.out.print("Masukkan nomor operasi: ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    hitungJumlahKarakter(teks);
                    break;
                case 2:
                    hitungJumlahKata(teks);
                    break;
                case 3:
                    cariKata(teks);
                    break;
                case 4:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }

        input.close();
    }

    private static void hitungJumlahKarakter(String teks) {
        int jumlahKarakter = teks.length();
        System.out.println("Jumlah karakter dalam teks: " + jumlahKarakter);
    }

    private static void hitungJumlahKata(String teks) {
        String[] kataArray = teks.split("\\s+");
        int jumlahKata = kataArray.length;
        System.out.println("Jumlah kata dalam teks: " + jumlahKata);
    }

    private static void cariKata(String teks) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan kata yang ingin dicari: ");
        String kataCari = input.nextLine();

        if (!kataCari.isEmpty()) {
            int jumlahKemunculan = 0;
            for (String kata : teks.split("\\s+")) {
                if (kata.equalsIgnoreCase(kataCari)) {
                    jumlahKemunculan++;
                }
            }

            System.out.println("Jumlah kemunculan kata '" + kataCari + "' dalam teks: " + jumlahKemunculan);
        } else {
            System.out.println("Kata yang dicari tidak valid.");
        }
    }
}
