package donguler;
import java.util.Scanner;
public class pratik14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,i;
        System.out.print("Bir Sayı Giriniz : ");
        a = input.nextInt();
        System.out.println("4 ün Katı Olan Sayılar");
        for (i = 1; i <= a; i *= 4){
            System.out.println(i);
        }
        System.out.println("5 in Katı Olan Sayılar");
        for (i = 1; i <= a; i *=5){
            System.out.println(i);
        }


    }
}
