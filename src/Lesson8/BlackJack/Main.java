package Lesson8.BlackJack;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Deller deller = new Deller();
        deller.setName("������ ����");
        Game game = new Game(deller);

        int i = 0;
        boolean b = true;
        while (i < 5 && b) {
            System.out.println("�������� ������? 1- ��, 2-���");
            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine();

            int i1 = Integer.parseInt(s);
            if (i1 == 1) {
                System.out.println("������� ��� ������");
                String name = scanner.nextLine();
                Player player = new Player();
                player.setName(name);
                game.setPlayers(player);
                i++;
            } else {
                if (i == 0) {
                    System.out.println("����� ���� �� ���� �����");
                } else {
                    b = false;
                }

            }
        }





            game.distributeCart();

            game.giveMoreCart();

            game.printVinner();


            System.out.println();


        }
    }

