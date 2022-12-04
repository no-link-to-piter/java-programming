package interfaces;

import enums.SoundStates;
import person.Person;

public interface SoundAction {
    default void makeSound(Person p, SoundStates sound) {
        String name = p.getName();
        if (sound == SoundStates.SAY_CALL_POLICE) {
            System.out.println(name + " говорит, что нужно вызвать полицию");
        } else if (sound == SoundStates.GUNSHOT_SOUND) {
            System.out.println(name + " Выстреливает. Резкий звук прокатывается по крышам и замерает");
        } else if (sound == SoundStates.SING_SONG) {
            System.out.println(name + " Начинает песть песенку: пусть все кругом Горит огнем, А мы с тобой споем: Ути, боссе, буссе, бассе, Биссе, и отдохнем. \n" +
                    "Пусть двести булочек несут На день рожденья к нам, А мы с тобой устроим тут Ути, боссе, буссе, капут, Биссе и тарарам.");
        }
    }
}
