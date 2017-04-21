package example.codeclan.com.runtracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class RunDetailsActivity extends AppCompatActivity {

    TextView runDetailText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_run_details);

        runDetailText = (TextView)findViewById(R.id.run_date);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        String run_date = extras.getString("run_date");
        runDetailText.setText(run_date);

    }
}
