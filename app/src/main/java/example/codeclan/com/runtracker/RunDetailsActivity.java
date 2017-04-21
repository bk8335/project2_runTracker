package example.codeclan.com.runtracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class RunDetailsActivity extends AppCompatActivity {

    TextView runDateText;
    TextView runDistanceText;
    TextView runTimeMinutesText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_run_details);

        runDateText = (TextView)findViewById(R.id.run_date);
        runDistanceText = (TextView)findViewById(R.id.distance);
        runTimeMinutesText = (TextView)findViewById(R.id.time_minutes);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        String run_date = extras.getString("run_date");
        String distance = extras.getString("distance");
        String time_minutes = extras.getString("time_minutes");

        runDateText.setText(run_date);
        runDistanceText.setText(distance);
        runTimeMinutesText.setText(time_minutes);

    }
}
