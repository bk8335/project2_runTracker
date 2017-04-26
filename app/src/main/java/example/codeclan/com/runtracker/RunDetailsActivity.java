package example.codeclan.com.runtracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import static example.codeclan.com.runtracker.R.id.pace;
import static example.codeclan.com.runtracker.R.id.run_notes;

public class RunDetailsActivity extends AppCompatActivity {

    TextView runDateText;
    TextView runDistanceText;
    TextView runTimeMinutesText;
    TextView runNotes;
    TextView runPace;
    Button editButton;


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.run_details_activity, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.action_home_page) {
            Intent intent = new Intent(this, RunListViewActivity.class );
            startActivity(intent);
            return true;
        }
        else if (item.getItemId() == R.id.action_new_run) {
            Intent intent2 = new Intent(this, NewRunForm.class);
            startActivity(intent2);
            return true;
        }
        else if (item.getItemId() == R.id.action_total_runs) {
            Intent intent3 = new Intent(this, AllRunsActivity.class);
            startActivity(intent3);
            return true;
        }
        return onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_run_details);

        runDateText = (TextView)findViewById(R.id.run_date);
        runDistanceText = (TextView)findViewById(R.id.distance);
        runTimeMinutesText = (TextView)findViewById(R.id.time_minutes);
        runNotes = (TextView)findViewById(run_notes);
        runPace = (TextView)findViewById(pace);


        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String run_date = extras.getString("run_date");
        String distance = extras.getString("distance");
        String time_minutes = extras.getString("time_minutes");

        String run_notes = extras.getString("run_notes");
        String pace = extras.getString("run_pace");


        runDateText.setText(run_date);
        runDistanceText.setText(distance);
        runTimeMinutesText.setText(time_minutes);
        runNotes.setText(run_notes);
        runPace.setText(pace);

    }

    protected void onEditButtonClicked(View savedInstanceState) {
        Intent intent = new Intent(this, EditRunDetailsActivity.class);
        Bundle extras = new Bundle();
        extras.putString("run_date", runDateText.getText().toString() );
        extras.putString("distance", runDistanceText.getText().toString());
        extras.putString("time_minutes", runTimeMinutesText.getText().toString());
        extras.putString("run_notes", runNotes.getText().toString());
        intent.putExtras(extras);
        startActivity(intent);
        

    }

    protected  void onDeleteButtonClicked(View somethingSomething) {
        ArrayList<Run> runList = SharedPreferencesManager.getRunList(this);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String run_date = extras.getString("run_date");
        String distance = extras.getString("distance");


        for(Run run : runList){
            if(run.getDate().equals(run_date) && run.getDistance().toString().equals(distance)) {
                runList.remove(run);
            }
        }
        SharedPreferencesManager.setRunList(this, runList);

        Intent intent2 = new Intent(this, RunListViewActivity.class);
        startActivity(intent2);

        Toast.makeText(RunDetailsActivity.this, R.string.button_toast_delete, Toast.LENGTH_LONG).show();

    }
}
