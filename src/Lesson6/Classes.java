package Lesson6;

public class Classes {
    public static void main(String[] args) {
        String s = "dkjjl";
        People p = new People();
        p.age = 123;
        p.gender = "Men";
        p.name = "Volodya";

        System.out.println(p.getAge());
        System.out.println(p.getInfo(3));
        People.Say();

        Figuri.Chessboard();
        System.out.println();
        Figuri.Vertstripes();
        System.out.println();
        Figuri.Gorizstripes();
        System.out.println();
        Figuri.Lattice();
        System.out.println();
        Figuri.Rhombus();
        System.out.println();
        Loginpassword.Mail();
        Loginpassword.isValidPassword();

    }
}
