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
        System.out.println("*************************************");

        StringUtilsCustom custom1 = new StringUtilsCustom();
        int[] a = custom1.findWord("English can be a hard language to learn. That�s why usually you learn it by levels1. In CERF standard A1 is the beginner level, A2 is harder, but still2 is very easy. Then you have B1 and B2. Highest levels of learning3 are C1 and C2.\n" +
                "\n" +
                "To make things easy for beginners, a special type of English language was made in 1930. The aim4 was to make it useful5 for learning and easy enough6 to explain complex ideas with simple words. This Basic English was made by Charles Kay Ogden, an English writer. Only 850 common7 words are used in Basic English. Any technical words can also be used, but must be explained with simple words first. New words are formed with common word endings and prefixes8: un-, -s, -es, -er, -ed, -est, -ing, -ly. You can also make new words by combining some simple words into a new one. For example: milkman, fireman, sunrise, northeast, gearbox9. In regular English such words are usually known as compound words10.","English");

        for (int i : a) {
            System.out.println(i);
        }


        System.out.println("****************************");
       StringUtilsCustom custom2 = new StringUtilsCustom();
       double[] qwe = new double[0];

        try {
            qwe = custom2.findNumbers("�������� DEXP A350 �������� �� ������ ��� ����������� ���������� �������, �� ����� ����������� ������������������� �� �������� �������������. ������ Wi-Fi 4 (802.11n) ����������� ������������� ������ � ��������� ��������� �������, � 5-�������� ������� ��������� ���������� ����������������� � ������������ �������� � ������������ ���������� 960x480 ��������.\n" +
                     "�� ������� �������� ������ � ��������� ���������� ������������ 4-������� ��������� MediaTek MT6580M � �������� 1.3 ���. �������� DEXP A350 ��������� ���������� ���������� �������, ���� ������� ��� ������������ ���������� 2500 ���. ��������� ����� ���������� ������, ������������ 16 ��, �� ������� ����������� microSD-�����.");
            for (double v : qwe) {
                System.out.println(v);

            }
        } catch (CustomException e) {
            e.printStackTrace();
        }


    }
    }





