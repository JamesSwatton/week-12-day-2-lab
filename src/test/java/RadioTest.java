import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RadioTest {

    Radio radio;

    @Before
    public void before(){
        radio = new Radio("Sony", "X1");
    }

    @Test
    public void hasMake(){
        assertEquals("Sony", radio.getMake());
    }

    @Test
    public void hasModel(){
        assertEquals("X1", radio.getModel());
    }

    @Test
    public void startsWith3Stations(){
        assertEquals(3, radio.getNumOfStations());
    }

    @Test
    public void canTune(){
        assertEquals("ClassicFM", radio.tune(1));
    }
}
