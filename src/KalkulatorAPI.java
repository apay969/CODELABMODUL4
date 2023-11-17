import java.util.Scanner;
public class KalkulatorAPI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Selamat datang di Kalkulator Sederhana!");
        System.out.print("Masukkan bilangan pertama: ");
        double angka1 = input.nextDouble();

        System.out.print("Masukkan bilangan kedua: ");
        double angka2 = input.nextDouble();

        System.out.println("\nPilih operasi:");
        System.out.println("1. Akar Kuadrat");
        System.out.println("2. Pangkat");
        System.out.println("3. Logaritma Natural (basis e)");
        System.out.println("4. Factorial");
        System.out.print("Masukkan nomor operasi: ");
        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                double akarKuadrat1 = Math.sqrt(angka1);
                double akarKuadrat2 = Math.sqrt(angka2);
                System.out.println("Akar kuadrat dari " + angka1 + " = " + akarKuadrat1);
                System.out.println("Akar kuadrat dari " + angka2 + " = " + akarKuadrat2);
                break;

            case 2:
                double pangkat1 = Math.pow(angka1, angka2);
                System.out.println(angka1 + " pangkat " + angka2 + " = " + pangkat1);
                break;

            case 3:
                double logaritma1 = Math.log(angka1);
                double logaritma2 = Math.log(angka2);
                System.out.println("Logaritma natural dari " + angka1 + " = " + logaritma1);
                System.out.println("Logaritma natural dari " + angka2 + " = " + logaritma2);
                break;

            case 4:
                long factorial1 = factorial((int) angka1);
                long factorial2 = factorial((int) angka2);
                System.out.println(angka1 + "! = " + factorial1);
                System.out.println(angka2 + "! = " + factorial2);
                break;

            default:
                System.out.println("Pilihan tidak valid.");
        }

        input.close();
    }

    private static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
