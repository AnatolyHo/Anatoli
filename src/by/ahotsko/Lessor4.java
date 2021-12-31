 package by.ahotsko;



public class Lessor4 {
    public static void main(String[] args) {
        int number = 345267821;
        int k = 0;
        while (number > 0){
            if (number % 10 - (number % 100) / 10 == 1) {
                k++;
                if (k == 1) {
                    System.out.println(number % 10);
                    System.out.println((number % 100) / 10);
                } else
                    System.out.println((number % 100) / 10);
                } else{
                    k = 0;
                }
                number = number / 10;

            }
        }


//int i = 54725;
//int  b = 0;
//while (i>0){
        //b =i%10;
        //  System.out.print(b +" ");
        //i=i/10;


//for ( int i=1; i<=10; i++){
        // for (int j = 1; j < 10; j++)
        //if(j!=4)
        //  if(j!=8)
        //  System.out.println(i+"*"+"3"+"="+i*3+"     "+i+"*"+"4"+"="+i*//"4");
        //  System.out.print( j+"*"+i+"="+i*j+'\t');
        // }
        // System.out.println();


        //System.out.println(i);

    }






