package fc.java.course2.part2;

import java.util.ArrayList;

public class CollectionBasic {
    public static void main(String[] args) {
        /*
        * ArrayList에 10,20,30,40,50 개의 정수를 저장하고 출력하기
        * 과거에는
        * ArrayList(Object[]) <--x--- int
        * ArrayList(Object[]) <--o--- Integer(Wrapper)
        * 최근에는
        * ArrayList(Object[]) <--o--- int (auto-boxing)
        * */
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10); //auto-boxing : list.add(new Integer(10));
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        // list에는 Integer만 있는데 for문에서
        // 자동으로 auto-unboxing이 되기 때문에 int data : list 가 가능
        for (int data : list)
            System.out.println(data);
    }
}
