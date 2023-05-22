package Lesson5;

import java.util.Locale;


public class Password {
    public static void main(String[] args) {
        String password = "sdbjk6oi";
        if (password.length() <= 8) {
            System.out.println("Пароль меньше 8 символов");

        }
        // хотя бы 1 большая буква
        String alfabet = "abcdefghijklmnopqrstuvwxyz".toUpperCase();
        int countUpper = 0;
        for (int i = 0; i < password.length(); i++) {
            char charFromPassword = password.charAt(i);
            if (alfabet.contains(charFromPassword + "")) {
                countUpper++;

            }
        }
        if (countUpper == 0) {
            System.out.println("Нет символов с большой буквы");
            return;
        }
    }
}
