package interfaces;

import enums.SoundStates;

public interface SoundAction {
    default void makeSound(String name, SoundStates sound) {
        if (sound == SoundStates.SAY_CALL_POLICE) {
            System.out.println(name + " говорит, что нужно вызвать полицию");
        } else if (sound == SoundStates.GUNSHOT_SOUND) {
            System.out.println(name + " Выстреливает. Резкий звук прокатывается по крышам и замерает");
        }
    }
}
