package donguler;
import java.util.Scanner;
public class pratik16 {
    public static void main(String[] args) {
        int n,k,total = 1;

        Scanner input = new Scanner(System.in);

        System.out.print("Üssü alıncak sayıyı giriniz : ");
        n = input.nextInt();
        System.out.print("Üs olcak sayıyı giriniz : ");
        k = input.nextInt();

        for (int i = 1; i <=n; i++){
            total *= k;
        }
        System.out.print("Cevap : " + total);
    }
}
