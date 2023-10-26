package seminars.second.hw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {
    Car car;
    Motorcycle motorcycle;
    @BeforeEach
    void setUp() {
        car = new Car("Dodge", "Ram", 2010);
        motorcycle = new Motorcycle("Honda", "EM1", 2010);
    }


    @Test
    public void testCarIsInstanceOfVehicle() {
        assertTrue(car instanceof Vehicle);
    }

    @Test
    public void testCarHasFourWheels() {
        assertEquals(car.getNumWheels(),4);
    }

    @Test
    public void testMotorcycleHasFourWheels() {
        assertEquals(motorcycle.getNumWheels(),2);
    }

    @Test
    public void testCarTestDriveSpeed() {
        car.testDrive();
        assertEquals(car.getSpeed(),60);
    }

    @Test
    public void testMotorcycleTestDriveSpeed() {
        motorcycle.testDrive();
        assertEquals(motorcycle.getSpeed(),75);
    }

    @Test
    public void testCarParkingSpeed() {
        car.testDrive();
        car.park();
        assertEquals(car.getSpeed(),0);
    }

    @Test
    public void testMotorcycleParkingSpeed() {
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(motorcycle.getSpeed(),0);
    }


}