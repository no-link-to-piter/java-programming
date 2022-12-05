package person;

import enums.LocationStates;
import enums.MindStates;
import story.AlongTheStory;

import java.util.Objects;
import java.util.Random;

public class HouseResident extends Person {
    public HouseResident(String name, AlongTheStory.Place location, MindStates mind) {
        super(name, location, mind);
    }

    @Override
    public String toString() {
        String name = this.getName();
        LocationStates location = this.getPlace().getLocation();
        MindStates mind = this.getMind();
        return "Carlson{" +
                "name=" + name +
                "location=" + location +
                "mind=" + mind + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || o.getClass() != this.getClass()) return false;
        HouseResident that = (HouseResident) o;
        return (this.getName()).equals(that.getName())
                && (this.getPlace()).equals(that.getPlace())
                && (this.getMind()).equals(that.getMind());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getName(), this.getPlace(), this.getMind());
    }

    public void expressEmotions() {
        MindStates[] mindArray = new MindStates[]{MindStates.GRUMPY, MindStates.SCARED};
        int mindRandom = new Random().nextInt(mindArray.length);
        this.changeMind(mindArray[mindRandom]);
    }
}