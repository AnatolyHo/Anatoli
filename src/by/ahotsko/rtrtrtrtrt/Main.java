package by.ahotsko.rtrtrtrtrt;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       /* ArrayList<Boolean> list1 = new ArrayList<>();
        list1.add(true);
        list1.add(false);
        list1.add(true);
        list1.add(false);
        list1.add(true);
        System.out.println(list1);
      ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i <=10 ; i++) {
            list1.add(i);
        }
        System.out.println(list1);*/
        ArrayList<Integer> list1 = new ArrayList<>(10);
        list1.add(0, 2);
        list1.add(1, 3);
        list1.add(2, 5);
        list1.add(3, 6);
        list1.add(4, 7);
        list1.add(5, 12);
        list1.add(6, 9);
        list1.remove(5);
        list1.remove(2);
        System.out.println(list1);

        for (Integer intg:list1) {
            System.out.println("number"+intg);
        }
        ArrayList<String> months = new ArrayList<>();
      //  String s = new String();
        months.add("январь");
        months.add("февраль");
        months.add("март");
        months.add("апрель");
        months.add("май");
        months.add("июнь");
        months.add("июль");
        months.add("август");
        months.add("сентябрь");
        //System.out.println(months.size());//размер массива
        //months.set(1,"гдекабрь");// метод (set)замена в 1 индексе элемента
        //System.out.println(months);
        //months.remove("январь");
        //System.out.println(months);
       // System.out.println(months.size());//размер
       // System.out.println(months.get(5)); //вывод элемента
        //int b1 =months.indexOf("май");//вывод индекса
        //System.out.println(b1);
       // Collections.swap(months,months.indexOf("август"),months.indexOf("январь"));
        //System.out.println(months);//замена индексов и элементов
       // Collections.reverse(months);//метод реверса
      //  System.out.println(months);
        months.clear();
        System.out.println(months);
        System.out.println(list1.equals(months));
        String [] strArray = {"a","b","c","e","f"};
        boolean b = Arrays.asList(strArray).contains("l");
       System.out.println(b);
          /*  String [] a = {"foo","bar","baz"};
        List<String> list = Arrays.asList(a);
        System.out.println(list);
        a[0] ="aaa";
        System.out.println(list);*/

    }
    }

