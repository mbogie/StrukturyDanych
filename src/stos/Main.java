package stos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Stos stos = new Stos();
        /*stos.push(20);
        stos.push(12);
        stos.push(53);
        stos.push(3);

        while(!stos.isEmpty()){
            stos.pop();
        }
        stos.pop();*/

        System.out.println("podaj rownanie");
        Scanner sc = new Scanner(System.in);
        String linia = sc.nextLine();
        String[] liniaTab = linia.split(" ");

        for(String el : liniaTab){
            System.out.print(el);
        }
        System.out.println("\n----");


        System.out.println("wynik równiania = "+Kalkulator.wynik(liniaTab));

    }
}
