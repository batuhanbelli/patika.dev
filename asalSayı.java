package pratikler;

public class asalSayı {
    public static void main(String[] args) {
        int sayac1 = 0;

        for (int x = 1; x <= 100; x++) {

            for (int y = 1; y <= x; y++) {
                if (x % y == 0) {
                    sayac1++;
                }
            }

            if (sayac1 == 2) {
                System.out.print(x + " ");
                sayac1 = 0;
            } else {
                sayac1 = 0;
            }
        }
    }

}
