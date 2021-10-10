package kosul;
import java.util.Scanner;
public class ucakBileti {
    public static void main(String[] args) {
        int km,yas,yolculukTip;
        double ucret = 0.10,toplamUcret,indirimliUcret,gidisDonus;
        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz : ");
        km = input.nextInt();

        System.out.print("Yaşınızı giriniz : ");
        yas = input.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ):");
        yolculukTip = input.nextInt();

        toplamUcret = km * ucret;
        if (yolculukTip == 1 || yolculukTip == 2){
            switch (yolculukTip){
                case 1 :
                    if (yas < 12){
                        System.out.print("Toplam Tutar : " + (toplamUcret * 0.5));
                    }else if (yas > 12 ) {
                        if (yas < 24) {
                            indirimliUcret = toplamUcret * 0.1;
                            System.out.print("Toplam Tutar : " + indirimliUcret);
                        } else if (yas > 65) {
                            System.out.print("Toplam Tutar : " + (toplamUcret * 0.3));
                        }
                    }
                    break;
                case 2 :
                    gidisDonus = toplamUcret * 0.2;
                    if (yas < 12){
                        System.out.print("Toplam Tutar : " + (gidisDonus * 0.5));
                    }else if (yas > 12 ){
                        if (yas < 24){
                            indirimliUcret = gidisDonus * 0.1;
                            System.out.print("Toplam Tutar : " + indirimliUcret);
                        }else if (yas > 65 ){
                            System.out.print("Toplam Tutar : " + (gidisDonus * 0.3));
                        }
                    }
                    break;
            }
        }else {
            System.out.print("Hatalı Veri Girdiniz");
        }
    }
}
