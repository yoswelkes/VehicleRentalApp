public class Main {

    public static void main(String[] args) {
        Vehicle car1 =  new Vehicle("ABC-1234", "red", 200, VehicleType.Cars);
        Vehicle car2 =  new Vehicle("AAA", "white", 122, VehicleType.Motorcycles);
        Vehicle car3 =  new Vehicle("ABC", "blue", 122, VehicleType.Trucks);


        Customer customer1 = new Customer("Yosief", "Kampala", 45);
        Customer customer2 = new Customer("Guled", "Kampala", 40);

        car1.rentOut(customer1);
        car1.returnBack();

        car1.rentOut(customer2);

        car2.rentOut(customer1);
        car2.returnBack();

        car3.rentOut(customer1);

        System.out.println(car1.getIsRentedOut());
    }
}
