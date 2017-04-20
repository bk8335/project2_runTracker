package example.codeclan.com.runtracker;

import java.sql.Time;
import java.util.Date;

/**
 * Created by user on 20/04/2017.
 */

public class Run {

    private String date;
    private Double distance;
    private int time_minutes;
    private String notes;

    public Run(String date, Double distance, int time_minutes, String notes){
        this.date = date;
        this.distance = distance;
        this.time_minutes = time_minutes;
        this.notes = notes;
    }

    public String getDate() {
        return date;
    }

    public Double getDistance() {
        return distance;
    }

    public int getTime_minutes() {
        return time_minutes;
    }

    public String getNotes() {
        return notes;
    }

}
