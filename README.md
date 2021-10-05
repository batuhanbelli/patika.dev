# patika.dev
package Pratik;

import java.util.Scanner;

public class pratik1 {
    public static void main(String[] args) {

        int mat, turk, fızık, muzık, tarıh, kımya;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuz : ");
        mat = input.nextInt();

        System.out.print("Türkçe Notunuz : ");
        turk = input.nextInt();

        System.out.print("Fizik Notunuz : ");
        fızık = input.nextInt();

        System.out.print("Müzik Notunuz : ");
        muzık = input.nextInt();

        System.out.print("Tarih Notunuz : ");
        tarıh = input.nextInt();

        System.out.print("Kimya Notunuz : ");
        kımya = input.nextInt();

        double toplam = mat + turk + fızık + muzık + tarıh + kımya;
        double ortalama = toplam/6;

        System.out.println("Ortamanız = " + ortalama);
        boolean kosul1 = ortalama >= 50;
        System.out.println("Durum = " + (kosul1==true ? "Geçti" : "Kaldı"));


    }

}
