package by.ahotsko.KlassWork;

public class  Met12 {
    public static int mMetod(int a1, int a2) {
        int maxNum;
        if (a1 > a2)
            maxNum = a1;
        else
            maxNum = a2;

            return maxNum;
        }
        public void print ( int x, int y){
            System.out.println(mMetod(x,y));
        }

    }
