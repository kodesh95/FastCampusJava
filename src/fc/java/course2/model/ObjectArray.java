package fc.java.course2.model;

import java.util.Arrays;

public class ObjectArray {

    private final int DEFAULT_CAPACITY = 5; // 수정불가(상수)
    private Object[] elements; //다형성 배열
    private int size = 0;

    //    생성동작
    public ObjectArray() {

        elements = new Object[DEFAULT_CAPACITY];
    }

    //    저장동작
    public void add(Object element) {
        if (size == elements.length)//크기를 두배로 늘리는 작업
            ensureCapacity();

        elements[size++] = element;
    }

    //    출력동작
    public Object get(int index) {
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
