package donguler;
import java.util.Scanner;

public class elmas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a;

        System.out.print("Basamak sayısını giriniz : ");
        a = input.nextInt();

        for (int i = 1; i <= a; i++){
            for (int b = 1; b <= (a-i); b++){
                System.out.print(" ");
            }
            for (int c = 1; c <= (2*i)-1; c++ ){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        int z = 1,g = 0;
        for(int d = 1; d <= (a-1); d++){

            for (int e = 0; e <z ; e++){
                System.out.print(" ");
            }
            for (int f = 1; f <= (2*a)-((2+d)+g); f++){
                System.out.print("*");
            }

            System.out.println(" ");
            z++;
            g++;
        }








    }
}
