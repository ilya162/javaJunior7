package Lesson8;


public class Main {
    public static void main(String[] args) {

        Ture[] turs = new Ture[10];
//        Ture[] sortedByCountry = new Ture[10];
        turs[0] = new Ture(100000, "OAE", 4, "Самолёт", "Завтрак,ужин");
        turs[1] = new Ture(70000, "Turkie", 4, "Самолёт", "Всё включено");
        turs[2] = new Ture(110000, "Cypre", 3, "Самолёт", "Завтрак");
        turs[3] = new Ture(50000, "Russia", 3, "Поезд", "Без питания");
        turs[4] = new Ture(65000, "Abhazia", 1, "Машина", "Завтрак,обед,ужин");
        turs[5] = new Ture(85000, "Georgia", 4, "Самолёт", "Всё включено");
        turs[6] = new Ture(93000, "Armenia", 5, "Самолёт", "Всё включено");
        turs[7] = new Ture(150000, "Tailand", 2, "Самолёт", "Завтрак");
        turs[8] = new Ture(105000, "Egypt", 5, "Самолёт", "Всё включено");
        turs[9] = new Ture(200000, "Maldivs", 4, "Самолёт", "Завтрак");


        for (int i = 0; i < turs.length; i++) {
            System.out.println(turs[i]);
        }
        Ture[] tures = Tursutils.sortByPrice(80000, turs);
        System.out.println();
        Ture[] tures2 = Tursutils.sortByCountry("Turkie", turs);
        System.out.println();
        Ture[] tures3 = Tursutils.sortByStar(1, turs);
        System.out.println();
        Ture[] tures4 = Tursutils.SortByPriceandStar(105000, 5, turs);
        System.out.println();
        Ture[] tures5 = Tursutils.SortByPriceandPit(90000, "Всё включено", turs);
        System.out.println();
        Ture[] tures6 = Tursutils.SortByPriceandCountry(70000, "Russia", turs);
        System.out.println();
        Ture[] tures7 = Tursutils.SortByCoutryandStar("Tailand", 2,turs);
        System.out.println();


    }

}