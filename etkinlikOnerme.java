package kosul;
import java.util.Scanner;
public class etkinlikOnerme {
    public static void main(String[] args) {
        int sıcaklık;

        Scanner input = new Scanner(System.in);

        System.out.print("Sıcaklık Değerini Giriniz : ");
        sıcaklık = input.nextInt();

        if (sıcaklık <= 5){
            System.out.print("Kayak Yapabilirsiniz ");
        }else if (sıcaklık < 15 ){
            System.out.print("Sinemaya Gidebilirsiniz");
        }else if (sıcaklık == 15){
            System.out.print("Sinemaya Veya Pikniğe Gidebilirsiniz");
        }else if (sıcaklık <=25){
            System.out.print("Pikniğe Gidebilirsiniz");
        }else {
            System.out.print("Yüzmeye gidebilirsiniz");
        }
    }
}
