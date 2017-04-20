package example.codeclan.com.runtracker;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 20/04/2017.
 */

public class RunTest {

    Run run;

    @Test
    public void getRunDetailsTest() {
        Run run = new Run("23 April", 30.0, 150, "took bloody ages" );
        assertEquals("23 April", run.getDate());
        assertEquals(30.0, run.getDistance());
        assertEquals(150, run.getTime_minutes());
        assertEquals("took bloody ages", run.getNotes());
    }

}
