import java.util.ArrayList;

public class Dealership {
    private ArrayList<Vehicle> allVehicles;
    private double till;

    public Dealership(ArrayList<Vehicle> allVehicles, double till) {
        this.allVehicles = allVehicles;
        this.till = till;
    }

    public ArrayList<Vehicle> getAllVehicles() {
        return allVehicles;
    }

    public double getTill() {
        return till;
    }
}
