package example.codeclan.com.runtracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import static example.codeclan.com.runtracker.R.id.pace;
import static example.codeclan.com.runtracker.R.id.question_input_notes;
import static example.codeclan.com.runtracker.R.id.run_notes;

public class EditRunDetailsActivity extends AppCompatActivity {

    EditText runDateText;
    EditText runDistanceText;
    EditText runTimeMinutesText;
    EditText runNotes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_run_details);

        runDateText = (EditText)findViewById(R.id.question_input_date);
        runDistanceText = (EditText)findViewById(R.id.question_input_distance);
        runTimeMinutesText = (EditText)findViewById(R.id.question_input_time);
        runNotes = (EditText)findViewById(question_input_notes);

        Bundle bundle = getIntent().getExtras();


        String runningDate = bundle.getString("run_date");
        runDateText.setText(runningDate);

        String runningDistance = bundle.getString("distance");
        runDistanceText.setText(runningDistance);

        String runningTime = bundle.getString("time_minutes");
        runTimeMinutesText.setText(runningTime);

        String runningNotes = bundle.getString("run_notes");
        runNotes.setText(runningNotes);

    }
}
