package donguler;
import java.util.Scanner;
public class pratik12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int degeri,bolen = 0,toplam = 0,ortalama;
        System.out.print("Değeri Giriniz : ");
        degeri = input.nextInt();
        for (int i = 1; i <= degeri; i++){
            if (i % 3 == 0 && i % 4 == 0) {
                System.out.println(i);
                bolen++;
                toplam += i;
            }
        }
        ortalama = toplam/bolen;
        System.out.println(ortalama);

    }
}
