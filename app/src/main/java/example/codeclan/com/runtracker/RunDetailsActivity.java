package example.codeclan.com.runtracker;

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

    }
}
