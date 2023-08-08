package fc.java.part3;
//import java.lang.*; 생략되어 있다
//lang은 default package

import fc.java.model.*;

import java.util.*;

public class PackageNameTest {
    public static void main(String[] args) {
//        기본적으로 제공해주는 class의 이름을 적어보자
        String str;
        Scanner sc=new Scanner(System.in);
        System.out.println("hello world");

        CarDTO car=new CarDTO();
        car.carType="G";
        car.carName="genesis GV70";
        car.carYear=2029;
        car.carPrice=60000000;
        car.carOwner="choi ji eun";
        car.carSn=2401;

        CarUtility carUtility=new CarUtility();
        carUtility.carPrint(car);

    }
}
