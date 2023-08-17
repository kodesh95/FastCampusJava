package fc.java.course2.model;

public class MinMaxFinder {
    private MinMaxFinder() {
    }
    public static int findMin(int[] arr) {
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        return min;
    }

    public static int findMax(int[] arr) {
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }

//    static으로 만들어진 메소드는 객체생성없이 사용가능
}
