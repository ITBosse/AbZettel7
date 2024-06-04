package State;

import org.junit.Test;
import static org.junit.Assert.*;

public class test {

    @Test
    public void testFlashlight() {
        Flashlight f = new Flashlight();
        assertTrue(f.getCurrentState() instanceof StateOff);
        assertSame(f.getCurrentEnumState(), EnumState.Off);
        f.press();
        assertTrue(f.getCurrentState() instanceof StateLow);
        assertSame(f.getCurrentEnumState(), EnumState.Low);
        f.hold();
        assertTrue(f.getCurrentState() instanceof StateHigh);
        assertSame(f.getCurrentEnumState(), EnumState.High);
        f.hold();
        assertTrue(f.getCurrentState() instanceof StateHigh2);
        assertSame(f.getCurrentEnumState(), EnumState.High2);
        f.press();
        assertTrue(f.getCurrentState() instanceof StateOff);
        assertSame(f.getCurrentEnumState(), EnumState.Off);
    }
}