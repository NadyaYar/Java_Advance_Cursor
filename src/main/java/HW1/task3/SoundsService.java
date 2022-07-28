package HW1.task3;

import HW1.task3.generators.SoundGenerator;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SoundsService {

    public static volatile List<String> sounds = new CopyOnWriteArrayList<>();

    public void addNewSound(SoundGenerator generator) {
        generator.generateAndAddSound();
    }

    public void printSounds() {
        for (String sound : sounds) {
            System.out.println(sound);
        }
    }
}
