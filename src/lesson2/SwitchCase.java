package lesson2;

public class SwitchCase {
    public static void main(String[] args) {
        int ocenka =4;
        switch (ocenka){
            case 5:
                System.out.println("Molodec");
                break; //   вылетает в конец функции
            case 4:
                System.out.println("Horosho");
                break;
            case 3:
                System.out.println("Udovletvoritelno");
                break;
            case 2:
                System.out.println("Opyat dvoika");
                break;
            case 1:
                System.out.println("Nesi remen");
                break;
        }
    }
}
