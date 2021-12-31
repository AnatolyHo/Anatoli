package by.ahotsko.raznoe;

public class Raznoe {
    public static void main(String[] args) {
        String[]array = {"профессор","журналист","педогог","кондитер","водитель"};
        int n = array.length;
        int k = (int) (Math.random() * n);
        System.out.println(array[k]);
        System.out.println(array[k]);
    }

}

     /*   int x = 0;
        int y = 0;
        while (x<5){
            if (y < 5) {
                x = x+1;
                if (y<3){
                    x = x-1;
                }
            }
            y = y + 2;
            System.out.println(x+""+y+"");
            x = x+1;
        }
    }
}*/
