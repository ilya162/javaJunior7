package Lesson12;

import java.util.ArrayList;
import java.util.LinkedList;


public class Lists {
    public static void main(String[] args) {
        //List 1) ���� ������� 2)����� ���� ����� 3)���� ������� ����� //������� � ��������
        // Set 1) ��� ������� 2) ��� ������ 3) ��� ������� ����� // ����� �����
        ArrayList<String> qwe = new ArrayList<>();
        LinkedList<String> asd = new LinkedList<>();
        qwe.add("�����");
        qwe.add("����");
        qwe.add("����");
        qwe.add("�����");
        qwe.add(0, "Barsik");
        System.out.println(qwe.size());
        qwe.set(3, "Vova");//��������������
        qwe.addAll(asd);
        System.out.println(qwe);
        System.out.println(qwe.contains("Vova"));
    }
}
