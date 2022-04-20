package GeometriHesaplamaYontemi.Yontem2;

import java.util.Scanner;

import static GeometriHesaplamaYontemi.Yontem2.sekil.*;


public class Kare {


    protected static void kareIslemleri() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen karenin  bir kenarinin olcusunu cm olarak giriniz : ");
        kenarUzunlugu = scan.nextDouble();


    }

    protected static void kareCevreHesapla() {
        kareIslemleri();
        double kareCevresi = kenarUzunlugu * 4;
        System.out.println("Olculerini verdiginiz karenin cevresi " + kareCevresi + " " + cevreMetrikBirim + "'dir");
    }

    protected static void kareAlanHesapla() {
        kareIslemleri();
        double kareAlani = kenarUzunlugu * kenarUzunlugu;
        System.out.println("Olculerini verdiginiz karenin alani: " + kareAlani + " " + alanMetrikBirim + "'dir");


    }


}





