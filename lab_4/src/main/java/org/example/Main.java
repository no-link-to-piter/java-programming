package org.example;

import enums.LocationStates;
import enums.MindStates;
import enums.SoundStates;
import exceptions.AmountException;
import exceptions.PropertyQuantityException;
import item.Bun;
import item.Pistol;
import person.Baby;
import person.Carlson;
import person.HouseResident;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Carlson carlson = new Carlson("Карлсон", LocationStates.ROOF, MindStates.CALM);
        Baby baby = new Baby("Малыш", LocationStates.ROOF, MindStates.CALM);

        int amountResidents = 6;
        HouseResident[] residents = new HouseResident[amountResidents];
        for(int i = 0; i < amountResidents; i++) {
            int residentNumber = i + 1;
            residents[i] = new HouseResident("Жилец " + residentNumber, LocationStates.FLAT, MindStates.CALM);
        }

        try {
            carlson.setPistol(new Pistol(1));
            carlson.setBun(new Bun(2));

            // Карлсон использует пистолет и ликует
            carlson.loadPistol(10);
            carlson.usePistol();
            carlson.changeMind(MindStates.EXULTANT);

            // Жильцы реагируют
            for(HouseResident resident : residents) {
                resident.expressEmotions();
            }

            // Кто-то Хочет вызвать полицию
            residents[new Random().nextInt(residents.length)].say(SoundStates.SAY_CALL_POLICE);

            // Малыш начинает злиться
            baby.changeMind(MindStates.ANGRY);

            // Карлсон становится спокойным и съедает булочку
            carlson.changeMind(MindStates.CALM);
            carlson.eatBun();

            // Карлсон поет
            carlson.say(SoundStates.SING_SONG);
        } catch (AmountException e) {
            e.printStackTrace();
        }
    }
}