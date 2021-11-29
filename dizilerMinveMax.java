package Diziler;

import java.util.Scanner;
import java.util.Arrays;

public class dizilerMinveMax {
    public static void main(String[] args) {
        int[] list = { 56, 34, 1, 8, 101, -2, -33 };
        int kucuk = list[0];
        int buyuk = list[0];

        for (int i = 0; i < list.length; i++) {
            if (buyuk < list[i]) {
                buyuk = list[i];
            }
        }

        for (int i = 0; i < list.length; i++) {
            if (kucuk > list[i]) {
                kucuk = list[i];
            }
        }

        System.out.println("Minimum Değer " + kucuk);
        System.out.println("Maximum Değer " + buyuk);
        int a;
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        System.out.println("Dizi : " + Arrays.toString(list));
        System.out.println("Girilen Sayı : " + a);

        for (int j : list) {
            if (j > a) {
                if (j <= buyuk) {
                    buyuk = j;
                }
            }
        }

        for (int j : list) {
            if (j < a) {
                if (j >= kucuk) {
                    kucuk = j;
                }
            }
        }
        System.out.println("Girilen sayıdan küçük en yakın sayı : " + kucuk);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + buyuk);
    }
}
