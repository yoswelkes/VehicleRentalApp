import java.util.ArrayList;
import java.util.HashMap;

public class Customer {
    private String name;
    private String address;
    private int age;
    private HashMap<String, Number> rentalHistory;

    public Customer(String name, String address, int age){
        setName(name); setAddress(address); setAge(age);
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getAddress(){
        return this.address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void addToRentedVehicleList(String vehiclePlateNo, int rentedDays){
        if (rentedHistory == null){
            rentedHistory =  new HashMap<>();
        }
        rentedHistory.put(vehiclePlateNo, rentedDays);
    }

    public double getTotalRentalPrice(){
        double retVal = 0;
        for (String vehicle : this.rentedHistory.keyset())
        {
            retVal += vehicle.getPricePerDay() *
        }
    }
}
