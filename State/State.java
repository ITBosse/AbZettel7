package State;

public abstract class State {
    public abstract void handlePress(Flashlight f);
    public abstract void handleHold(Flashlight f);
}
