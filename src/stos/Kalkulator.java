package stos;

public class Kalkulator {

    public static double wynik(String[] liniaTab){

        Stos stos = new Stos();
        double temp;

        stos.push(Double.valueOf(liniaTab[0]));

        for(int i =1;i<liniaTab.length;i=i+2){

            switch (liniaTab[i]){
                case "+":
                    stos.push(Double.valueOf(liniaTab[i+1]));
                    break;
                case "-":
                    stos.push(-Double.valueOf(liniaTab[i+1]));
                    break;
                case "*":
                    temp = stos.pop()*Double.valueOf(liniaTab[i+1]);
                    stos.push(temp);
                    break;
                case "/":
                    temp = stos.pop()/Double.valueOf(liniaTab[i+1]);
                    stos.push(temp);
                    break;
                }
            }

        double wynik=0;
        while(!stos.isEmpty()){
            stos.peek();
            wynik=wynik+stos.pop();
        }
        return wynik;
    }

}
