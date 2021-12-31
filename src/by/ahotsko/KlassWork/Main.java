package by.ahotsko.KlassWork;

import java.util.Scanner;

public class Main {
    public static  void  main (String[] args){
         //Met12 met12 =new Met12();
          //met12.print(7,5);
        //System.out.println(met12);
        Scanner scanner= new Scanner(System.in);
        System.out.println("Введите текст, пж");
        String s = scanner.nextLine();
        int searching = s.indexOf("там чудеса");
        if(searching>=0){
        System.out.println("Такая фраза есть");
        } else{
            System.out.println("Такой фразы нет");
        }
    }
            }

