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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Baby)) return false;
        Baby that = (Baby) o;
        return (this.getName()).equals(that.getName())
                && (this.getLocation()).equals(that.getLocation())
                && (this.getMind()).equals(that.getMind());
    }


}
