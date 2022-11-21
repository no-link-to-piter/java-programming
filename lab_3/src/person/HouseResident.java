package person;

import enums.LocationStates;
import enums.MindStates;
import enums.SoundStates;

import java.util.Random;

public class HouseResident extends Person{
    public HouseResident(String name, LocationStates location) {
        super(name, location);
    }

    public void expressEmotions() {
        MindStates[] mindArray = new MindStates[]{MindStates.GRUMPY, MindStates.SCARED};
        int mindRandom = new Random().nextInt(mindArray.length);
        this.changeMind(mindArray[mindRandom]);
    }

    public void say() {
        String residentName = this.getName();
        makeSound(residentName, SoundStates.SAY_CALL_POLICE);
    }
}
