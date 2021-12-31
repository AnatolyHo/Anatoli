package by.ahotsko.collechion;

import java.util.HashSet;


public class HahSeting {
    public static void main(String[] args) {

        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("monday");
        hashSet.add("tuesday");
        hashSet.add("wednesday");
        System.out.println(hashSet);
        System.out.println(hashSet.contains("mondays"));
        //contains - сравнивает искоемое и имеющеяся сравненение "boolean"
         //   "remove" -"УДАЛИТЬ"
       // hashSet.remove("wednesday");
       // System.out.println(hashSet);
        for (String day:hashSet){
            System.out.println(day);
        }
            hashSet.add("friday");
        System.out.println(hashSet);
        System.out.println(hashSet.contains("dfssf"));
        boolean a = hashSet.contains("fryd");
        System.out.println(a);
    }
}
