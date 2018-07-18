package stos;

public class Element {
    private double wartosc;
    Element wskaznik;

    public Element(double wartosc, Element wskaznik) {
        this.wartosc = wartosc;
        this.wskaznik = wskaznik;
    }

    public double getWartosc() {
        return wartosc;
    }

    public Element getWskaznik() {
        return wskaznik;
    }
}
