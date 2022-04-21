package GeometriHesaplamaYontemi;

public class Kare extends Dikdortgen{
    public Kare() {
    }

    public Kare(double uzunKenar, double kisa) {
        super(uzunKenar, kisa);
    }


    @Override
    public String toString() {
        return "Kare; " +
                "\nKenar=" + kisaKenar +
                "\nAlan=" +alanHesaplama() +
                "\ncevres=" + cevreHesaplama() +
                "";
    }
}
