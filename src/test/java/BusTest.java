import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    Bus bus;
    Person person;

    @Before
    public void before() {
        bus = new Bus("Pilton", 30);
        person = new Person();

    }

    @Test
    public void hasDestination() {
        assertEquals("Pilton", bus.getDestination());
    }

    @Test
    public void hasCapacity() {
        assertEquals(30, bus.getCapacity());
    }

    @Test
    public void canAddPassenger() {
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        assertEquals(5, bus.getPassengerAmount());

    }

    @Test
    public void cannotAddPassenger() {
        Bus fullBus = new Bus("Morningside", 4);
        fullBus.addPassenger(person);
        fullBus.addPassenger(person);
        fullBus.addPassenger(person);
        fullBus.addPassenger(person);
        fullBus.addPassenger(person);
        assertEquals(4, fullBus.getPassengerAmount());
    }

    @Test
    public void removePassenger() {
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.removePassenger();
        assertEquals(3, bus.getPassengerAmount());


    }

}
