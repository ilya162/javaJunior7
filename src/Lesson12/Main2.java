package Lesson12;

import java.util.HashSet;

public class Main2 {
    public static void main(String[] args) {


        Coin coin1 = new Coin(5, "Медь", 2.5, 1999);
        Coin coin2 = new Coin(5, "Медь", 2.5, 1999);
        Coin coin3 = new Coin(1, "Свинец", 2.5, 1999);
        Coin coin4 = new Coin(10, "Латунь", 2.5, 1999);
        System.out.println(coin1.hashCode());
        System.out.println(coin2.hashCode());
        System.out.println(coin3.hashCode());
        System.out.println(coin4.hashCode());
        HashSet<Coin> coins = new HashSet<>();
        coins.add(coin1);
        coins.add(coin2);
        coins.add(coin3);
        coins.add(coin4);

        for (Coin coin : coins) {


        }

        System.out.println(coins);


    }

}
