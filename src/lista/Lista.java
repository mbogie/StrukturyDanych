package lista;

public class Lista {

    Element poczatek = null;
    Element koniec = null;
    int size=0;

    public boolean isEmpty(){
        return koniec == null && poczatek==null;
    }

    public void add(double wartosc){    //dodajemy element na koncu
        Element element = new Element(wartosc);
        if (isEmpty()) {
            poczatek = element;
            koniec = element;
            size=1;
        }else {
            element.poprzednik = koniec;
            koniec.nastepnik = element;
            koniec = element;
            size=size+1;
        }
    }

    public void add(double wartosc, int index) {
        Element element = new Element(wartosc);
        Element temp;
        if (isEmpty()) {
            poczatek = element;
            koniec = element;

        } else if (index <= 0) {
            element.nastepnik = poczatek;
            poczatek.poprzednik=element;
            poczatek = element;

        } else if (index >= size) {
            element.poprzednik = koniec;
            koniec.nastepnik=element;
            koniec = element;

        } else if (0<index && index < size) {
            temp = poczatek;
            for (int i = 1; i < index; i++) {
                temp = temp.nastepnik;
            }
            element.nastepnik = temp.nastepnik;
            element.poprzednik = temp;
            temp.nastepnik.poprzednik = element;
            temp.nastepnik = element;

        } /*else if (index > size/2 && index<size) {
            temp = koniec;
            for (int i = 1; i < size-index + 2; i++) {
                temp = temp.nastepnik;
            }
            element.nastepnik = temp.nastepnik;
            element.poprzednik = temp;
            temp.nastepnik.poprzednik = element;
            temp.nastepnik = element;
        }*/
        size = size + 1;

    }

    public void remove(int index){
        if (size==0) {
            poczatek = null;
            koniec = null;

        } else if (index <= 0) {
            poczatek=poczatek.nastepnik;
            poczatek.poprzednik=null;

        } else if (index >= size) {
            koniec=koniec.poprzednik;
            koniec.nastepnik=null;

        } else if (0<index && index < size) {
            Element temp;
            temp = poczatek;
            for (int i = 1; i < index; i++) {
                temp = temp.nastepnik;
            }
            temp.poprzednik.nastepnik=temp.nastepnik;
            temp.nastepnik.poprzednik=temp.poprzednik;
        }
        size = size - 1;
    }

    public void show(){
        Element temp=poczatek;
        int i;
        for(i=0;i<size;i++){
            while(!temp.equals(koniec)) {
                System.out.println(i+": "+ temp.getWartosc());
                temp = temp.nastepnik;
            }

        }System.out.println(i-1+": "+ temp.getWartosc());
    }

    public double get(int index){
        Element temp;
        temp = poczatek;
        for (int i = 1; i <= index; i++) {
            temp = temp.nastepnik;
        }
        return temp.getWartosc();
    }
}
