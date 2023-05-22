package Lesson13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class StringUtilsCustom implements StringUtils {

    public double div(String number1, String number2) throws NullPointerException, NumberFormatException, ArithmeticException {
        if (number1 == null || number2 == null) {
            throw new NullPointerException("number1==null||number2==null");
        }
        double n1, n2;
        try {
            n1 = Double.parseDouble(number1);
            n2 = Double.parseDouble(number2);

        } catch (NumberFormatException e) {
            throw new NumberFormatException("number1 or number2 not number");
        }
        if (n2 == 0) {
            throw new ArithmeticException("number2 = 0");
        }
        return n1 / n2;
    }


    public int[] findWord(String text, String word) throws NullPointerException {

        ArrayList<String> my = new ArrayList<String>(Collections.singleton(text));
//        String s = text;
        String[] s = my.get(0).split( "word" );
//

//        int index ;
//        for (int i=0; i<my.size();i++) {
//            if (text.indexOf()) {
//                index=i;
//                int [] res = new int[i];
                System.out.println(s);


        return new int[0];
    }





//        System.out.println(myList.indexOf(word));

//        return new int[myList.indexOf(word)];







    public double[] findNumbers(String text) throws CustomException {
        return new double[0];
    }


}
