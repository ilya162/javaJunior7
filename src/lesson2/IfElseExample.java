package lesson2;

public class IfElseExample {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = 5; // треуг равнобедренный, разносторонний,равносторонний, невозможный
        if (a == b && b != c ||
                a == c && c != b ||
                c == b && b != a) {
            System.out.println("Равнобедренный треугольник");
        } else if (a == b && b == c && c == a) {
            System.out.println("Равносторонний треугольник");
        }
         else if (a != b && b != c && c != a) {
            System.out.println("Разносторонний треугольник");

        }
         else {
            System.out.println("Невозможный треугольник");
        }
    }
}
