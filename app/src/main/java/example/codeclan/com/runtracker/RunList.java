package example.codeclan.com.runtracker;

import java.util.ArrayList;

/**
 * Created by user on 20/04/2017.
 */

public class RunList {

    private ArrayList<Run> list;

    public RunList() {
        list = new ArrayList<Run>();
        list.add(new Run("20 April", 10.0, 45, "10k run on the treadmill"));
        list.add(new Run("19 April", 0.0 , 0, ""));
        list.add(new Run("18 April", 5.45, 27, "ran around Arthur's seat"));
        list.add(new Run("17 April", 0.0, 0, ""));
        list.add(new Run("16 April", 2.2, 11, "one lap of the meadows"));
    }

    public ArrayList<Run> getList() {
        return new ArrayList<Run>(list);
    }

}
