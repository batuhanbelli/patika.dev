package donguler;
import java.util.Scanner;
public class atm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName = "batuhanbelli", password = "123456";
        int hak = 3, balance = 2000, select;

        while (hak > 0) {
            System.out.print("Kullanıcı Adınızı Giriniz : ");
            userName = input.nextLine();
            System.out.print("Şifrenizi Giriniz : ");
            password = input.nextLine();
            if (userName.equals("batuhanbelli") && password.equals("123456")) {
                System.out.println("Batubanka Hoşgeldiniz");
                do {
                    System.out.print("1-Para Yatırma\n"
                            + "2-Para Çekme\n"
                            + "3-Bakiye Sorgulama\n"
                            + "4-Çıkış\n" + "Yapmak İstediğiniz İşlemi Giriniz : ");
                    select = input.nextInt();
                    System.out.println(" ");
                    if(select == 1){
                        System.out.print("Yatırmak İstediğiniz Tutarı Giriniz : ");
                        int tutar = input.nextInt();
                        System.out.println(" ");
                        balance += tutar;
                    }else if (select == 2){
                        System.out.print("Çekmek İstediğiniz Tutarı Giriniz : ");
                        int tutar = input.nextInt();
                        System.out.println(" ");
                        if (tutar > balance){
                            System.out.println("Bakiye Yetersizdir !");
                            System.out.println(" ");
                        }else {
                            balance -= tutar;
                        }
                    }else if (select == 3){
                        System.out.println("Toplam Bakiyeniz : " + balance);
                        System.out.println(" ");
                    }
                } while (select != 4);
                System.out.println("Tekrar Görüşmek Üzere");
                break;
            } else {
                --hak;
                if (hak == 0) {
                    System.out.println("Hesabınız Bloke Olmuştur.Lütfen Banka İle Görüşün ");
                } else {
                    System.out.println("Lütfen Tekrar Deneyiniz");
                    System.out.println("Kalan Hakkınız : " + hak);
                }
            }
        }
    }
}