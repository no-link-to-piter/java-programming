package person;

import enums.LocationStates;
import enums.MindStates;
import food.Bun;
import gun.Pistol;

public class Baby extends Person{

    public Baby(String name, LocationStates location) {
        super(name, location);
    }

    @Override
    public String toString() {
        String name = this.getName();
        LocationStates location = this.getLocation();
        MindStates mind = this.getMind();
        return "Carlson{" +
                "name=" + name +
                "location=" + location +
                "mind=" + mind + "}";
    }


}
