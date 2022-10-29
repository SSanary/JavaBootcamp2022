package Java.Odev6;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double boy = 0.0, kilo = 0.0, endeks = 0.0;
        Scanner input = new Scanner(System.in);

        System.out.println("Boyunuzu (metre cinsinden) giriniz: ");
        boy = input.nextDouble();

        System.out.println("Kilonuzu giriniz: ");
        kilo = input.nextDouble();

        System.out.println("Vücut Kitle İndeksiniz: " + (kilo / (boy * boy)));
    }
}
