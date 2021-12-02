package ödev;

import java.util.Scanner;

public class asalSayıBulan {
    static int asal(int x, int y) {
        if (y < x) {
            if (x % y != 0) {
                return (asal(x, ++y));
            } else {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        int sayi;
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı Giriniz: ");
        sayi = input.nextInt();

        if (asal(sayi, 2) == 1) {
            System.out.println(sayi + " sayısı ASALDIR !");
        } else {
            System.out.println(sayi + " sayısı ASAL değildir !");
        }

    }

}
