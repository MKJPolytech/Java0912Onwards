package chp09.ex9_4;

import java.util.ArrayList;

public class ArrayListTest {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();

        //Element 추가
        names.add("Kim");
        names.add("Park");
        names.add("Lee");//2
        names.add("Jung");

        //Element 변경
        names.set(1,"Cha");

        //Element 삭제
        String removedName = names.remove(2);

        System.out.println("식제된 요소: " + removedName);

        for (int i = 0; i < names.size(); i++) {
            System.out.printf(" %s |" , names.get(i));
        }
    }
}
