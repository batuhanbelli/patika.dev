package pratikler;

import java.util.Scanner;

public class tersUcgen {
    public static void main(String[] args) {
        int basamak;
        Scanner input = new Scanner(System.in);

        System.out.print("Basamak sayısını giriniz: ");
        basamak = input.nextInt();

        for (int x = 1; x <= basamak; x++) {

            for (int y = 1; y < x; y++) {
                System.out.print(" ");
            }

            for (int z = 0; z <= ((2 * basamak) - (2 * x)); z++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
