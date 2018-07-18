package struktury;

public class StrukturyUtils {

    public static long[] sumaTablic(long[] tablica1, int[] tablica2){
        long[] tab;
        if(tablica1.length>tablica2.length) {
            tab = tablica1.clone();
            for (int i = 0; i < tablica2.length; i++) {
                tab[i] = tablica1[i] + tablica2[i];
            }

        } else {
            tab = new long[tablica2.length];
            for (int i = 0; i < tab.length; i++) {

                if (i>=tablica1.length){
                    tab[i]= tablica2[i];
                } else{
                    tab[i] = tablica1[i] + tablica2[i];
                }
            }

        } return tab;
    }
}
