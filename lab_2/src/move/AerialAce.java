package move;

import ru.ifmo.se.pokemon.*;

public class AerialAce extends PhysicalMove {
    public AerialAce() {
        super(Type.FLYING, 60, Double.POSITIVE_INFINITY);
    }

    @Override
    protected String describe() {
        return "Игнорирует изменения характеристик точности и уклонения. Однако он не поразит покемонов во время неуязвимой стадии Bounce, Dig, Dive, Fly, Shadow Force или Sky Drop.";
    }
}
