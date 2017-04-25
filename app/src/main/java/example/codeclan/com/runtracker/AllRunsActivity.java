package example.codeclan.com.runtracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class AllRunsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_runs);
    }

    public double totalRunDistance() {
        double runDistance = 0;
        ArrayList<Run> runList = SharedPreferencesManager.getRunList(this);
        for(Run run : runList){
//            run.getDistance() += runDistance;
        }



        return runDistance;
    }
}
