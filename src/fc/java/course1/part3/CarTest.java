package fc.java.course1.part3;

import fc.java.course1.model.CarDTO;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
//        자동차의 정보를 입력받아서 다른 메소드로 이동해야 하는 경우
        Scanner sc = new Scanner(System.in);
//        Scanner라는 모델(새로운 데이터형)이 이미 정의되어 있다.
//        new연산자와 생성자 메소드 Scanner() 로 새로운 객체생성
//        키보드에서 입력받는다는 의미 : System.in
        System.out.print("car's serial number:");
        int carSn=sc.nextInt();

        sc.nextLine();

        System.out.print("car's name:");
        String carName=sc.nextLine();

        System.out.print("car's price:");
        int carPrice=sc.nextInt();

        sc.nextLine();

        System.out.print("car's owner:");
        String carOwner=sc.nextLine();

        System.out.print("car's year:");
        int carYear=sc.nextInt();

        sc.nextLine();

        System.out.print("car's type:");
        String carType=sc.nextLine();

//        carInfoPrint(carSn,carName,carPrice,carOwner,carYear,carType);
//    자동차 데이터를 이동하기 위한 바구니가 필요하다.(DTO 필요)
//        class로 CarDTO 설계

        CarDTO car = new CarDTO();
        car.carSn=carSn;
        car.carName=carName;
        car.carPrice=carPrice;
        car.carOwner=carOwner;
        car.carYear=carYear;
        car.carType=carType;

        carInfoPrint(car);

    }

//    매개변수로 자동차의 정보를 받아서 출력하는 메소드를 정의
//    call by reference
    static void carInfoPrint(CarDTO car) {

        System.out.println("carName = " + car.carName);
        System.out.println("carPrice = " + car.carPrice);
        System.out.println("carOwner = " + car.carOwner);
        System.out.println("carYear = " + car.carYear);
        System.out.println("carType = " + car.carType);

    }
}
/*
 * 모델(클래스)의 종류
 * 시작모델 : main()메소드를 가지고 있는 클래스
 * DTO모델 : 데이터를 담는 모델
 * DAO모델 : DTO를 CRUD 하는 Data Access Object 데이터를 처리하는 모델
 *  - C(저장:insert) R(검색:select) U(수정:update) D(삭제:delete)
 * Utility Model : 위 모델을 제외한 도움을 주는 모델
 * */