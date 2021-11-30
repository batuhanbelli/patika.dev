package SonOdevler;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class sayıTahmin {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100);
        System.out.println(number);
        Scanner input = new Scanner(System.in);
        int kalanHak = 0;
        int select;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;

        while (kalanHak < 5) {
            System.out.print("Lütfen Tahmininizi Giriniz : ");
            select = input.nextInt();

            if (select < 0 || select > 99) {
                System.out.println("Lütfen 0-100 arasında bir değer giriniz.");
                if (isWrong) {
                    kalanHak++;
                    System.out.println("Çok fazla hatalı giriş yaptınız. Kalan hak : " + (5 - kalanHak));
                } else {
                    isWrong = true;
                    System.out.println("Bir daha hatalı girişinizde hakkınızdan düşülecektir.");
                }
                continue;
            }

            if (select == number) {
                System.out.println("Tebrikler Doğru Bildiniz ");
                isWin = true;
                break;
            } else {
                System.out.println("Yanlış Tahmin Girdiniz");
                if (select < number) {
                    System.out.println(select + " Gizli sayıdan küçüktür ");
                } else {
                    System.out.println(select + " Gizli sayıdan büyüktür ");
                }
                wrong[kalanHak++] = select;
                System.out.println("Kalan hakkı : " + (5 - kalanHak));
            }
        }
        if (!isWin) {
            System.out.println("Kaybettiniz ! ");
            if (!isWrong) {
                System.out.println("Tahminleriniz : " + Arrays.toString(wrong));
            }
        }
    }
}