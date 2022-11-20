package move;

import ru.ifmo.se.pokemon.*;


public class HeartStamp extends PhysicalMove {
    public HeartStamp() {
        super(Type.PSYCHIC, 60, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        if (Math.random() <= 0.3) Effect.flinch(p);
    }
    @Override
    protected String describe(){
        return "Имеет 30% вероятность заставить цель дрогнуть";
    }
}

