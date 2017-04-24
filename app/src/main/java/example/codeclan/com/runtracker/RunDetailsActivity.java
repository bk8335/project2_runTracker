package example.codeclan.com.runtracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import static example.codeclan.com.runtracker.R.id.pace;
import static example.codeclan.com.runtracker.R.id.run_notes;

public class RunDetailsActivity extends AppCompatActivity {

    TextView runDateText;
    TextView runDistanceText;
    TextView runTimeMinutesText;
    TextView runNotes;
    TextView runPace;


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
        String distance = "Distance: " + extras.getString("distance") + " km";
        String time_minutes = "Time: " + extras.getString("time_minutes") + " minutes";

        String run_notes = "Notes: " + extras.getString("run_notes");
        String pace = "Pace: " + extras.getString("pace") + " min/km";


        runDateText.setText(run_date);
        runDistanceText.setText(distance);
        runTimeMinutesText.setText(time_minutes);
        runNotes.setText(run_notes);
        runPace.setText(pace);

    }
}
