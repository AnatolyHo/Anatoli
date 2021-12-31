package by.ahotsko.klass;

public class MaxNumber {
    public  int max (int a,int b){
       int maxNum =0;
       if ( a>b){
           maxNum =a;

       }else  {
           maxNum = b;
       }
        return maxNum;
    }

    public void  print(){
        System.out.println(max(3,5));
    }
}
