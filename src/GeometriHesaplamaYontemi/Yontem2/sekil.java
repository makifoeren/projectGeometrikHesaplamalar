package GeometriHesaplamaYontemi.Yontem2;

import java.util.Scanner;

public class sekil {
    static String sekilMesaj = "Her seklin alanini ve cevresini hesaplamak icin " +
            "\nelimizde sekle ait bazi verilerin olmasi gerekir." +
            "\nOnun icin uygun secim yapmalisiniz";
    protected String cemberMesaj = "Cember sinifina bakiniz";
    static String kareMesaj = "Karenin cevresini ve alanini hesaplamak icin tek bir kenarin olcusu yeterlidir";
    static String dikdortgenMesaj = "Dikdortgenin cevresini ve alanini hesaplamak icin uzun ve kisa kenarin olcusunu bilmek gerekir";
    static String cevreMetrikBirim = "cm";
    static String alanMetrikBirim = "cm2";
    static final double piSayisi = 3.14;
    static double yariCap;
    static double cemberAlan;
    static double kenarUzunlugu;
    static double uzunKenar;
    static double kisaKenar;
    static double cemberCap;
    static double cemberCevre;
    static double exception = 0;


    public static void main(String[] args) {
        sekil sekilObje = new sekil();
        System.out.println(sekilMesaj);

        Scanner scan = new Scanner(System.in);

    }


}




