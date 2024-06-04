package State;

public class StateOff extends State{

    @Override
    public void handlePress(Flashlight f) {
        f.turnOn();
        f.setBrightness(1);
        f.setCurrentState(new StateLow());
    }

    @Override
    public void handleHold(Flashlight f) {

    }
}
