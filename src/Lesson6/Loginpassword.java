package Lesson6;

import java.util.Scanner;

public class Loginpassword {
    public static void Mail() {

        System.out.println("Введите логин: ");
        Scanner sc = new Scanner(System.in);
        String login = sc.nextLine();
       boolean proverkaEmail = true;
        while (proverkaEmail) {

            String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";

            boolean result = login.matches(regex);
            if (result) {
                proverkaEmail = true;
                System.out.println("Логин принят.");
                break;



            } else {
                System.out.println("Неверный логин");

                System.out.println("Введите логин: ");


            }

        }


    }

    // public static void Password() {

    public static boolean isValidPassword() {
        System.out.println("Введите пароль: ");
        Scanner sc1 = new Scanner(System.in);
        String password = sc1.nextLine();


        {
            boolean isValid = true;
            if (password.length() < 8) {
                System.out.println("Пароль должен быть длиной больше 8 символов.");
                isValid = false;
            }
            String upperCaseChars = "(.*[A-Z].*)";
            if (!password.matches(upperCaseChars)) {
                System.out.println("Пароль должен содержать хотя бы 1 заглавную букву");
                isValid = false;
            }
            String lowerCaseChars = "(.*[a-z].*)";
            if (!password.matches(lowerCaseChars)) {
                System.out.println("Пароль должен содержать хотя бы 1 строчную букву");
                isValid = false;
            }
            String numbers = "(.*[0-9].*)";
            if (!password.matches(numbers)) {
                System.out.println("Пароль должен содержать хотя бы 1 цифру");
                isValid = false;
            }
            String specialChars = "(.*[@,#,$,%].*$)";
            if (!password.matches(specialChars)) {
                System.out.println("Пароль должен содержать хотя бы 1 спецзнак @#$%");
                isValid = false;
            }
            return isValid;
        }
    }
}
















