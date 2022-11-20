package move;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class Twister extends SpecialMove {
    public Twister() {
        super(Type.DRAGON, 40, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() <= 0.3) Effect.flinch(p);
    }

    @Override
    protected String describe() {
        return "имеет 30% вероятность заставить цель дрогнуть";
    }
}
