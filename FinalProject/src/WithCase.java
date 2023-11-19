public class WithCase extends Decorator{
    public WithCase(Component wrappee) {
        super(wrappee);
    }

    @Override
    public void makeSound() {
        wrappee.makeSound();
        System.out.println("Case muffles the sound.");
    }

}
