public class Vehicle {

    Engine engine;
    TyreType tyreType;
    private double price;
    private double repairedPrice;
    private String colour;
    private String make;
    private String model;
    private VehicleType vehicleType;

    private Damage damage;

    public Vehicle(Engine engine, TyreType tyreType, double price, String colour, String make, String model, VehicleType vehicleType, Damage damage) {
        this.engine = engine;
        this.tyreType = tyreType;
        this.price = price;
        this.colour = colour;
        this.make = make;
        this.model = model;
        this.vehicleType = vehicleType;
        this.damage = damage;
        this.repairedPrice = 0;
    }

    public Engine getEngine() {
        return engine;
    }

    public TyreType getTyreType() {
        return tyreType;
    }

    public double getPrice() {
        return price;
    }

    public String getColour() {
        return colour;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public Damage getDamage() {
        return damage;
    }

    public void modifyPrice(Double modifier){
        this.setPrice(price * modifier);
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public double getRepairedPrice() {
        return repairedPrice;
    }

    public void setRepairedPrice(double repairedPrice) {
        this.repairedPrice = repairedPrice;
    }

    public void setDamage(Damage damage) {
        this.damage = damage;
    }
}
