package person;

import enums.LocationStates;
import enums.MindStates;

import java.util.Objects;

public class Baby extends Person{

    public Baby(String name, LocationStates location, MindStates mind) {
        super(name, location, mind);
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
        if (o == null || o.getClass() != this.getClass()) return false;
        Baby that = (Baby) o;
        return (this.getName()).equals(that.getName())
                && (this.getLocation()).equals(that.getLocation())
                && (this.getMind()).equals(that.getMind());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getName(), this.getLocation(), this.getMind());
    }

}
