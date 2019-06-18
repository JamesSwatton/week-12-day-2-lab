import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StereoTest {

    Stereo stereo;
    Radio radio;
    CdPlayer cdPlayer;

    @Before
    public void before(){
        radio = new Radio("Sony", "blah");
        cdPlayer = new CdPlayer("Sony", "good choice");
        stereo = new Stereo("Cool Stereo 3000", radio, cdPlayer);
    }

    @Test
    public void hasName(){
        assertEquals("Cool Stereo 3000", stereo.getName());
    }

    @Test
    public void getGetNumOfStations(){
        assertEquals(3, stereo.getNumOfStations());
    }

    @Test
    public void canTuneRadio(){
        assertEquals("Radio 1", stereo.tune(0));
    }

    @Test
    public void canInsertCd(){
        stereo.getCdPlayer().insertCd("Queen Greatest Hits 1");
        assertEquals(1, stereo.getCdPlayer().getNumOfCds());
    }
}
