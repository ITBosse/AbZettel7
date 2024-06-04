package State;

public class StateHigh2 extends State{
    @Override
    public void handlePress(Flashlight f) {
        f.turnOff();
        f.setCurrentState(new StateOff());
    }

    @Override
    public void handleHold(Flashlight f) {
        f.setBrightness(1);
        f.setCurrentState(new StateLow());
    }
}
