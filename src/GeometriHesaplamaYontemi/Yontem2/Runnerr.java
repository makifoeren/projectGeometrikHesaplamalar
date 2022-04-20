package GeometriHesaplamaYontemi.Yontem2;

import java.util.Scanner;

import static GeometriHesaplamaYontemi.Yontem2.Cember.cemberAlanHesapla;
import static GeometriHesaplamaYontemi.Yontem2.Cember.cemberCevreHesapla;
import static GeometriHesaplamaYontemi.Yontem2.Dikdortgen.dikdortgenAlanHesapla;
import static GeometriHesaplamaYontemi.Yontem2.Dikdortgen.dikdortgenCevreHesapla;
import static GeometriHesaplamaYontemi.Yontem2.Kare.kareAlanHesapla;
import static GeometriHesaplamaYontemi.Yontem2.Kare.kareCevreHesapla;
import static GeometriHesaplamaYontemi.Yontem2.sekil.dikdortgenMesaj;
import static GeometriHesaplamaYontemi.Yontem2.sekil.kareMesaj;

public class Runnerr {


    public static void main(String[] args) {

        giris();


    }

    protected static void giris() {
        Scanner scan = new Scanner(System.in);
        sekil mesaj = new sekil();

        System.out.println("Geometrik islemlerden hangisini yapmak istersiniz\n 1 Kare " +
                " \n 2 Dikdortgen\n 3 Cember\n 0 Cikis");
        String secim = scan.nextLine();


        switch (secim) {
            case "1":
                kareHesapTuru();
                break;
            case "2":
                DikdortgenHesapTuru();
                break;
            case "3":
                cemberHesapTuru();
                break;
            case "0":
                Cikis();
                break;
            default:
                System.out.println("***********************YANLIS TUSA BASTINIZ LUTFEN YENIDEN DENEYINIZ************************");
                giris();
                break;

        }
    }


    protected static void DikdortgenHesapTuru() {
        System.out.println(dikdortgenMesaj);
        Scanner scan = new Scanner(System.in);
        System.out.println("Dikdortgenle ilgili hangi islemi yapmak istiyorsunuz?" +
                "\n1 Dikdortgen alani\n2 Dikdortgen cevresi\n3 Ana menu\n0 Cikis");
        String dikdortgenIslemSecim = scan.nextLine();
        switch (dikdortgenIslemSecim) {
            case "1":
                dikdortgenAlanHesapla();
                break;
            case "2":
                dikdortgenCevreHesapla();
                break;
            case "3":
                giris();
            case "0":
                Cikis();
                break;
            default:
                System.out.println("***********************YANLIS TUSA BASTINIZ LUTFEN YENIDEN DENEYINIZ************************");
                DikdortgenHesapTuru();
        }


    }


    protected static void cemberHesapTuru() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Cemberle ilgili hangi islemi yapmak istiyorsunuz?" +
                "\n1 Cember alani\n2 Cember cevresi\n3 Ana menu\n0 Cikis");
        int cemberIslemSecim = scan.nextInt();
        switch (cemberIslemSecim) {
            case 1:
                cemberAlanHesapla();
                break;
            case 2:
                cemberCevreHesapla();
                break;
            case 3:
                giris();
            case 0:
                Cikis();
                break;
            default:
                System.out.println("Yanlis tusa bastiniz, lutfen yeniden deneyiniz.");
                cemberHesapTuru();
        }

    }

    protected static void kareHesapTuru() {


        System.out.println(kareMesaj);
        Scanner scan = new Scanner(System.in);
        System.out.println("Kareyle ilgili hangi islemi yapmak istiyorsunuz?" +
                "\n1 Karenin alani\n2 Karenin cevresi\n3 Ana menu\n0 Cikis");
        String kareIslemSecim = scan.nextLine();
        switch (kareIslemSecim) {
            case "1":
                kareAlanHesapla();
                break;
            case "2":
                kareCevreHesapla();
                break;
            case "3":
                giris();
                break;
            case "0":
                Cikis();
                break;
            default:
                System.out.println("***********************YANLIS TUSA BASTINIZ LUTFEN YENIDEN DENEYINIZ************************");
                kareHesapTuru();
        }


    }

    protected static void Cikis() {
        System.out.println("Hoscakalin");
    }
}