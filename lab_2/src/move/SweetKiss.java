package move;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class SweetKiss extends StatusMove {
    public SweetKiss() {
        super(Type.FAIRY, 0, 75);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        p.confuse();
    }

    @Override
    protected String describe() {
        return "Приводит цель в замешательство";
    }
}
