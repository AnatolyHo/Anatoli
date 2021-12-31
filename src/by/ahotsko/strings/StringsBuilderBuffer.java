package by.ahotsko.strings;

import java.util.Arrays;

public class StringsBuilderBuffer {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(2);
        stringBuffer.append("qwerty");
        stringBuffer.append(Arrays.asList(1,2,3));
        stringBuffer.append(false);
        System.out.println(stringBuffer);
        //StringBuffer stringBuffer1 = new StringBuffer();
        //stringBuffer1.append(123);
        //System.out.println(stringBuffer.delete(0, 3));удалить "от и до"
        System.out.println(stringBuffer.replace(1, 3, "dffkf"));//вставить от и до и что вставить
        System.out.println(stringBuffer.substring(2, 6));//вытянуть или достать от и до
                String s = "1254586";
                StringBuffer stringBuffer2 = new StringBuffer(s);
                stringBuffer2.setLength(12);
        System.out.println(stringBuffer2.toString());
           StringBuilder stringBuilder = new StringBuilder();
           stringBuilder.append(23);
        System.out.println(stringBuilder);//всё индетично Buffer
        //Buffer этот ккласс потокобезопасен, его методы синхронизированы
        // хорош для многопоточки,
        //Builder быстрее работает и в основном использовать его


    }
}
