import java.util.Scanner;

public class üshesabı {

    static int ushesabı(int a, int b) {
        if (a == 1) {
            return 1;
        } else if (b == 0) {
            return 1;
        } else {
            return a * ushesabı(a, b - 1);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b;
        System.out.print("Tabanı Giriniz : ");
        a = input.nextInt();
        System.out.print("Üs Giriniz : ");
        b = input.nextInt();
        System.out.println(ushesabı(a, b));

        input.close();
    }

}
