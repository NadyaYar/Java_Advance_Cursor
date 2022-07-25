package lesson1.HW1.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Producer {
    private final List<Subscriber> subscribers = new ArrayList<>();

    public Producer(Subscriber... subscribers) {
        this.subscribers.addAll(Arrays.asList(subscribers));
    }

    public void notifySubscribers(int data) {
        for (Subscriber subscriber : subscribers) {
            subscriber.processData(data);
        }
    }
}
