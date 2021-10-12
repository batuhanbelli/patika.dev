package donguler;
import java.util.Scanner;
public class pratik15 {
    public static void main(String[] args) {
        int n,r,total = 1,total1 = 1,nr,total2 = 1,kombinasyon;
        Scanner input = new Scanner(System.in);

        System.out.print("Birinci kümenin eleman sayısı : ");
        n = input.nextInt();

        System.out.print("İkinci kümenin eleman sayısı : ");
        r = input.nextInt();

        for (int i = 1; i <= n; i++){
            total = total * i;
        }
        for (int a = 1; a <= r; a++){
            total1 = total1 * a;
        }
        nr = n-r;
        for (int b = 1; b <= nr; b++){
            total2 = total2 * b;
        }
        kombinasyon = total/(total1*(total2));
        System.out.print("Kombinasyonun Sonucu " + kombinasyon);

    }
}
