package pratikler;

import java.util.Scanner;

public class minMax {
    public static void main(String[] args) {
        int sayiN, sayi, buyukSay = 0, kucukSay = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Kaç tane sayı gireceksiniz: ");
        sayiN = input.nextInt();

        for (int x = 1; x <= sayiN; x++) {
            System.out.print(x + ". Sayıyı giriniz: ");
            sayi = input.nextInt();

            if (sayi > buyukSay) {
                if (kucukSay == 0) {
                    kucukSay = sayi;
                }
                buyukSay = sayi;
            }

            if (sayi < kucukSay) {
                if (buyukSay == 0) {
                    buyukSay = sayi;
                }
                kucukSay = sayi;
            }
        }
        System.out.println("En büyük sayı: " + buyukSay);
        System.out.println("En küçük sayı: " + kucukSay);
    }

}
