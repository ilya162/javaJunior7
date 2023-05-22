package Lesson14;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Tovar tovar = new Tovar("Ведро", 500, "Ведро железное");
        Otziv otziv = new Otziv(5, "Хорошее ведро,служит 7 лет");
        Forum forum = new Forum("Из чего ведро");
        forum.setKoments("Ведро из нержавейки");
        tovar.setForums(forum);
        tovar.setOtzivs(otziv);

        Tovar tovar1 = new Tovar("Машинка", 13000, "Машинка на радиоуправлении");
        Otziv otziv1 = new Otziv(4, "Хорошая,но быстро разряжается");
        Forum forum1 = new Forum("Где произведена?");
        forum1.setKoments("China.");
        tovar1.setForums(forum1);
        tovar1.setOtzivs(otziv1);

        Tovar tovar2 = new Tovar("Тример для стрижки волос", 2000, "Аккумуляторный");
        Otziv otziv2 = new Otziv(2, "Сломался через месяц использования");
        tovar2.setOtzivs(otziv2);
        Forum forum2 = new Forum("Можно ли использовать от сети?");
        forum2.setKoments("Да,можно.");
        tovar2.setForums(forum2);

        Tovar tovar3 = new Tovar("Монитор", 10000, "Жидкокристаллический,26 дюймов");
        Otziv otziv3 = new Otziv(5, "Яркие цвета,большой");
        tovar3.setOtzivs(otziv3);

        Tovar tovar4 = new Tovar("Самокат", 5000, "Самокат трехколесный Маша и Медведь");
        Otziv otziv4 = new Otziv(3, "Дочке понравился,но начал быстро скрипеть");
        tovar4.setOtzivs(otziv4);

        TreeSet<Tovar> tovars = new TreeSet<>();
        tovars.add(tovar);
        tovars.add(tovar1);
        tovars.add(tovar2);
        tovars.add(tovar3);
        tovars.add(tovar4);
        for (Tovar tovar5 : tovars) {
            System.out.println(tovar5);

        }
        System.out.println();


        TreeSet<Tovar> tovarsSortByPriceToFrom = Tovar.sortByPriceToFrom(tovars);
        for (Tovar tovar5 : tovarsSortByPriceToFrom) {
            System.out.println(tovar5);

        }
        System.out.println();
        TreeSet<Tovar> tovarsSortByRateToFrom = Tovar.SortByRateToFrom(tovars);
        for (Tovar tovar5 : tovarsSortByRateToFrom) {
            System.out.println(tovar5);


        }
        System.out.println();
        TreeSet<Tovar> tovarsSortByUnderDiscussion = Tovar.SortByUnderDiscussion(tovars);
        for (Tovar tovar5 : tovarsSortByUnderDiscussion) {
            System.out.println(tovar5);


        }
    }
}
