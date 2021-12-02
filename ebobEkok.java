package pratikler;

import java.util.Scanner;

public class ebobEkok {
    public static void main(String[] args) {
        int sayi1, sayi2, sayi3, sayi4, ebob1 = 1, ebob2 = 1, ekok1 = 1, ekok2 = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("1. Sayıyı giriniz: ");
        sayi3 = input.nextInt();

        System.out.print("2. Sayıyı giriniz: ");
        sayi4 = input.nextInt();
        int y = 1;
        while (y <= sayi3) {
            if (sayi3 % y == 0 && sayi4 % y == 0) {
                ebob2 = y;
            }
            y++;
        }
        System.out.println("EBOB: " + ebob2);

        int a = 1;
        while (a <= sayi3 * sayi4) {
            if (a % sayi3 == 0 && a % sayi4 == 0) {
                ekok2 = a;
                break;
            }
            a++;
        }
        System.out.println("EKOK: " + ekok2);
    }

}
