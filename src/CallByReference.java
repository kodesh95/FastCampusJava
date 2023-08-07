public class CallByReference {
    public static void main(String[] args) {

        int[] a = {1, 2, 4, 5, 6};
        int result=addArray(a);
        System.out.println("result = " + result);
    }

    static int addArray(int[] a) {
        int sum=0;
        for (int i = 0; i < a.length; i++) {
            sum=sum+a[i];
        }
        return sum;
    }


}
