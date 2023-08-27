package fc.java.course2.model;

public class ObjectArr<T> {
    private T[] array;
    private int size;

    public ObjectArr(int size) {
        //어떤 타입인지 결정되지 않았기 때문에
        //일단은 Object타입으로 만들어 놓고
        //T로 형변환을 시킨다.
        array=(T[])new Object[size];

    }

    public void set(int index,T value) {

        array[index] = value;
        size++;
    }
    public T get(int index) {
        return array[index];

    }

    public int size() {
        return size;

    }
}
