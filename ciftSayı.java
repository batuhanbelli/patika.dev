package Diziler;

import java.util.Arrays;

public class ciftSayı {
    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] list2 = { 3, 7, 3, 3, 2, 9, 10, 21, 1, 33, 9, 1 };
        int[] even = new int[list2.length];
        int startIndex = 0;

        String lst2 = Arrays.toString(list2);
        System.out.println("Liste: " + lst2);

        for (int i = 0; i < list2.length; i++) {
            for (int j = 0; j < list2.length; j++) {
                if ((i != j) && (list2[i] % 2 == 0)) {

                    even[startIndex++] = list2[i];
                    break;

                }

            }
        }

        for (int value : even) {
            if (value != 0) {
                System.out.println(value);
            }
        }

    }
}
