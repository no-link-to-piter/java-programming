package story;

import enums.LocationStates;
import enums.MindStates;
import enums.NatureStates;
import enums.RelativeStates;
import item.Bun;
import item.Pistol;
import person.Person;

import java.util.Objects;

public class AlongTheStory {

    public static class ThirdPartyPerson extends Person {

        private RelativeStates relativeType;
        private LocationStates nextLocation;

        public ThirdPartyPerson(String name, Place place, MindStates mind, RelativeStates relativeType,
                                LocationStates nextLocation) {
            super(name, place, mind);
            this.relativeType = relativeType;
            this.nextLocation = nextLocation;
        }

        public ThirdPartyPerson(String name, Place place, MindStates mind, RelativeStates relativeType,
                                LocationStates nextLocation, NatureStates nature) {
            super(name, place, mind, nature);
            this.relativeType = relativeType;
            this.nextLocation = nextLocation;
        }

        public void setRelativeType(RelativeStates relativeType) {
            this.relativeType = relativeType;
        }

        public RelativeStates getRelativeType() {
            return this.relativeType;
        }

        public void setNextLocation(LocationStates nextLocation) {
            this.nextLocation = nextLocation;
        }

        public LocationStates getNextLocation() {
            return this.nextLocation;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || o.getClass() != this.getClass()) return false;
            ThirdPartyPerson that = (ThirdPartyPerson) o;
            return (this.getName()).equals(that.getName())
                    && (this.getPlace()).equals(that.getPlace())
                    && (this.getMind()).equals(that.getMind())
                    && this.getNextLocation().equals(that.getNextLocation())
                    && this.getRelativeType().equals(that.getRelativeType())
                    && this.getNature().equals(that.getNature());
        }


        @Override
        public String toString() {
            return "Carlson{" +
                    "name=" + this.getName() +
                    "place=" + this.getPlace().toString() +
                    "mind=" + this.getMind() +
                    "nature=" + this.getNature() +
                    "relativeType=" + this.getRelativeType() +
                    "nextLocation=" + this.getNextLocation() + "}";
        }

        @Override
        public int hashCode() {
            return Objects.hash(this.getName(), this.getPlace(), this.getMind(), this.getNature(),
                    this.getNextLocation(), this.getRelativeType());
        }
    }

    public class Place {

        private LocationStates location;

        public Place(LocationStates location){
            this.location = location == null ? LocationStates.BEHIND_THE_SCENE : location;
        }

        public LocationStates getLocation() {
            return this.location;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || o.getClass() != this.getClass()) return false;
            Place that = (Place) o;
            return (this.getLocation()).equals(that.getLocation());
        }


        @Override
        public String toString() {
            LocationStates location = this.getLocation();
            return "Place{" +
                    "location=" + location +"}";
        }

        @Override
        public int hashCode() {
            return Objects.hash(this.getLocation());
        }
    }
}
