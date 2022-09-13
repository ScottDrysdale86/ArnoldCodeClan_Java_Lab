import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Dealership dealership;
    Customer customer;
    Vehicle vehicle;
    Vehicle damagedVehicle;
    Engine engine;
    TyreType tyreType;

    @Before
    public void setUp(){
        dealership = new Dealership(100);
        customer = new Customer("John", 10);
        engine = new Engine(2);
        tyreType = new TyreType("Pirelli", 17);
        vehicle = new Vehicle(engine,tyreType,6, "Red", "Vauxhall", "Corsa" , VehicleType.CAR, Damage.NONE);
        damagedVehicle = new Vehicle(engine,tyreType,6, "Red", "Vauxhall", "Corsa" , VehicleType.CAR, Damage.MAJOR);

    }

    @Test
    public void canBuy(){
        dealership.buy(vehicle);
        assertEquals(1, dealership.getAllVehiclesCount());
        assertEquals(94, dealership.getTill(),0.0);
        assertEquals(7.2, vehicle.getPrice(), 0.1);
    }

    @Test
    public void canSell()
    {
        dealership.buy(vehicle);
        dealership.sell(vehicle, customer);
        assertEquals(0, dealership.getAllVehiclesCount());
        assertEquals(1, customer.getOwnedVehiclesCount());
        assertEquals(2.8, customer.getWallet(), 0.1);
        assertEquals(101.2, dealership.getTill(),0.1);
    }

    @Test
    public void canSellDamagedVehicle()
    {
        dealership.buy(damagedVehicle);
        dealership.sell(damagedVehicle, customer);
        assertEquals(0, dealership.getAllVehiclesCount());
        assertEquals(1, customer.getOwnedVehiclesCount());
        assertEquals(4.17, customer.getWallet(), 0.1);
        assertEquals(100.43, dealership.getTill(),0.1);
    }
    @Test
    public void canRepairVehicle(){
        dealership.buy(damagedVehicle);
        dealership.repair(damagedVehicle);
        assertEquals(6, damagedVehicle.getPrice(),0.1);
        assertEquals(Damage.NONE, vehicle.getDamage());
    }



}
