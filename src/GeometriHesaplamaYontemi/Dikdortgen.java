package GeometriHesaplamaYontemi;

public class Dikdortgen extends Sekil{

    public Dikdortgen() {
    }

    public Dikdortgen(double uzunKenar, double kisa) {
        super(uzunKenar, kisa);
    }

    public Dikdortgen(double kisa){

    }
    public double cevreHesaplama(){
        return super.cevreHesaplama();

    }

    public double alanHesaplama() {
        return (kisaKenar* kisaKenar);

    }


    @Override
    public String toString() {
        return "Dikdortgen; " +
                "\nuzunKenar= " + uzunKenar +
                "\nkisaKenar= " + kisaKenar +
                "\nAlani= "+alanHesaplama()+
                "\nCevresi= "+cevreHesaplama()+
                "";
    }
}
