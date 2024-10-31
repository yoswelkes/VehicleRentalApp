public class Main {

    public static void main(String[] args) {
        Vehicle car1 =  new Vehicle("ABC-1234", "", 200, VehicleType.Cars);

        System.out.println(car1.getLicensePlate());
    }
}
