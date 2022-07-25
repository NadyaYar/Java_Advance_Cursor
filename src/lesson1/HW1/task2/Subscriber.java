package lesson1.HW1.task2;

public class Subscriber {
    public void processData(int data) {
        new Thread(() -> {
            try {
                Thread.sleep((long) (Math.floor(Math.random() * 9_000) + 1_000));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("Subscriber received data: " + data);
        }).start();
    }
}
