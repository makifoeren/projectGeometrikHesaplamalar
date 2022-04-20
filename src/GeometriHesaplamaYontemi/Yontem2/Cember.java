package GeometriHesaplamaYontemi.Yontem2;

import java.util.Scanner;

import static GeometriHesaplamaYontemi.Yontem2.Runnerr.cemberHesapTuru;


public class Cember extends sekil {

    protected static void CemberIslemleri() {
        sekil cemberObje = new Cember();
       cemberObje.cemberMesaj = "Cemberin alanini ve cevresini hesaplamak icin PI sayisi ve yaricap bilgisine ihtiyac vardir";
        cemberHesapTuru();
        cemberAlanHesapla();
        cemberCevreHesapla();


    }


    protected static void cemberCevreHesapla() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen cemberin cap  olcusunu cm olarak giriniz : ");
        cemberCap = scan.nextDouble();
        cemberCevre = piSayisi * cemberCap;
        System.out.println("Capi " + cemberCap + " cm" + " olan cemberin cevre uzunlugu " +cemberCevre+ cevreMetrikBirim + " degerindedir.");
    }

    protected static void cemberAlanHesapla() {
        sekil cemberObje = new Cember();
        cemberObje.cemberMesaj = "Cemberin alanini ve cevresini hesaplamak icin PI sayisi ve yaricap bilgisine ihtiyac vardir";

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen cemberin yaricap  olcusunu cm olarak giriniz : ");

        cemberObje.yariCap = scan.nextDouble();
        cemberObje.cemberAlan = cemberObje.piSayisi * yariCap * yariCap;
        System.out.println("Yaricapi " + yariCap + " cm" + " olan cemberin alani " + cemberAlan + " " + alanMetrikBirim + " degerindedir.");
    }


}









