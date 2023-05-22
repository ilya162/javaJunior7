package Lesson12;

import java.util.ArrayList;
import java.util.LinkedList;


public class Lists {
    public static void main(String[] args) {
        //List 1) есть индексы 2)могут быть дубли 3)есть порядок входа //Магазин у автомата
        // Set 1) нет индекса 2) нет дублей 3) нет порядка входа // Мешок яблок
        ArrayList<String> qwe = new ArrayList<>();
        LinkedList<String> asd = new LinkedList<>();
        qwe.add("Дамир");
        qwe.add("Дима");
        qwe.add("Илья");
        qwe.add("Айдар");
        qwe.add(0, "Barsik");
        System.out.println(qwe.size());
        qwe.set(3, "Vova");//перезаписывает
        qwe.addAll(asd);
        System.out.println(qwe);
        System.out.println(qwe.contains("Vova"));
    }
}
