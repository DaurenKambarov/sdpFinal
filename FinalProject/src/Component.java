
public abstract class Component {
    protected String type;

    public Component(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public abstract void makeSound();
}
