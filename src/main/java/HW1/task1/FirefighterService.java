package HW1.task1;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class FirefighterService {
    ThreadPoolExecutor executor;

    public FirefighterService(int firefightersCount, int firefightersInWork) {
        this.executor = new ThreadPoolExecutor(firefightersInWork,
                firefightersCount,
                0,
                TimeUnit.SECONDS,
                new LinkedBlockingQueue<>());
    }

    public void callFirefighters(String location) {
        executor.execute(() -> {
            try {
                System.out.println("Firefighters are called to " + location);
                Thread.sleep((long) (Math.floor(Math.random() * 9_000) + 1_000));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Firefighters are arrived to " + location);
        });
    }
}
