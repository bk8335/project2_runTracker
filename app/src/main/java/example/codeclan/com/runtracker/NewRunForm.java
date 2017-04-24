package example.codeclan.com.runtracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class NewRunForm extends AppCompatActivity {

    EditText question_input_date;
    EditText question_input_distance;
    EditText question_input_time;
    EditText question_input_notes;

    Button new_run_button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_run_form);

        question_input_date = (EditText)findViewById(R.id.question_input_date);
        question_input_distance = (EditText)findViewById(R.id.question_input_distance);
        question_input_time = (EditText)findViewById(R.id.question_input_time);
        question_input_notes = (EditText)findViewById(R.id.question_input_notes);


    }

    public void onAddNewRunButtonClicked(View button) {
//       this is where i use the sharedpreferences to setRunList
//       onCreate, cast. onClick, turn your cast into a string i.e question_input_date.getText().toString()
//        if not expecting a string, need to do parseint or similar to put it in the required format.

        String dateAnswer = question_input_date.getText().toString();

        String distanceAnswer = question_input_distance.getText().toString();
        double doubleDistanceAnswer = Double.parseDouble(distanceAnswer);

        String timeAnswer = question_input_time.getText().toString();
        int intTimeAnswer = Integer.parseInt(timeAnswer);

        String noteAnswer = question_input_notes.getText().toString();

        Log.d(getClass().toString(), "on add new run button clicked");
        String inputDate = question_input_date.getText().toString();
        Log.d(getClass().toString(), inputDate);


        ArrayList<Run> runList = SharedPreferencesManager.getRunList(this);
        runList.add(new Run(dateAnswer, doubleDistanceAnswer, intTimeAnswer, noteAnswer));

        SharedPreferencesManager.setRunList(this, runList);


        Intent intent = new Intent(this, RunListViewActivity.class);
        startActivity(intent);

    }


}
