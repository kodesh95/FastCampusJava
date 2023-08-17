package fc.java.course1.part3;

import fc.java.course1.model.CarDAO;
import fc.java.course1.model.CarDTO;

import java.util.Scanner;

public class CarInsertTest {
    public static void main(String[] args) {
        // 자동차 정보를 키보드로 부터 입력을 받아서 DB에 저장하세요.(JDBC)

        Scanner sc = new Scanner(System.in);
//        Scanner라는 모델(새로운 데이터형)이 이미 정의되어 있다.
//        new연산자와 생성자 메소드 Scanner() 로 새로운 객체생성
//        키보드에서 입력받는다는 의미 : System.in
        System.out.print("car's serial number:");
        int carSn = sc.nextInt();

        sc.nextLine();

        System.out.print("car's name:");
        String carName = sc.nextLine();

        System.out.print("car's price:");
        int carPrice = sc.nextInt();

        sc.nextLine();

        System.out.print("car's owner:");
        String carOwner = sc.nextLine();

        System.out.print("car's year:");
        int carYear = sc.nextInt();

        sc.nextLine();

        System.out.print("car's type:");
        String carType = sc.nextLine();

//        carInfoPrint(carSn,carName,carPrice,carOwner,carYear,carType);
//    자동차 데이터를 이동하기 위한 바구니가 필요하다.(DTO 필요)
//        class로 CarDTO 설계

        CarDTO car = new CarDTO();
        car.carSn = carSn;
        car.carName = carName;
        car.carPrice = carPrice;
        car.carOwner = carOwner;
        car.carYear = carYear;
        car.carType = carType;

        CarDAO dao = new CarDAO();
        dao.carInsert(car);
        dao.carSelect();

    }
}
