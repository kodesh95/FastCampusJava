package fc.java.part3;

import fc.java.model.CarDTO;
import fc.java.model.CarUtility;

public class CarUtilityTest {
    public static void main(String[] args) {
        // Car 정보를 출력하는 동작을 가지고 있는 Utility클래스를 설계하라

        int carSn = 1001;
        String carName = "BMW528i";
        int carPrice = 90000000;
        String carOwner = "choi";
        int carYear = 2029;
        String carType = "G";

        CarDTO car=new CarDTO();
        car.carSn=carSn;
        car.carName=carName;
        car.carPrice=carPrice;
        car.carOwner=carOwner;
        car.carYear=carYear;
        car.carType=carType;
//        carPrint(car);

        CarUtility carUtil=new CarUtility();
        carUtil.carPrint(car);

    }



    //    fc.java.model.CarDTO 클래스의 Full name
//    public static void carPrint(CarDTO car) {
//        System.out.println("carName = " + car.carName);
//        System.out.println("carPrice = " + car.carPrice);
//        System.out.println("carOwner = " + car.carOwner);
//        System.out.println("carYear = " + car.carYear);
//        System.out.println("carType = " + car.carType);
//
//    }
}
