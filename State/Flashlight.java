package State;

public class Flashlight {
    private State currentState;

    public EnumState getCurrentEnumState() {
        return currentEnumState;
    }

    public void setCurrentEnumState(EnumState currentEnumState) {
        this.currentEnumState = currentEnumState;
    }

    private EnumState currentEnumState;

    public Flashlight() {
        this.currentState = new StateOff();
        this.currentEnumState = EnumState.Off;
    }

    public State getCurrentState() {
        return currentState;
    }
    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public void press() {
        currentState.handlePress(this);
        currentEnumState.handlePress(this);
    }
    public void hold() {
        currentState.handleHold(this);
        currentEnumState.handleHold(this);
    }

    // # = protected = nur aus selbem Package verwendbar
    protected void turnOn() {
        System.out.println("Lamp turned on.");
    }
    protected void turnOff() {
        System.out.println("Lamp turned off.");
    }
    protected void setBrightness(int brightness) {
        System.out.println("Brightness is " + brightness + ".");
    }
}
