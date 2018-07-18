package lista;

public class Element {

    private double wartosc;
    public Element poprzednik;
    public Element nastepnik;

    public Element(double wartosc){
        this.wartosc = wartosc;
        this.poprzednik = null;
        this.nastepnik = null;
    }

    public Element(double wartosc, Element poprzednik, Element nastepnik) {
        this.wartosc = wartosc;
        this.poprzednik = poprzednik;
        this.nastepnik = nastepnik;
    }

    public double getWartosc() {
        return wartosc;
    }
}
