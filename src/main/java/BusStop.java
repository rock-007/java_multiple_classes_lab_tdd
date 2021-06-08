import java.util.ArrayList;

public class BusStop {
    private String name;
    private ArrayList<Person> queues;

    public BusStop(String name) {
        this.name = name;
        this.queues = new ArrayList<>();
    }

    public void addPassengers(Person person) {
        this.queues.add(person);
    }

    public int getPassengers() {
        return this.queues.size();
    }

    public void removePassenger() {
        if (this.queues.size() > 0) {
            this.queues.remove(0);

        }
    }

    public void addPassengerToBus(Bus bus, Person person) {
        bus.addPassenger(person);
        this.removePassenger();
    }
}
