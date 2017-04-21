package example.codeclan.com.runtracker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import static example.codeclan.com.runtracker.R.id.run_date;

/**
 * Created by user on 20/04/2017.
 */

public class RunListAdapter extends ArrayAdapter<Run> {

    public RunListAdapter(Context context, ArrayList<Run> runs) {
        super(context, 0, runs);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent){
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.run_item, parent, false);
        }

        Run currentRun = getItem(position);

        TextView run_date = (TextView) listItemView.findViewById(R.id.run_date);
        run_date.setText(currentRun.getDate());

        TextView distance = (TextView) listItemView.findViewById(R.id.distance);
        distance.setText(currentRun.getDistance().toString() + " km");

        TextView time_minutes = (TextView) listItemView.findViewById(R.id.time_minutes);
        time_minutes.setText(currentRun.getTime_minutes().toString() + " minutes");

        listItemView.setTag(currentRun);


        return listItemView;

    }



}
