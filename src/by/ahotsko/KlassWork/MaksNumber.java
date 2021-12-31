package by.ahotsko.KlassWork;

public class MaksNumber {
    public static void println() {
    }

    public int max(int a, int b) {
        int maxNumber = 0;
        if (a > b) {
            maxNumber = a;
        } else {
            maxNumber = b;
        }

        return maxNumber;

    }

    public void print (){
        System.out.println(max(4,5));

    }
}
