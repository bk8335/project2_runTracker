package example.codeclan.com.runtracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import java.util.ArrayList;

public class AllRunsActivity extends AppCompatActivity {

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
