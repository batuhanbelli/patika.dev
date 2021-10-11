package donguler;
import java.util.Scanner;
public class pratik13 {
    public static void main(String[] args) {
        int a,total=0,average,b = 0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Bir Sayı Giriniz : ");
            a = input.nextInt();
            if (a % 2 == 0 && a % 4 == 0){
                total += a;
                b++;
            }
        }while (a % 2 == 0);
        average = total / b;
        System.out.println(average);



    }
}
