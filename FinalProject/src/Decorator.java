public abstract class Decorator extends Component {
    protected Component wrappee;

    public Decorator(Component wrappee) {
        super(wrappee.getType() + "Decorator");
        this.wrappee = wrappee;
    }
}