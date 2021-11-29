package Diziler;

public class diziOrtalama {
    public static void main(String[] args) {
        int[] list = { 1, 2, 3, 4, 5 };
        int sum = 0;
        for (int i = 0; i < list.length; i++) {
            sum += list[i];
        }
        System.out.println(sum / list.length);
    }

}
