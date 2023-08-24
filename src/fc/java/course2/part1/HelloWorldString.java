package fc.java.course2.part1;

public class HelloWorldString { 
    public static void main(String[] args) {
        String str1 = new String("Hello 안녕"); //heapmemory
        System.out.println("str1 = " + str1);

        String str2 = "Hello 안녕"; //literalpoolmemory
        System.out.println("str2 = " + str2);
    }
    
}


/*
* 문자열을 생성하는법
* 1. new 생성자를 사용
* -String str1=new String("Hello World"); ---> 객체 1
* -String str2=new String("Hello World"); ---> 객체 2
* str1 과 str2 가 서로 다른 객체를 가리킨다. (또한 객체들은 heapmemory에 생성된다.)
*
* 2. 그냥 생성하기 (int a = 1 과 같이 생성)
* -String str1 = "Hello World"; (literal : 문자열 상수)
* -String str2 = "Hello World";
* str1 과 str2 가 서로 같은 객체를 가리킨다. (또한 객체는 Literal Pool memory에 생성된다.)
* */