import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CdPlayerTest {

    CdPlayer cdPlayer;

    @Before
    public void before(){
        cdPlayer = new CdPlayer("Bose", "System IV");
    }

    @Test
    public void startEmpty(){
        assertEquals(0, cdPlayer.getNumOfCds());
    }

    @Test
    public void canAddCd(){
        cdPlayer.insertCd("Queen Greatest Hits 1");
        cdPlayer.insertCd("Queen Greatest Hits 2");
        assertEquals(2, cdPlayer.getNumOfCds());
        cdPlayer.insertCd("Queen Greatest Hits 3");
        cdPlayer.insertCd("Queen Greatest Hits 4");
        assertEquals(3, cdPlayer.getNumOfCds());
    }

    @Test
    public void canSelectCd(){
        cdPlayer.insertCd("Queen Greatest Hits 1");
        cdPlayer.insertCd("Queen Greatest Hits 2");
        cdPlayer.insertCd("Queen Greatest Hits 3");
        assertEquals("Queen Greatest Hits 3", cdPlayer.selectCd(2));
    }

    @Test
    public void canPlay(){
        assertEquals("Insert disc", cdPlayer.play());
        cdPlayer.insertCd("Queen Greatest Hits 2");
        assertEquals("Under pressure!", cdPlayer.play());
    }


}
