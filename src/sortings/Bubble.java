package sortings;

import comparisons.Comparables;

public class Bubble <T> implements Sort<T> {

    public long sort(T array[], Comparables<T> comparables){

        long start = System.currentTimeMillis();
        int i, j;
        T aux;
        for(i = 0; i < array.length; i++) {
            for(j = i; j < array.length; j++) {
                // Verifica se um elemento é maior que o outro.
                if(comparables.compare(array[i], array[j]) > 0) {
                    // Troca os elementos de posicao "swap"
                    aux = array[i];
                    array[i] = array[j];
                    array[j] = aux;

                }

            }
        }
        return System.currentTimeMillis() - start;
    }

}
