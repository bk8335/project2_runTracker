package example.codeclan.com.runtracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class NewRunForm extends AppCompatActivity {

    EditText question_input_date;
    EditText question_input_distance;
    EditText question_input_time;
    EditText question_input_notes;

    Button new_run_button;

//    TextView input_date_text;
//    TextView input_distance_text;
//    TextView input_time_text;
//    TextView input_notes_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_run_form);

        question_input_date = (EditText)findViewById(R.id.question_input_date);

//        input_date_text = (TextView)findViewById(R.id.input_date_text);

    }

    public void onAddNewRunButtonClicked(View button) {
        Log.d(getClass().toString(), "on add new run button clicked");
        String inputDate = question_input_date.getText().toString();
        Log.d(getClass().toString(), inputDate);

        Intent intent = new Intent(this, RunListViewActivity.class);
        startActivity(intent);

    }


}
