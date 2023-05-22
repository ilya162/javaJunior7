package Lesson5;

import java.util.Scanner;

public class Email2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String login = sc.nextLine();
        // int index = login.indexOf('@');
        // System.out.println("@ находится на " + (index + 1));
        //asd @mail.ru - @=asdmail.ru второй метод
        String replace = login.replace("@", "");

        if (login.length() - replace.length() == 0) {
            System.out.println("Нет @");
        } else if (login.length() - replace.length() > 1) {
            System.out.println("@ слишком много");
        }else {
            System.out.println("Идеально");
        }

    }
}

