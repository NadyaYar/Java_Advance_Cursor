package HW1.task1;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        FirefighterService service = new FirefighterService(10, 3);

        service.callFirefighters("London");
        Thread.sleep(1000);
        service.callFirefighters("Paris");
        Thread.sleep(1000);
        service.callFirefighters("Berlin");
    }
}
