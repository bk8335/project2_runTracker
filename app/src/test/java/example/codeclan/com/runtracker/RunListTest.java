package example.codeclan.com.runtracker;

import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 20/04/2017.
 */

public class RunListTest {

    private ArrayList<Run> list;

    @Test
    public void checkArrayLengthTest() {
        list = new ArrayList<Run>();
        list.add(new Run("18 April", 4.32, 26, "a boring run"));
        list.add(new Run("19 April", 4.32, 26, "a boring run"));
        list.add(new Run("20 April", 4.32, 26, "a boring run"));
        list.add(new Run("21 April", 4.32, 26, "a boring run"));
        assertEquals(4, list.size());
    }


}
