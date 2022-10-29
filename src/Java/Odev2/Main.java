package Java.Odev2;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        double kdvliTutar = 0.0;
        int tutar = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("KDV Eklenecek Tutarı Giriniz: ");
        tutar = input.nextInt();

        kdvliTutar = tutar + (tutar * 0.18);
        System.out.println("Yeni Tutar: " + kdvliTutar);
    }
}
