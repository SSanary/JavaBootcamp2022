package Java.Odev10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat = 0, fizik = 0, kimya = 0, turkce = 0, tarih = 0, muzik = 0;
        int ortalama = 0, ortalamaBolumu = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Matematik notunuzu giriniz lütfen: ");
        mat = input.nextInt();
        if(mat > 100)
            mat = 0;
        else
            ortalamaBolumu++;


        System.out.println("Fizik notunuzu giriniz lütfen: ");
        fizik = input.nextInt();
        if(fizik > 100)
            fizik = 0;
        else
            ortalamaBolumu++;

        System.out.println("Kimya notunuzu giriniz lütfen: ");
        kimya = input.nextInt();
        if(kimya > 100)
            kimya = 0;
        else
            ortalamaBolumu++;

        System.out.println("Türkçe notunuzu giriniz lütfen: ");
        turkce = input.nextInt();
        if(turkce > 100)
            turkce = 0;
        else
            ortalamaBolumu++;

        System.out.println("Müzik notunuzu giriniz lütfen: ");
        muzik = input.nextInt();
        if(muzik > 100)
            muzik = 0;
        else
            ortalamaBolumu++;

        if(ortalamaBolumu != 0 ) {
            ortalama = mat + fizik + kimya + turkce + muzik;
            ortalama /= ortalamaBolumu;
            System.out.println(ortalama >= 55 ? "Tebrikler Sınıfı Geçtiniz!" : "Üzgünüz Sınıfta Kaldınız!");
        }
        else System.out.println("Girdiğiniz notlar uygun değil!");
    }
}
