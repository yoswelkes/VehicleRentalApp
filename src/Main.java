public class Main {

    public static void main(String[] args) {
        Vehicle car1 =  new Vehicle("ABC-1234", "red", 200, VehicleType.Cars);
        Vehicle car2 =  new Vehicle("AAA", "white", 122, VehicleType.motorcycles);
        Vehicle car3 =  new Vehicle("ABC", "blue", 122, VehicleType.motorcycles);


        System.out.println(car1.getLicensePlate());
    }
}
