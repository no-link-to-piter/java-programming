package person;

import enums.LocationStates;
import enums.MindStates;
import enums.NatureStates;
import enums.SoundStates;
import interfaces.MindAction;
import interfaces.SoundAction;
import story.AlongTheStory;

public abstract class Person implements MindAction, SoundAction {
    private final String name;
    private AlongTheStory.Place place;
    private MindStates mind;

    private NatureStates nature;

    public Person(String name, AlongTheStory.Place place, MindStates mind, NatureStates nature) {
        this.name = name;
        this.place = place;
        this.mind = mind == null ? MindStates.CALM : mind;
        this.nature = nature == null ? NatureStates.NORMAL : nature;
    }

    public Person(String name, AlongTheStory.Place place, MindStates mind) {
        this.name = name;
        this.place = place;
        this.mind = mind == null ? MindStates.CALM : mind;
        this.nature = NatureStates.NORMAL;
    }

    public String getName() {
        return this.name;
    }

    public AlongTheStory.Place getPlace() {
        return this.place;
    }

    public void setPlace(AlongTheStory.Place place) {
        this.place = place;
    }

    public MindStates getMind() {
        return this.mind;
    }

    public void setMind(MindStates mind) {
        this.mind = mind;
    }

    public void setNature(NatureStates nature) {
        this.nature = nature;
    }

    public NatureStates getNature() {
        return nature;
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

