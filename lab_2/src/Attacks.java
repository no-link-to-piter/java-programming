import ru.ifmo.se.pokemon.*;


class SweetKiss extends StatusMove{
    public SweetKiss(){
        super(Type.FAIRY, 0, 75);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        p.confuse();
    }
    @Override
    protected String describe(){
        return "Приводит цель в замешательство";
    }
}

class TakeDown extends PhysicalMove{
    public TakeDown(){
        super(Type.NORMAL, 90, 85);
    }
    @Override
    protected void applySelfDamage(Pokemon pokemon, double damage) {
        pokemon.setMod(Stat.HP, (int)(damage / 4));
    }

    @Override
    protected String describe(){
        return "Наносит урон, но пользователь получает 1/4 нанесенного урона в виде отдачи";
    }
}

class Splash extends StatusMove {
    public Splash() {
        super(Type.NORMAL, 0, 100);
    }
    @Override
    protected String describe(){
        return "Ничего не делает";
    }
}

class HeartStamp extends PhysicalMove {
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

class Rest extends StatusMove {
    public Rest(){
        super(Type.PSYCHIC, 0, 100);
    }
    @Override
    protected void applySelfEffects(Pokemon p) {
        p.restore();
        Effect eff = new Effect().turns(2);
        eff.sleep(p);
    }
    @Override
    protected String describe(){
        return "Пользователь спит на 2 хода, но полностью исцеляется";
    }
}

class DoubleTeam extends StatusMove {
    public DoubleTeam(){
        super(Type.NORMAL, 0, 100);
    }
    @Override
    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.EVASION, 1);
    }
    @Override
    protected String describe(){
        return "Повышает уклонение на одну ступень";
    }
}

class Swagger extends StatusMove {
    public Swagger(){
        super(Type.NORMAL, 0, 85);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        p.confuse();
        p.setMod(Stat.ATTACK, 2);
    }
    @Override
    protected String describe(){
        return "Путает цель и повышает её атаку на две ступени";
    }
}

class Twister extends SpecialMove{
    public Twister(){
        super(Type.DRAGON, 40, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        if (Math.random() <= 0.3) Effect.flinch(p);
    }
    @Override
    protected String describe(){
        return "имеет 30% вероятность заставить цель дрогнуть";
    }
}

class AerialAce extends PhysicalMove{
    public AerialAce(){
        super(Type.FLYING, 60, Double.POSITIVE_INFINITY);
    }

    @Override
    protected String describe(){
        return "Игнорирует изменения характеристик точности и уклонения. Однако он не поразит покемонов во время неуязвимой стадии Bounce, Dig, Dive, Fly, Shadow Force или Sky Drop.";
    }
}

class DefenseCurl extends StatusMove{
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

class ThunderWave extends StatusMove{
    public ThunderWave(){
        super(Type.ELECTRIC, 0, 90);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        Effect.paralyze(p);
    }
    @Override
    protected String describe(){
        return "Парализует противника";
    }
}