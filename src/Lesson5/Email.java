package Lesson5;


import java.util.Scanner;



        public class Email {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Введите ваш адрес электронной почты: ");
                String phone = sc.next();
                String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";

                boolean result = phone.matches(regex);
                if (result) {
                    System.out.println("Введите пароль: ");
                } else {
                    System.out.println("Неверный адрес электронной почты");
                }
            }
        }
       





