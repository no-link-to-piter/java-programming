package exceptions;

public class PropertyQuantityException extends RuntimeException{
    private int quantity;

    public int getModifiedQuantity() {
        return this.quantity;
    }

    public PropertyQuantityException(int quantity) {
        super("Нельзя установить такое количество: " + quantity);
        this.quantity = 1;
    }
}
