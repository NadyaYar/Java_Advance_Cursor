package HW1.task2;

public class Main {
    public static void main(String[] args) {
        Producer producer = new Producer(new Subscriber(), new Subscriber(), new IncrementSubscriber());

        producer.notifySubscribers(1);
    }
}
