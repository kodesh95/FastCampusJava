package fc.java.course2.part2;

import fc.java.course2.model.StringOperation;

public class LambdaApply {
    public static void main(String[] args) {
        StringOperation toUpperCase = s -> s.toUpperCase();
        StringOperation toLowerCase = s -> s.toLowerCase();

        String input = "Lambda Expressions";
        String str1 = processString(input, toUpperCase);
        System.out.println("대문자로 변환 : " + str1);
        String str2 = processString(input, toLowerCase);
        System.out.println("소문자로 변환 : " + str2);
    }

    public static String processString(String input, StringOperation operation){

        return operation.apply(input);
    }
}
