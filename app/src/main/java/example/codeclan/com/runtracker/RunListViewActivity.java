package example.codeclan.com.runtracker;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class RunListViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.run_list);

        ArrayList<Run> list = SharedPreferencesManager.getRunList(this);
        RunListAdapter runAdapter = new RunListAdapter(this, list);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(runAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.run_list_view_activity, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.action_new_run) {
            Intent intent = new Intent(this, NewRunForm.class);
            startActivity(intent);
            return true;
        }
        return onOptionsItemSelected(item);
    }

    public Run getRun(View listItem){
        Run run = (Run) listItem.getTag();
        return run;
    }

    public void onRunDetailButtonClicked(View listItem) {

        Intent intent = new Intent(this, RunDetailsActivity.class);
        Bundle extras = new Bundle();
        extras.putString("run_date", getRun(listItem).getDate() );
        extras.putString("distance", getRun(listItem).getDistance().toString() );
        extras.putString("time_minutes", getRun(listItem).getTime_minutes().toString() );
        extras.putString("run_notes", getRun(listItem).getNotes());
        extras.putString("run_pace", getRun(listItem).getPace().toString());
        intent.putExtras(extras);
        startActivity(intent);

    }
}
