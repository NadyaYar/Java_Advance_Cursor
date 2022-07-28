package HW1.task2;

public class IncrementSubscriber extends Subscriber {

    @Override
    public void processData(int data) {
        new Thread(() -> {
            try {
                Thread.sleep((long) (Math.floor(Math.random() * 9_000) + 1_000));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("IncrementSubscriber received data and increment it: " + (data + 1));
        }).start();
    }
}
