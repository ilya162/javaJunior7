package Lesson14;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Tovar tovar = new Tovar("�����", 500, "����� ��������");
        Otziv otziv = new Otziv(5, "������� �����,������ 7 ���");
        Forum forum = new Forum("�� ���� �����");
        forum.setKoments("����� �� ����������");
        tovar.setForums(forum);
        tovar.setOtzivs(otziv);

        Tovar tovar1 = new Tovar("�������", 13000, "������� �� ���������������");
        Otziv otziv1 = new Otziv(4, "�������,�� ������ �����������");
        Forum forum1 = new Forum("��� �����������?");
        forum1.setKoments("China.");
        tovar1.setForums(forum1);
        tovar1.setOtzivs(otziv1);

        Tovar tovar2 = new Tovar("������ ��� ������� �����", 2000, "��������������");
        Otziv otziv2 = new Otziv(2, "�������� ����� ����� �������������");
        tovar2.setOtzivs(otziv2);
        Forum forum2 = new Forum("����� �� ������������ �� ����?");
        forum2.setKoments("��,�����.");
        tovar2.setForums(forum2);

        Tovar tovar3 = new Tovar("�������", 10000, "��������������������,26 ������");
        Otziv otziv3 = new Otziv(5, "����� �����,�������");
        tovar3.setOtzivs(otziv3);

        Tovar tovar4 = new Tovar("�������", 5000, "������� ������������ ���� � �������");
        Otziv otziv4 = new Otziv(3, "����� ����������,�� ����� ������ ��������");
        tovar4.setOtzivs(otziv4);

        TreeSet<Tovar> tovars = new TreeSet<>();
        tovars.add(tovar);
        tovars.add(tovar1);
        tovars.add(tovar2);
        tovars.add(tovar3);
        tovars.add(tovar4);
        for (Tovar tovar5 : tovars) {
            System.out.println(tovar5);

        }
        System.out.println();


        TreeSet<Tovar> tovarsSortByPriceToFrom = Tovar.sortByPriceToFrom(tovars);
        for (Tovar tovar5 : tovarsSortByPriceToFrom) {
            System.out.println(tovar5);

        }
        System.out.println();
        TreeSet<Tovar> tovarsSortByRateToFrom = Tovar.SortByRateToFrom(tovars);
        for (Tovar tovar5 : tovarsSortByRateToFrom) {
            System.out.println(tovar5);


        }
        System.out.println();
        TreeSet<Tovar> tovarsSortByUnderDiscussion = Tovar.SortByUnderDiscussion(tovars);
        for (Tovar tovar5 : tovarsSortByUnderDiscussion) {
            System.out.println(tovar5);


        }
    }
}
