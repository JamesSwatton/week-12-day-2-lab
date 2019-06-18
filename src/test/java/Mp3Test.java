import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Mp3Test {

    Mp3 mp3;
    Stereo stereo;

    @Before
    public void before(){
        mp3 = new Mp3("Apple", "iPod");
        stereo = new Stereo("Cool Stereo 3000", null, null);
    }

    @Test
    public void canConnect(){
        assertEquals("Cool Stereo 3000", mp3.connect(stereo));
    }
}
