package Lesson13;

import java.io.IOException;

public class Ex {
    public static void main(String[] args) {
         People people= new People();
        try {
            people.setAge(100);
            people.setName(null);
        }catch (IOException e){
            System.out.println("�� ����� ������ ��������");
        } catch (Exception e) {
            e.printStackTrace();
        }catch (Throwable e){
            System.out.println("Trowable" );
        }finally {
            System.out.println("�� �����������");
        }
        System.out.println("End");
    }
}
