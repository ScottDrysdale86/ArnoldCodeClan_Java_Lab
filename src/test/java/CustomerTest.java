import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    Vehicle vehicle;
    Engine engine;
    TyreType tyreType;

    @Before
    public void setUp(){
        customer = new Customer("John", 40);
        engine = new Engine(2);
        tyreType = new TyreType("Pirelli", 17);
        vehicle = new Vehicle(engine,tyreType,6, "Red", "Vauxhall", "Corsa" , VehicleType.CAR, Damage.NONE);

    }

    @Test
    public void canBuy(){
        customer.buy(vehicle);
        assertEquals(1, customer.getOwnedVehiclesCount());
        assertEquals(34.0, customer.getWallet(),0.0);
    }
}
