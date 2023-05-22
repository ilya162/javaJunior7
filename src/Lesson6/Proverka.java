package Lesson6;

import java.util.Scanner;

public class Proverka {

    public static String proverkaEmail() {

        boolean proverkaEmail = true;
        String login = "";
        while (proverkaEmail) {
            System.out.println("Введите логин");
            Scanner sc = new Scanner(System.in);
            login = sc.nextLine();

            String replace = login.replace("@", "");
            if (login.length() - replace.length() == 0) {

                System.out.println("Нет @");
            } else if (login.length() - replace.length() > 1) {
                System.out.println("слишком много@");
            } else {
                proverkaEmail = false;
            }
        }
        return login;
    }


    public static void proverkaPassword(String login) {
        boolean p = true;

        while (p) {
            boolean neProideno = true;
            System.out.println("Введите пароль");
            Scanner sc = new Scanner(System.in);
            String pass = sc.nextLine();
            String alphabet = "abcdefghijklmnopqrstuvwxyz".toUpperCase();
            String simvol = "!?/-+=.,<>";
            boolean z = true;
            boolean s = true;
            for (int i = 0; i < pass.length(); i++) {
                char c = pass.charAt(i);
                if (alphabet.contains(c + "")) {
                    z = false;
                }
                if (simvol.contains(pass.charAt(i) + "")) {
                    s = false;
                }
            }
            if (pass.equals(login)) {
                System.out.println("Пароль такой же как и Логин");
            } else if (pass.length() <= 8) {

                System.out.println("Пароль меньше 8 символов");
            } else if (z) {
                System.out.println("Пароль не содержит заглавных букв");
            } else {
                p = false;
            }
        }
    }
    public static void provEmailPassword(){
        String login = proverkaEmail();
        proverkaPassword(login);
    }
}







