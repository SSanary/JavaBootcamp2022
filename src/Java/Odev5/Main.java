package Java.Odev5;
import java.util.Scanner;
//Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
//
//𝜋 sayısını = 3.14 alınız.
//
//Formül : (𝜋 * (r*r) * 𝛼) / 360
public class Main {
    public static void main(String[] args) {
        double acı = 0, r = 0, daireDilimi = 0;
        final double pi = 3.14;
        Scanner input = new Scanner(System.in);

        System.out.print("Açıyı giriniz: ");
        acı = input.nextDouble();
        System.out.print("Yarıçapı giriniz: ");
        r = input.nextDouble();

        daireDilimi = (pi * (r * r) * acı) / 360;

        System.out.println("Daire dilimi: " + daireDilimi);
    }
}
