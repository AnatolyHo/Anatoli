package by.ahotsko.ccollectoion;

public class TreSetMapa {
    public static void main(String[] args) {
       /* int i = 123456789;
        int n ;
        while (i>0){
           n= i%10;
           i= i/10;
            System.out.print(n);


        }*/
      /* int number = 12435678;
        int max =0;
        int min = 9;
        while (number>0) {
            if (max < number % 10) {
                max = number % 10;
            }
            if (min > number % 10) {
                min = number % 10;

            }
            number= number/10;
        }
            System.out.println("maximum:" + max);
            System.out.println("minimum:" + min);
          // number = number / 10;
*/

        int num = 12358756;
        double rez = 0;
        int cum = 0;
        int count = 0;
        while (num>0){
            num  = num%10;
            cum =num+cum;

        }
    }
}
