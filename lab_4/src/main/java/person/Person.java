package person;

import enums.LocationStates;
import enums.MindStates;
import enums.SoundStates;
import interfaces.MindAction;
import interfaces.SoundAction;

public abstract class Person implements MindAction, SoundAction {
    private final String name;
    private LocationStates location;
    private MindStates mind;

    public Person(String name, LocationStates location, MindStates mind) {
        this.name = name;
        this.location = location == null ? LocationStates.DEFAULT : location;
        this.mind = mind == null ? MindStates.CALM : mind;
    }

    public String getName() {
        return this.name;
    }

    public LocationStates getLocation() {
        return this.location;
    }

    public void setLocation(LocationStates location) {
        this.location = location;
    }

    public MindStates getMind() {
        return this.mind;
    }

    public void setMind(MindStates mind) {
        this.mind = mind;
    }

    @Override
    public void changeMind(MindStates state) {
        MindStates prevMind = this.getMind();
        setMind(state);
        String personName = this.getName();
        if (state == MindStates.ANGRY) {
            System.out.println(personName +
                    (prevMind != MindStates.ANGRY ? " начинает злиться" : " остается злым"));
        } else if (state == MindStates.GRUMPY) {
            System.out.println(personName +
                    (prevMind != MindStates.GRUMPY ? " начинает сердиться" : " остается сердитым"));
        } else if (state == MindStates.EXULTANT) {
            System.out.println(personName +
                    (prevMind != MindStates.EXULTANT ? " начинает ликовать" : " остается ликующим"));
        } else if (state == MindStates.CALM) {
            System.out.println(personName +
                    (prevMind != MindStates.CALM ? " успокаивается" : " остается спокойным"));
        } else if (state == MindStates.SCARED) {
            System.out.println(personName +
                    (prevMind != MindStates.SCARED ? " пугается" : " остается испуганным"));
        }
    }

    public void say(SoundStates sound) {
        makeSound(this, sound);
    }
}

