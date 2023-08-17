package fc.java.course1.model;

public class CarUtility {
    public void carPrint(CarDTO car) {
        System.out.println("carName = " + car.carName);
        System.out.println("carPrice = " + car.carPrice);
        System.out.println("carOwner = " + car.carOwner);
        System.out.println("carYear = " + car.carYear);
        System.out.println("carType = " + car.carType);

    }
}
