public class Vehicle {

    Engine engine;
    TyreType tyreType;
    private double price;
    private String colour;
    private String make;
    private String model;

    public Vehicle(Engine engine, TyreType tyreType, double price, String colour, String make, String model) {
        this.engine = engine;
        this.tyreType = tyreType;
        this.price = price;
        this.colour = colour;
        this.make = make;
        this.model = model;
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
}
