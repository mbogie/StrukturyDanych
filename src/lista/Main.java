package lista;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Lista lista = new Lista();

        lista.add(20,0);
        lista.add(16,0);
        lista.add(30);
        lista.show();
        System.out.println("----");
        System.out.println(lista.size);
        System.out.println("----");
        lista.add(14, 4);
        System.out.println("----");
        System.out.println(lista.size);
        System.out.println("----");




    }
}
