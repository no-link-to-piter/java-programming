package org.example;

import enums.*;
import exceptions.AmountException;
import interfaces.OneTimeCharacterAction;
import item.Bun;
import item.Pistol;
import person.Baby;
import person.Carlson;
import person.HouseResident;
import story.AlongTheStory;

import java.util.HashMap;
import java.util.Random;

public class Main {

    public static void thirdPartyInfoHandler(AlongTheStory.ThirdPartyPerson p) {
        class DetailsHandler {
            void displayDetails() {
                String name = p.getName();
                LocationStates nextLocation = p.getNextLocation();
                NatureStates nature = p.getNature();
                if (nature != NatureStates.NORMAL) {
                    System.out.println(name + " имеет тяжелый характер");
                }
                if (nextLocation == LocationStates.WHITE_STEAMER) {
                    System.out.println(name + " будет на белом параходе");
                } else if (nextLocation == LocationStates.FLAT) {
                    System.out.println(name + " будет дома");
                } else if (nextLocation == LocationStates.SOMEWHERE) {
                    System.out.println(name + " будет где-то");
                }
            }
        }
        (new DetailsHandler()).displayDetails();
    }

    public static void main(String[] args) {

        AlongTheStory alongTheStory = new AlongTheStory("История малыша");

        HashMap<String, LocationStates> newCharacters = new HashMap<String, LocationStates>();

        AlongTheStory.Place flat = alongTheStory.new Place(LocationStates.FLAT);
        AlongTheStory.Place roof = alongTheStory.new Place(LocationStates.ROOF);
        AlongTheStory.Place behindTheScene = alongTheStory.new Place(LocationStates.BEHIND_THE_SCENE);

        Carlson carlson = new Carlson("Карлсон", roof, MindStates.CALM);
        Baby baby = new Baby("Малыш", roof, MindStates.CALM);

        AlongTheStory.ThirdPartyPerson mother = new AlongTheStory.ThirdPartyPerson("Мама", behindTheScene,
                MindStates.CALM, RelativeStates.MOTHER, LocationStates.WHITE_STEAMER);

        AlongTheStory.ThirdPartyPerson father = new AlongTheStory.ThirdPartyPerson("Папа", behindTheScene,
                MindStates.CALM, RelativeStates.FATHER, LocationStates.WHITE_STEAMER);

        AlongTheStory.ThirdPartyPerson uncle = new AlongTheStory.ThirdPartyPerson("Дядя Юлиус", behindTheScene,
                MindStates.CALM, RelativeStates.UNCLE, LocationStates.FLAT, NatureStates.HARD);

        AlongTheStory.ThirdPartyPerson friendBosse = new AlongTheStory.ThirdPartyPerson("Боссе", behindTheScene,
                MindStates.CALM, RelativeStates.NON_RELATIVE, LocationStates.SOMEWHERE);

        AlongTheStory.ThirdPartyPerson friendBetan = new AlongTheStory.ThirdPartyPerson("Бетан", behindTheScene,
                MindStates.CALM, RelativeStates.NON_RELATIVE, LocationStates.SOMEWHERE);

        int amountResidents = 6;
        HouseResident[] residents = new HouseResident[amountResidents];
        for(int i = 0; i < amountResidents; i++) {
            int residentNumber = i + 1;
            residents[i] = new HouseResident("Жилец " + residentNumber, flat, MindStates.CALM);
        }

        System.out.println("Малыш начинает рассказывать новости: ");

        Main.thirdPartyInfoHandler(mother);
        Main.thirdPartyInfoHandler(father);
        Main.thirdPartyInfoHandler(uncle);
        Main.thirdPartyInfoHandler(friendBosse);
        Main.thirdPartyInfoHandler(friendBetan);

        OneTimeCharacterAction character = new OneTimeCharacterAction() {
            @Override
            public void displayAction(String name, LocationStates location, String action) {
                newCharacters.put(name, location);
                System.out.println(name + " " + action);
            }
        };
        character.displayAction("Фрекенбок", LocationStates.FLAT, "приедет и будет следить за Малышом пока родителей не будет");

        try {
            carlson.setPistol(new Pistol(1));
            carlson.setBun(new Bun(2));

            // Карлсон использует пистолет и ликует
            carlson.loadPistol(10);

            // Первый выстрел
            carlson.usePistol();
            baby.changeMind(MindStates.SCARED);
            for(HouseResident resident : residents) {
                resident.expressEmotions();
            }

            // Второй выстрел
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