package Lesson8.BlackJack;

import java.util.Scanner;

public class Game {
    private Deller deller;
    private Player[] players = new Player[5];
    private Coloda coloda = new Coloda();

    public Game(Deller deller) {
        this.deller = deller;
    }

    public void setPlayers(Player player) {
        for (int i = 0; i < players.length; i++) {
            if (players[i] == null) {
                this.players[i] = player;
                return;
            }
        }
    }

    public void distributeCart() {
        deller.setCarts(coloda.getRandomCart());
        deller.setCarts(coloda.getRandomCart());

        for (int i = 0; i < players.length; i++) {
            if (players[i] != null) {
                players[i].setCarts(coloda.getRandomCart());
                players[i].setCarts(coloda.getRandomCart());
            }
        }
    }

    public void giveMoreCart() {
        while (deller.getValue() <= 17) {
            deller.setCarts(coloda.getRandomCart());
        }

        for (int i = 0; i < players.length; i++) {
            if (players[i] != null) {
                boolean reise = true;
                while (reise) {
                    System.out.println("Игрок " + (i + 1) + " " + players[i].getName());
                    players[i].printCart();
                    System.out.println("Нужны еще карты? 1 - да 2 - нет");
                    Scanner sc = new Scanner(System.in);
                    String s = sc.nextLine();
                    if (s.equals("1")) {
                        players[i].setCarts(coloda.getRandomCart());
                    } else {
                        reise = false;
                    }
                }
            }
        }
    }

    public void printVinner() {
        String vinner = "Диллер";
        for (Player player : players) {
            if (player != null) {
                if (player.getValue() <= 21) {
                    vinner = "";
                    break;
                }
            }
        }
        if (vinner == "Диллер") {
            System.out.println("Выиграл Диллер");
            deller.printCart();
            return;
        }
        //1) Игрок -21 Диллер -21 Ничья
        //2) Игрок >21 Диллер Б=21 Диллер
        //3) Игрок <=21 Диллер >21 Игрок
//        4) Игрок <21 Диллер <21 Выиграл тот у кого больше.

        String win = "";
        for (Player player : players) {
            if (player != null) {
                if (player.getValue() == 21) {
                    win += player.getName() + "";
                }


            }
        }
        if (deller.getValue() == 21) {
            win += deller.getName() + "";
        }
        if (!win.equals("")) {
            System.out.println(win);
            return;
        }
        boolean b = true;
        for (Player player : players) {
            if (player != null) {
                if (player.getValue() < 21) {
                    b = false;
                }
            }

        }
        if (b) {
            System.out.println("Выиграл дилер");
            deller.printCart();
            return;
        }
        int max = 0;
        for (Player player : players) {
            if (player != null) {
                if (player.getValue() < 21) {
                    if (max < player.getValue()) {
                        max = player.getValue();
                    }
                }
            }

        }
        if (max > deller.getValue()) {
            for (Player player : players) {
                if (player != null) {
                    if (player.getValue() == max) {
                        System.out.println("Выиграл" + player.getName());
                        player.getCarts();
                        return;
                    }
                }
            }
        } else {
            System.out.println("Выиграл дилер");
            deller.printCart();
            return;
        }

    }
}



