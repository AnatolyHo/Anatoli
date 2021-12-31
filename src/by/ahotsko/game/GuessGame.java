package by.ahotsko.game;

import java.util.Arrays;

public class GuessGame {
   boolean result;
    public void guess() {
        int[] arr = new int[11];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ((int) (Math.random() * 101));
        }
        System.out.println(Arrays.toString(arr));

        int[] ars = new int[11];
        for (int i = 0; i < ars.length; i++) {
            ars[i] = ((int) (Math.random() * 101));
        }
        System.out.println(Arrays.toString(ars));
         result = Arrays.equals(ars,arr);
        if (result == true){
            System.out.println("Вы победили");
        }else{
            System.out.println("Вы проиграли");
        }




    }}
