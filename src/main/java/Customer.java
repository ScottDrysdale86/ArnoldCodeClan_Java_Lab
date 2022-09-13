import java.util.ArrayList;

public class Customer {
    private String name;
    private double wallet;
    private ArrayList<Vehicle> ownedVehicles;

    public Customer(String name, double wallet) {
        this.name = name;
        this.wallet = wallet;
        ownedVehicles = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public double getWallet() {
        return wallet;
    }

    public ArrayList<Vehicle> getOwnedVehicles() {
        return ownedVehicles;
    }

    public int getOwnedVehiclesCount() {
        return ownedVehicles.size();
    }

    public void assessDamage(Vehicle vehicle){
        double modifier = vehicle.getDamage().getModifier();
        vehicle.modifyPrice(modifier);
    }

    public void buy(Vehicle vehicle) {
        this.assessDamage(vehicle);
        double price = vehicle.getPrice();
        if(wallet >= vehicle.getPrice()) {
            ownedVehicles.add(vehicle);
            wallet -= vehicle.getPrice();
        }
    }





}
