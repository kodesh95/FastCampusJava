package fc.java.part2;

public class CallByValue {
    public static void main(String[] args) {
        float a=59.3f;
        float b=39.14f;
        floatAdd(a,b);
        System.out.println("end");

    }
    static void floatAdd(float a,float b) {
        float hap=a+b;
        System.out.println("hap = " + hap);
    }
}
