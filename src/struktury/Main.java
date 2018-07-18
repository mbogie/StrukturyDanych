package struktury;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Podaj ilu elementowa ma byc tablica longow");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long[] tablica1 = new long[n];

        tablica1[0]=0;
        if(n>1) {
            tablica1[1] = 1;

            for (int i = 2; i < n; i++) {
                tablica1[i] = tablica1[i - 1] + tablica1[i - 2];
            }

            for (long element : tablica1) {
                System.out.print(element + ",");
            }
        }

        System.out.println("\n-------");

        System.out.println("Podaj ilu elementowa ma byc tablica intow");
        int m = sc.nextInt();
        System.out.println("z jakiego przedziału maja byc w niej liczby");

        int randMin = sc.nextInt();
        int randMax = sc.nextInt();


        int[] tablicaInt = new int[m];


        Random random = new Random();

        for(int i=0; i<m;i++){
            tablicaInt[i] = random.nextInt(randMax-randMin+1)+randMin;
            System.out.print(tablicaInt[i]+",");
        }

        System.out.println("\n---------");
        System.out.println("elemnty zsumowanych tablic:");

        long[] tab = StrukturyUtils.sumaTablic(tablica1,tablicaInt);

        for(long ele : tab){
            System.out.print(ele+",");
        }
    }
}
