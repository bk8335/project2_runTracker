package example.codeclan.com.runtracker;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;




/**
 * Created by user on 21/04/2017.
 */

public class SharedPreferencesManager {

    public static void setRunList(Context context, ArrayList<Run> runList) {
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        Gson gson = new Gson();
        editor.putString("RunList", gson.toJson(runList));
        editor.apply();
    }

    public static ArrayList<Run> getRunList(Context context){
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        String jsonString = sharedPreferences.getString("RunList", new ArrayList<Run>().toString());

        Gson gson = new Gson();
        TypeToken<ArrayList<Run>> runArrayList = new TypeToken<ArrayList<Run>>(){
        };

        ArrayList<Run> runList = gson.fromJson(jsonString, runArrayList.getType());
        return runList;
    }

}
