package example.codeclan.com.runtracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.ArrayList;

public class AllRunsActivity extends AppCompatActivity {

    TextView totalRunDistanceText;
    TextView totalRunTimeText;
    TextView totalRunPaceText;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.total_runs_activity, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        if (item.getItemId() == R.id.action_home_page){
            Intent intent = new Intent(this, RunListViewActivity.class);
            startActivity(intent);
            return true;
        }
        else if (item.getItemId() == R.id.action_new_run){
            Intent intent2 = new Intent (this, NewRunForm.class);
            startActivity(intent2);
            return true;
        }
        return onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_runs);

        totalRunDistanceText = (TextView)findViewById(R.id.total_distance);
        totalRunTimeText = (TextView)findViewById(R.id.total_time);
        totalRunPaceText = (TextView)findViewById(R.id.total_pace);

        totalRunDistanceText.setText(totalRunDistance().toString());
        totalRunTimeText.setText(totalRunTime().toString());
        totalRunPaceText.setText(totalRunPace());


    }

    public Double totalRunDistance() {
        double runDistance = 10;
        ArrayList<Run> runList = SharedPreferencesManager.getRunList(this);
        for(Run run : runList){
//            run.getDistance() += runDistance;
        }

        return runDistance;
    }

    public Integer totalRunTime() {
        int runTime = 45;
        return runTime;
    }

    public String totalRunPace() {
        //        ((get precise number - rounded down number) * 60) + rounded down number
        Double mins = Math.floor(totalRunTime() / totalRunDistance());
        Double secs = Math.floor(((totalRunTime()/totalRunDistance()) - Math.floor(totalRunTime() / totalRunDistance())) * 60);

        String minsRounded = String.format("%.0f", mins);
        String secsRounded = String.format("%.0f", secs);

        return minsRounded + ":" + secsRounded;
    }
}
