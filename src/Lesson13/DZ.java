package Lesson13;

public class DZ {
    public static void main(String[] args) {
        StringUtilsCustom custom = new StringUtilsCustom();
        try {
            System.out.println(custom.div("123","1"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("End");

        StringUtilsCustom custom1 = new StringUtilsCustom();
        custom1.findWord("��������� AMD A6-9500E OEM �������� ������� �������� �������� 3000 ���, � ��� ������� �� ���������� Turbo Core ����� �������� �� �������� ������� �� 3400 ���. �������������� � ������������ OEM ���������, ������������ �� ����� AM4, ����� ����������� ��������� ��� ������������������� �������� �������, ���������� ��� ����� ��� �����, �������������� �������. �� ���������� ���������� ����������� ����� Radeon R5, ������� �������� �������� ��� ���������� ���������� ��� ��������� ��������� ����������� ������.\n" +
                "��������� AMD A6-9500E OEM � ��������������� �� ������ ����� 35 �� �� ��������� � ������ ������ ��� ����������. �� ������������ ������ � ����������� ������� ���� DDR4 � ��������� ��������� ��� ����� ������� �� 64 ��. �������������� ������� ����������� ������ - 1600-2400 ���. ��������� ���������� ������ ������������������, ������� ���������� � �������� �������� ����������������.","���������");

    }




}