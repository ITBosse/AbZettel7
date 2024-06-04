package State;

public class StateHigh extends State{

    @Override
    public void handlePress(Flashlight f) {
        f.turnOff();
        f.setCurrentState(new StateOff());
    }

    @Override
    public void handleHold(Flashlight f) {
        f.setBrightness(3);
        f.setCurrentState(new StateHigh2());
    }
}
