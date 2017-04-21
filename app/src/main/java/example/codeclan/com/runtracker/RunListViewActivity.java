package example.codeclan.com.runtracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class RunListViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.run_list);

        RunList runList = new RunList();
        ArrayList<Run> list = runList.getList();

        RunListAdapter runAdapter = new RunListAdapter(this, list);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(runAdapter);

    }

    public Run getRun(View listItem){
        Run run = (Run) listItem.getTag();
        return run;
    }

    public void onRunDetailButtonClicked(View listItem) {

        Intent intent = new Intent(this, RunDetailsActivity.class);
        intent.putExtra("run", getRun(listItem).getDate() );
        startActivity(intent);
    }
}
