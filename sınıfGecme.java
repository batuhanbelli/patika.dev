package kosul;
import java.util.Scanner;
public class sınıfGecme {
    public static void main(String[] args) {
        int muzık,mat,turk,kimya,fizik,dersSayısı = 5;

        Scanner input = new Scanner(System.in);

        System.out.print("Türkçe Notunuzu Girebilirsiniz : ");
        turk = input.nextInt();

        System.out.print("Matematik Notunuzu Giriniz : ");
        mat = input.nextInt();

        System.out.print("Kimya Notunuzu Giriniz : ");
        kimya = input.nextInt();

        System.out.print("Muzik Notunuzu Giriniz : ");
        muzık = input.nextInt();

        System.out.print("Fizik Notunuzu Giriniz : ");
        fizik = input.nextInt();

        if (mat < 0 || mat > 100 ){
            mat = 0;
            --dersSayısı;
        }

        if (turk < 0 || mat > 0){
            turk = 0;
            --dersSayısı;
        }

        if (fizik < 0 || fizik > 100){
            fizik = 0;
            --dersSayısı;
        }

        if (kimya < 0 || kimya > 100){
            kimya = 0;
            --dersSayısı;
        }

        if (muzık < 0 || muzık > 100){
            muzık = 0;
            --dersSayısı;
        }

        double ortalama = (kimya + mat + fizik + muzık + turk)/5;
        if (ortalama < 55){
            System.out.println("Not Ortalamanız : " + ortalama);
            System.out.print("Sınıfta Kaldınız ");
        }else {
            System.out.println("Not Ortalamanız : " + ortalama);
            System.out.print("Sınıfı Geçtiniz");
        }

    }

}
