package kolejka;

public class Element {

    private double wartosc;
    Element wskaznik;

    public Element(double wartosc){
        this.wartosc = wartosc;
        this.wskaznik = null;
    }

    public double getWartosc() {
        return wartosc;
    }

    public Element getWskaznik() {
        return wskaznik;
    }

    public void setWskaznik(Element wskaznik) {
        this.wskaznik = wskaznik;
    }
}
