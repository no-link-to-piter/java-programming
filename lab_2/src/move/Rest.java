package move;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class Rest extends StatusMove {
    public Rest() {
        super(Type.PSYCHIC, 0, 100);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        p.restore();
        Effect eff = new Effect().turns(2);
        eff.sleep(p);
    }

    @Override
    protected String describe() {
        return "Пользователь спит на 2 хода, но полностью исцеляется";
    }
}
