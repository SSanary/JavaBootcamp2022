package Java.Odev2;
import java.util.Scanner;
public class Main {
    //Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 ,
    // tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.

    public static void main(String[] args) {
        double kdvliTutar = 0.0;
        int tutar = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("KDV Eklenecek Tutarı Giriniz: ");
        tutar = input.nextInt();
        if(tutar > 0 && tutar < 100)
            kdvliTutar = tutar + (tutar * 0.18);
        else
            kdvliTutar = tutar + (tutar * 0.08);

        System.out.println("Yeni Tutar: " + kdvliTutar);
    }
}
