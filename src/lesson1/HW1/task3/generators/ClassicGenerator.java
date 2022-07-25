package lesson1.HW1.task3.generators;

import lesson1.HW1.task3.SoundsService;

import java.nio.charset.StandardCharsets;
import java.util.Random;

public class ClassicGenerator implements SoundGenerator {

    @Override
    public void generateAndAddSound() {
        new Thread(() -> {
            StringBuilder sound = new StringBuilder("Classic ");

            String generatedString;
            do {
                byte[] array = new byte[7];
                new Random().nextBytes(array);
                generatedString = sound + new String(array, StandardCharsets.UTF_8);
            } while (SoundsService.sounds.contains(generatedString));

            sound.append(generatedString);

            SoundsService.sounds.add(generatedString);
        }).start();
    }
}
