package State;

public enum EnumState {
    High2 {
        @Override
        public void handlePress(Flashlight f) {
            f.turnOff();
            f.setCurrentEnumState(EnumState.Off);
        }

        @Override
        public void handleHold(Flashlight f) {
            f.setBrightness(1);
            f.setCurrentEnumState(EnumState.Low);
        }
    },
    High {
        @Override
        public void handlePress(Flashlight f) {
            f.turnOff();
            f.setCurrentEnumState(EnumState.Off);
        }

        @Override
        public void handleHold(Flashlight f) {
            f.setBrightness(3);
            f.setCurrentEnumState(EnumState.High2);
        }
    },
    Low {
        @Override
        public void handlePress(Flashlight f) {
            f.turnOff();
            f.setCurrentEnumState(EnumState.Off);
        }

        @Override
        public void handleHold(Flashlight f) {
            f.setBrightness(2);
            f.setCurrentEnumState(EnumState.High);
        }
    },
    Off {
        @Override
        public void handlePress(Flashlight f) {
            f.turnOn();
            f.setBrightness(1);
            f.setCurrentEnumState(EnumState.Low);
        }

        @Override
        public void handleHold(Flashlight f) {

        }
    };
    public abstract void handlePress(Flashlight f);
    public abstract void handleHold(Flashlight f);
}
