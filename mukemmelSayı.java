package pratikler;

import java.util.Scanner;

public class mukemmelSayı {
    public static void main(String[] args) {
        int sayi, sonuc = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        sayi = input.nextInt();

        for (int x = 1; x < sayi; x++) {
            if (sayi % x == 0) {

                sonuc += x;
            }
        }

        if (sayi == sonuc) {
            System.out.print(sayi + " Mükemmel sayıdır.");
        } else {
            System.out.print(sayi + " Mükemmel sayı değildir.");
        }
    }

}