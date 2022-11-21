package person;

import enums.LocationStates;
import enums.MindStates;
import interfaces.MindAction;
import interfaces.SoundAction;

public abstract class Person implements MindAction, SoundAction {
    private String name;
    private LocationStates location;
    private MindStates mind;

    public Person(String name, LocationStates location) {
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public void changeMind(MindStates state) {
        this.mind = state;
        String personName = this.getName();
        if (state == MindStates.ANGRY) {
            System.out.println(personName + " злится");
        } else if (state == MindStates.GRUMPY) {
            System.out.println(personName + " сердится");
        } else if (state == MindStates.EXULTANT) {
            System.out.println(personName + " ликует");
        } else if (state == MindStates.CALM) {
            System.out.println(personName + " спокоен");
        } else if (state == MindStates.SCARED) {
            System.out.println(name + " испугался");
        }
    }
}

