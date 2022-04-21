package GeometriHesaplamaYontemi;



public class Sekil {



    double uzunKenar;
    double kisaKenar;
    double yariCap;

    public Sekil() {

    }

    public Sekil(double uzunKenar, double kisa) {

        this.uzunKenar = uzunKenar;
        this.kisaKenar = kisa;
    }

    public Sekil(double yariCap) {
        this.yariCap = yariCap;
    }

    public double cevreHesaplama() {
        return (uzunKenar + kisaKenar) * 2;
    }

    public double alanHesaplama() {
        return (uzunKenar * kisaKenar);

    }

    public void cemberAlanHesaplama(){ // cember alan hesaplama methodu
        System.out.println("Cemberin alani = " + (yariCap*yariCap*3.14));
    }
    public void cemberCevreHesaplama(){ // cember cevre hesaplama methodu
        System.out.println("Cemberin cevresi = " + (yariCap*2*3.14));
    }

}
