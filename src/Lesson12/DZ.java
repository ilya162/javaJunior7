package Lesson12;



import java.util.ArrayList;

public class DZ {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();


        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        b.add(5);
        b.add(6);
        b.add(7);
        b.add(8);
        b.add(9);
        b.add(10);


        a.addAll(b);//Объединение
         System.out.println(a);
        System.out.println();

//        b.removeAll(a);// разность
//        System.out.println(b);
//        System.out.println();
//
//        b.retainAll(a);//пересечение
//        System.out.println(b);
//        System.out.println();
//
//        a.indexOf(5);// симметрическая разность
//        System.out.println(a.indexOf(5));
//        a.remove(4);
//        System.out.println(a);
//        b.indexOf(5);
//        System.out.println(b.indexOf(5));
//        b.remove(0);
//        System.out.println(b);
//        a.addAll(b);
//        System.out.println(a);


            }






    }


