package GeometriHesaplamaYontemi.Yontem2;

import java.util.Scanner;

public class Dikdortgen extends sekil {
    protected static void DikdortgenIslemleri() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen kisa kenarin olcusunu cm olarak giriniz: ");

        kisaKenar = scan.nextDouble();
        System.out.print("Lutfen uzun kenarin olcusunu cm olarak giriniz: ");
        uzunKenar = scan.nextDouble();

    }

    protected static void dikdortgenCevreHesapla() {
        DikdortgenIslemleri();

        double dikdortgenCevresi;

        dikdortgenCevresi = (2.0 * (uzunKenar + kisaKenar));
        System.out.println("olculerini verdiginiz dikdortgenin cevresinin uzunlugu : " + dikdortgenCevresi + " " + cevreMetrikBirim + "'dir");
    }

    protected static void dikdortgenAlanHesapla() {
        DikdortgenIslemleri();

        double dikdortgenAlani;

        dikdortgenAlani = uzunKenar * kisaKenar;
        System.out.println("olculerini verdiginiz dikdortgenin alani  " + dikdortgenAlani + " " + alanMetrikBirim + "'dir");
    }
}









