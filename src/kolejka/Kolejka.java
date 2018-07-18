package kolejka;

public class Kolejka {

    Element poczatek = null;
    Element koniec = null;

    public void push(int wartosc){
        Element element = new Element(wartosc);
        if(isEmpty()){
            poczatek=element;
            koniec = element;
        }
        koniec.setWskaznik(element);
        koniec = element;
    }

    public Double pop(){
        if(!isEmpty()){
            double temp = poczatek.getWartosc();
            if(poczatek.equals(koniec)){
                koniec = poczatek.getWskaznik();
            }
            poczatek = poczatek.getWskaznik();
            return temp;
        }else{
            return null;
        }
    }

    public Double peek(){
        if(!isEmpty()){
            return poczatek.getWartosc();
        } else {
            return null;
        }
    }

    public boolean isEmpty(){
        return koniec==null;
    }

}
