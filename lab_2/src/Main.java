import ru.ifmo.se.pokemon.*;
import pokemon.*;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();

        Pokemon luvdisc = new Luvdisc("first poke", 1);
        Pokemon porygon2 = new Porygon2("second poke", 1);
        Pokemon milotic = new Milotic("third poke", 1);

        Pokemon porygon = new Porygon("fourth poke", 1);
        Pokemon feebas = new Feebas("fifth poke", 1);
        Pokemon porygonz = new PorygonZ("sixth poke", 1);

        b.addAlly(luvdisc);
        b.addAlly(porygon2);
        b.addAlly(milotic);

        b.addFoe(porygon);
        b.addFoe(feebas);
        b.addFoe(porygonz);

        b.go();
    }
}
