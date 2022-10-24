import ru.ifmo.se.pokemon.*;

public class Luvdisc extends Pokemon{
    public Luvdisc(String name, int level) {
        super(name, level);
        setStats(43, 30, 55, 40, 65, 97);
        setType(Type.WATER);
        setMove(new SweetKiss(), new TakeDown(), new Splash(), new HeartStamp());
    }
}
