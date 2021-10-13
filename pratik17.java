package donguler;
import java.util.Scanner;
public class pratik17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sayı,sonuc = 0;
        int basamakDeger;


        System.out.print("Bir sayı giriniz : ");
        sayı = input.nextInt();



        while (sayı != 0){
            basamakDeger = sayı % 10;
            sonuc += basamakDeger;
            sayı /= 10;
        }
        System.out.println(sonuc);
    }
}
