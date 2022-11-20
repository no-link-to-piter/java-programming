package move;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class DefenseCurl extends StatusMove {
    public DefenseCurl(){
        super(Type.NORMAL, 0, 100);
    }
    @Override
    protected void applySelfEffects(Pokemon p){
        p.setMod(Stat.DEFENSE, 1);
    }
    @Override
    protected String describe(){
        return "Повышает защиту на одну ступень";
    }
}