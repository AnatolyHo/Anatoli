package by.ahotsko.KlassWork;

public class HomeStrin {
    public static void main(String[] args) {
       String strText="\"У лукоморья дуб зелёный;\n" +
               "Златая цепь на дубе том:\n" +
               "И днём и ночью кот учёный\n" +
               "Всё ходит по цепи кругом;\n" +
               "Идёт направо — песнь заводит,\n" +
               "Налево — сказку говорит.\n" +
               "Там чудеса: там леший бродит,\n" +
               "Русалка на ветвях сидит;\n" +
               "Там на неведомых дорожках\n" +
               "Следы невиданных зверей";
        String [] s1 = strText.split(" ");
        for (String s : s1) {

//            System.out.println(s.trim());

        }
//        System.out.println(s1);
        String s2 =strText.replace('ё','е').replace('а','я');
        String s3 = s2.replace('а','я');
//        System.out.println(s2);
        String s4 = strText.substring(52);
        String s6 = strText.substring(0,50);
        System.out.println(String.join("", s6, s4));

        String  s5 = "И днём и ночью";
         int ind = strText.indexOf(s5);
        System.out.println();
    }
}
