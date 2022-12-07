package exceptions;

import enums.MindStates;

public class MindException extends RuntimeException{
    public MindException(MindStates mind) {
        super("Нельзя установить такое состояние психики " + mind);
    }
}
