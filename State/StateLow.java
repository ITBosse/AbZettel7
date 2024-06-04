package State;

public class StateLow extends State {

    @Override
    public void handlePress(Flashlight f) {
        f.turnOff();
        f.setCurrentState(new StateOff());
    }

    @Override
    public void handleHold(Flashlight f) {
        f.setBrightness(2);
        f.setCurrentState(new StateHigh());
    }
}
