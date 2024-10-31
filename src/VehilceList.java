import java.util.ArrayList;
import java.util.Objects;

public class VehilceList {
    public static ArrayList<Vehicle> listOfVehicles = null;
    public static double getPricePerdayByPlateNumber(String licensePlate){
        for (Vehicle vehicle: listOfVehicles) {
            if (Objects.equals(vehicle.getLicensePlate(), licensePlate))
                return vehicle.getPricePerDay();
        }
        return 0;
    }

    public static void addToList(Vehicle car){
        if (listOfVehicles == null)
                listOfVehicles = new ArrayList<>();

        listOfVehicles.add(car);
    }

}
