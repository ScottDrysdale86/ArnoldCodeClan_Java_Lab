import java.util.ArrayList;

public class Dealership {
    private ArrayList<Vehicle> allVehicles;
    private double till;

    public Dealership(double till) {
        this.allVehicles = new ArrayList<>();
        this.till = till;
    }

    public ArrayList<Vehicle> getAllVehicles() {
        return allVehicles;
    }

    public double getTill() {
        return till;
    }

    public void buy(Vehicle vehicle) {
        vehicle.setRepairedPrice(vehicle.getPrice());
        this.assessDamage(vehicle);
        double price = vehicle.getPrice();
        if( till >= price){
            allVehicles.add(vehicle);
            till -= price;
            vehicle.setPrice(price * 1.2);
        }
    }

    public int getAllVehiclesCount() {
        return allVehicles.size();
    }

    public void assessDamage(Vehicle vehicle){
        double modifier = vehicle.getDamage().getModifier();
        vehicle.modifyPrice(modifier);
    }
    public void sell(Vehicle vehicle, Customer customer) {
        customer.buy(vehicle);
        this.allVehicles.remove(vehicle);
        this.till += vehicle.getPrice();
    }

    public void repair(Vehicle vehicle) {
        vehicle.setPrice(vehicle.getRepairedPrice());
        vehicle.setDamage(Damage.NONE);
    }
}
