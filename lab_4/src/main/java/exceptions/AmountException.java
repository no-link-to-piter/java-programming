package exceptions;

public class AmountException extends Exception {
    public AmountException(int amount){
        super("Количество не может быть нулевым" + amount);
    }
}
