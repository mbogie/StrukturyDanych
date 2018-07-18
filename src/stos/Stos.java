package stos;

public class Stos {

    Element top = null;


    public void push(double wartosc){
       Element element = new Element(wartosc,top);
       top = element;
    }

    public Double pop(){
        if(!isEmpty()) {
            double temp = top.getWartosc();
            top = top.getWskaznik();
            return temp;
        } else {
            return null;
        }
    }

    public void peek(){
        if(!isEmpty()) {
            System.out.println(top.getWartosc());
        } else {
            System.out.println("stos pusty");
        }

    }
    public boolean isEmpty(){
        return top==null;
    }
}
