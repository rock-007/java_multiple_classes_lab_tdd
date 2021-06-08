import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    Bus bus;
    Person person;
    BusStop busStop;

    @Before
    public void before() {
        bus = new Bus("Pilton", 30);
        person = new Person();
        busStop = new BusStop("Pilton Bus Stop");

    }

    @Test
    public void addPassengers() {
        busStop.addPassengers(person);
        busStop.addPassengers(person);
        busStop.addPassengers(person);
        assertEquals(3, busStop.getPassengers());
    }

    @Test
    public void removePassenger() {
        busStop.addPassengers(person);
        busStop.addPassengers(person);
        busStop.addPassengers(person);
        busStop.removePassenger();
        assertEquals(2, busStop.getPassengers());

    }

    @Test
    public void canAddPassengerToBus(){
        busStop.addPassengers(person);
        busStop.addPassengers(person);
        busStop.addPassengers(person);
        busStop.addPassengerToBus(bus, person);
        assertEquals(1, bus.getPassengerAmount());
        assertEquals(2, busStop.getPassengers());

    }

}
