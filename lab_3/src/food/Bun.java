package food;

public class Bun extends Food{

    public Bun(int amount) {
        super(amount);
    }

    @Override
    public void eat(String name) {
        int currentAmount = this.getAmount();
        this.setAmount(currentAmount - 1);
        System.out.println(name + " съедает булочку");
    }
}
