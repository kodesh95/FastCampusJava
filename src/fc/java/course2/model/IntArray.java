package fc.java.course2.model;

import java.util.Arrays;

/**
 * IntArray
 * : []을 사용하지 않고 배열을 만들기
 *
 * @author comet
 * @version 17
 * date of preparation 2023-08-21
 * time 오전 11:58
 **/
public class IntArray {

    private final int DEFAULT_CAPACITY = 5; // 수정불가(상수)
    private int[] elements;
    private int size = 0;

    //    생성동작
    public IntArray() {

        elements = new int[DEFAULT_CAPACITY];
    }

    //    저장동작
    public void add(int element) {
        if (size == elements.length)//크기를 두배로 늘리는 작업
            ensureCapacity();

        elements[size++] = element;
    }

    //    출력동작
    public int get(int index) {
        //음수나 size보다 같거나 큰 것은 제외
        if (index<0 || index>=size)
            throw new IndexOutOfBoundsException("over range");
        return elements[index];
    }

    //    크기 확인
    public int size() {

        return size;
    }

    //    배열의 길이 확장
    public void ensureCapacity() {

        int newCapacity = elements.length * 2;

        elements=Arrays.copyOf(elements, newCapacity);
    }

}
