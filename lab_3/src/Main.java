import enums.LocationStates;
import enums.MindStates;
import food.Bun;
import gun.Pistol;
import person.Baby;
import person.Carlson;
import person.HouseResident;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Carlson carlson = new Carlson("Карлсон", LocationStates.ROOF);
        Baby baby = new Baby("Малыш", LocationStates.ROOF);

        int amountResidents = 6;
        HouseResident[] residents = new HouseResident[amountResidents];
        for(int i = 0; i < amountResidents; i++) {
            int residentNumber = i + 1;
            residents[i] = new HouseResident("Жилец " + residentNumber, LocationStates.FLAT);
        }

        Pistol pistol = new Pistol(10);
        Bun bun = new Bun(2);

        carlson.setPistol(pistol);
        carlson.setBun(bun);

        // Карлсон использует пистолет и ликует
        carlson.usePistol();
        carlson.changeMind(MindStates.EXULTANT);

        // Жильцы реагируют
        for(HouseResident resident : residents) {
            resident.expressEmotions();
        }

        // Кто-то Хочет вызвать полицию
        residents[new Random().nextInt(residents.length)].say();

        // Малыш начинает злиться
        baby.changeMind(MindStates.ANGRY);

        // Карлсон съедает становится спокойным и съедает булочку
        carlson.changeMind(MindStates.CALM);
        carlson.eatBun();
    }
}