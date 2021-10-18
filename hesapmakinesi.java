
import java.util.Scanner;

public class hesapmakinesi {

    private static Scanner scan;

    static void dikdortgen() {
        int a, b;
        System.out.println("Birinci Köşeyi Giriniz : ");
        a = scan.nextInt();
        System.out.println("İkinci Köşeyi Giriniz : ");
        b = scan.nextInt();
        int cevre = 2 * (a + b);
        int alan = a * b;
        System.out.println("Dikdörtgenin Çevresi :" + cevre);
        System.out.println("Dikdörtgenin Alanı : " + alan);
        System.out.println("              ");

    }

    static int toplama() {
        scan = new Scanner(System.in);
        int sayı, result = 0, i = 1;
        while (true) {
            System.out.println(i++ + ".Sayı");
            sayı = scan.nextInt();
            if (sayı == 0) {
                break;
            }
            result += sayı;
        }
        System.out.println("Toplama İşleminin Sonucu : " + result);
        return result;
    }

    static int cıkarma() {
        scan = new Scanner(System.in);
        int sayı, sayı1, i = 2;
        System.out.println("1.Sayıı");
        sayı1 = scan.nextInt();
        while (true) {
            System.out.println(i++ + ".Sayı");
            sayı = scan.nextInt();
            if (sayı == 0) {
                break;
            }
            sayı1 -= sayı;
        }
        System.out.println("Çıkarma İşleminin Sonucu : " + sayı1);
        return sayı1;
    }

    static int bolme() {
        System.out.print("Birinci Sayıyı Giriniz : ");
        int a = scan.nextInt();
        System.out.print("İkinci Sayıyı Giriniz : ");
        int b = scan.nextInt();

        int result = a / b;
        if (b == 0) {
            System.out.println("İkinci Sayı Sıfır Olamaz !");
            System.out.println("              ");
        } else {
            System.out.println("Bölme İşleminin Sonucu : " + result);
            System.out.println("              ");
        }
        return result;
    }

    static int carpma() {
        System.out.print("Birinci Sayıyı Giriniz : ");
        int a = scan.nextInt();
        System.out.print("İkinci Sayıyı Giriniz : ");
        int b = scan.nextInt();

        int result = a * b;
        System.out.println("Çarpma İşleminin Sonucu : " + result);
        System.out.println("              ");
        return result;
    }

    public static void main(String[] args) {
        int secim;
        scan = new Scanner(System.in);

        System.out.println("1-Toplama İşlemi\n" + "2-Çıkarma İşlemi\n" + "3-Çarpma İşlemi\n" + "4-Bölme İşlemi\n"
                + "5-Dikdörtgenin Alanı Ve Çevresi\n" + "0-Çıkış");
        System.out.println("              ");

        while (true) {
            System.out.print("Bir işlem seçiniz : ");
            secim = scan.nextInt();
            System.out.println("              ");
            if (secim != 0) {
                switch (secim) {
                    case 1:
                        toplama();
                        break;
                    case 2:
                        cıkarma();
                        break;
                    case 3:
                        carpma();
                        break;
                    case 4:
                        bolme();
                        break;
                    case 5:
                        dikdortgen();
                        break;
                    default:
                        System.out.println("Yanlış İşlemi Seçtiniz");
                        break;
                }
            } else if (secim == 0) {
                System.out.println("Görüşmek Üzere");
                break;
            }
        }
    }
}