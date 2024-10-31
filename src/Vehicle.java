import java.util.ArrayList;
import java.util.List;

public class Vehicle {
    private String licensePlate;
    private String color;
    private double pricePerDay;
    private boolean isRentedOut;
    private VehicleType type;
    private Customer rentingClient;
    private ArrayList<Customer> rentalHistory;

    public List<Customer> getTopFiveRentalHistory(){
        return rentalHistory.subList(rentalHistory.size() - 6, rentalHistory.size() - 1);
    }

    private void addToRentalHistory(Customer rentingClient){
        if (rentalHistory == null){
            rentalHistory = new ArrayList<>();
        }
        rentalHistory.add(rentingClient);
    }

    public void rentOut(Customer rentingClient){
        if (!getIsRentedOut()) {
            setIsRentedOut(true);
            setRentingClient(rentingClient);

            addToRentalHistory(rentingClient);

             // rentingClient.addToRentedVehicleList(this);
        }
    }


    public Vehicle(String licensePlate, String color, double pricePerDay, VehicleType type){
        setLicensePlate(licensePlate);
        setColor(color);
        setPricePerDay(pricePerDay);
        setType(type);

        VehilceList.addToList(this);
    }

    public String getLicensePlate(){
        return this.licensePlate;
    }

    public void setLicensePlate(String licensePlate){
        this.licensePlate = licensePlate;
    }

    public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public double getPricePerDay(){
        return this.pricePerDay;
    }

    public void setPricePerDay(double pricePerDay){
        this.pricePerDay = pricePerDay;
    }

    public Customer getRentingClient(){
        return this.rentingClient;
    }

    public void setRentingClient(Customer rentingClient){
        this.rentingClient = rentingClient;
    }

    public boolean getIsRentedOut(){
        return this.isRentedOut;
    }

    public void setIsRentedOut(boolean isRentedOut){
        this.isRentedOut = isRentedOut;
    }

    public VehicleType getType(){
        return this.type;
    }

    public void setType(VehicleType type){
        this.type = type;
    }
}

