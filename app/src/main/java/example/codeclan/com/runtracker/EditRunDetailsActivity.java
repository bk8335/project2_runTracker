package example.codeclan.com.runtracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

import static example.codeclan.com.runtracker.R.id.pace;
import static example.codeclan.com.runtracker.R.id.question_input_date;
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


    public void onUpdateRunButtonClicked(View button) {
//       this is where i use the sharedpreferences to setRunList
//       onCreate, cast. onClick, turn your cast into a string i.e question_input_date.getText().toString()
//        if not expecting a string, need to do parseint or similar to put it in the required format.


        String dateAnswer = runDateText.getText().toString();


        String distanceAnswer = runDistanceText.getText().toString();
        double doubleDistanceAnswer = Double.parseDouble(distanceAnswer);

        String timeAnswer = runTimeMinutesText.getText().toString();
        int intTimeAnswer = Integer.parseInt(timeAnswer);

        String noteAnswer = runNotes.getText().toString();

        Log.d(getClass().toString(), "on update run button clicked");


        ArrayList<Run> runList = SharedPreferencesManager.getRunList(this);
        Run foundRun = null;
        for(Run run : runList){
            if(run.getDate().equals(dateAnswer) && run.getDistance().toString().equals(distanceAnswer)) {
                run.setRunDate(dateAnswer);
                run.setDistance(doubleDistanceAnswer);
                run.setTime_minutes(intTimeAnswer);
                run.setNotes(noteAnswer);
                foundRun = new Run(dateAnswer, doubleDistanceAnswer, intTimeAnswer, noteAnswer);
                runList.remove(run);
                Log.d(getClass().toString(), "this should mean there is a positive match");
            }
        }



        //double find using date and distance to get the particular run
        //extracting the found run from runlist
        //use setters for updating
        //add it back to runlist


        runList.add(foundRun);

        SharedPreferencesManager.setRunList(this, runList);


        Intent intent = new Intent(this, RunListViewActivity.class);
        startActivity(intent);

    }
}
