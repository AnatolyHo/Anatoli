package by.ahotsko.KlassWork;

import java.util.Arrays;

public class WorkOfrey {
    public static int[] sort( int [] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {

                if (array[i] > array[j]) {
                    int k = array[i];
                    array[i] = array[j];
                    array[j] = k;
                }

            }
        }
        return array;
    }
    public static  void printToArray() {
        int[] array = new int[8];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() *5+8));
        }
         WorkOfrey.sort(array);
        System.out.println("ArrraySort:"+ Arrays.toString(array));
    }
}
