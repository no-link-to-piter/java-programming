package pokemon;

import move.*;
import ru.ifmo.se.pokemon.*;

public class Milotic extends Feebas{
    public Milotic(String name, int level) {
        super(name, level);
        setStats(95, 60, 79, 100, 125, 81);
        setType(Type.WATER);
        setMove(new Rest(), new DoubleTeam(), new Swagger(), new Twister());
    }
}