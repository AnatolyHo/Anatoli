package by.ahotsko.klass;

public class MaksNumberStatik {
    public static int maxStatic( int a,int b){
        int max = 0;
        if (a>b){
            max =a;

        }else{
            max = b;
        }
        return max;
    }
    public  static void print(){
        System.out.println(maxStatic(3,8));
    }
}
