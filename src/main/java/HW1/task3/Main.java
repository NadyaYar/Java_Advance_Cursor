package HW1.task3;

import HW1.task3.generators.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        SoundsService soundsService = new SoundsService();

        soundsService.addNewSound(new RockGenerator());
        soundsService.addNewSound(new ClassicGenerator());
        soundsService.addNewSound(new PopGenerator());
        soundsService.addNewSound(new MetalGenerator());
        soundsService.addNewSound(new CountryGenerator());

        Thread.sleep(1000);
        soundsService.printSounds();
    }
}
