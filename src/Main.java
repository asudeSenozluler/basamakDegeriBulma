import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int sayi;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayıyı girin: ");
        sayi = scanner.nextInt();

        if (sayi < 250 || sayi > 100000) {
            System.out.println("250 ile 100000 arası sayı giriniz");

        } else {
            int sayac = 0;
            while (sayi > 0) {
                sayi /= 10;
                sayac++;
            }
            System.out.println("Girdiginiz sayi " + sayac + " basamaklıdır.");
            // write your code here
        }
    }
}
