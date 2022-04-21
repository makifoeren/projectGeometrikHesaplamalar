package GeometriHesaplamaYontemi;

import java.util.Scanner;

public class GirisPaneli {


    static Scanner scan = new Scanner(System.in);


    public static void geometrikSekilHesaplama() {


        System.out.println(" Lütfen yapacaginiz islemi seciniz \n" +
                " Dikdortgen hesaplamasi icin  = 1 " +
                " \n Kare hesaplamalari icin   = 2 " +
                " \n Cember hesaplamalari icin = 3 " +
                " \n Cikmak icin yaziniz.      = 4 ");


        int islem = 0;

        while (true) {

            try {
                islem = scan.nextInt();
                if (islem <= 0 || islem > 4) {
                    throw new ArithmeticException();
                } else break;
            } catch (ArithmeticException e) {
                System.out.println("Tercihler 1,2,3 ve 4 olabilir....");
            } catch (Exception e) {
                String str = scan.next();
                System.out.println("Lütfen Numerik veri giriniz");
            }

        }


        switch (islem) {
            case 1:
                System.out.println("Lütfen dikdörtgenin uzun ve kisa kenarini giriniz");

                double uzunKenar = scan.nextDouble();
                double kisaKenar = scan.nextDouble();

                Dikdortgen dikdortgen = new Dikdortgen(uzunKenar, kisaKenar);
                dikdortgen.alanHesaplama();
                dikdortgen.cevreHesaplama();
                System.out.println(dikdortgen);

                System.out.println("Devam etmek icin E islemden cikmak icin H yaziniz... ");
                char ch = scan.next().toUpperCase().charAt(0);

                if (ch == 'E') {
                    geometrikSekilHesaplama();
                } else if (ch == 'H') {
                    cikis();
                    break;
                } else System.out.println("Hatali veri girdiniz lutfen tekrar deneyiniz");
                System.out.print(" ");
                geometrikSekilHesaplama();

                break;


            case 2:
                System.out.println("Lütfen karenin uzun ve kisa kenarini giriniz.");

                double uzunKenarK = scan.nextDouble();
                double kisaKenarK = scan.nextDouble();

                Kare kare = new Kare(uzunKenarK, kisaKenarK);
                kare.alanHesaplama();
                kare.cevreHesaplama();
                System.out.println(kare);

                System.out.println("Devam etmek icin E islemden cikmak icin H yaziniz... ");
                char chk = scan.next().toUpperCase().charAt(0);

                if (chk == 'E') {
                    geometrikSekilHesaplama();
                } else if (chk == 'H') {
                    cikis();
                    break;
                } else System.out.println("Hatali veri girdiniz lutfen tekrar deneyiniz");
                System.out.print(" ");
                geometrikSekilHesaplama();

                break;


            case 3:
                System.out.println("Lütfen cemberin yaricapini giriniz");

                double yariCap = scan.nextDouble();


                Cember cember =new Cember(yariCap);
                cember.cemberCevreHesaplama();
                cember.cemberAlanHesaplama();
                //System.out.println(cember);

                System.out.println("Devam etmek icin E islemden cikmak icin H yaziniz... ");
                char chc = scan.next().toUpperCase().charAt(0);

                if (chc == 'E') {
                    geometrikSekilHesaplama();
                } else if (chc == 'H') {
                    cikis();
                    break;
                } else System.out.println("Hatali veri girdiniz lutfen tekrar deneyiniz");
                System.out.print(" ");
                geometrikSekilHesaplama();

                break;

            case 4:
                cikis();
                break;


            default:
                System.out.println("Hatali veri girdiniz lutfen tekrar deneyiniz");
                geometrikSekilHesaplama();
                break;
        }


    }
    public static void cikis() {
        System.out.println("Hoscakalin iyi calismalar.....");
    }


}
