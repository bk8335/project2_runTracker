package example.codeclan.com.runtracker;


import java.io.Serializable;
import java.util.Date;

/**
 * Created by user on 20/04/2017.
 */

public class Run implements Serializable {

    private String run_date;
    private Double distance;
    private int time_minutes;
    private String notes;

    public Run(String run_date, Double distance, Integer time_minutes, String notes){
        this.run_date = run_date;
        this.distance = distance;
        this.time_minutes = time_minutes;
        this.notes = notes;
    }

    public String getDate() {
        return run_date;
    }


    public Double getDistance() {
        return distance;
    }

    public Integer getTime_minutes() {
        return time_minutes;
    }

    public String getNotes() {
        return notes;
    }

    public String getPace() {
        //        ((get precise number - rounded down number) * 60) + rounded down number
        Double mins = Math.floor(time_minutes / distance);
        Double secs = Math.floor(((time_minutes/distance) - Math.floor(time_minutes / distance)) * 60);

        String minsRounded = String.format("%.0f", mins);
        String secsRounded = String.format("%.0f", secs);

        return minsRounded + ":" + secsRounded;
    }


    public void setRunDate(String runDate) {
        this.run_date = runDate;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public void setTime_minutes(int time_minutes) {
        this.time_minutes = time_minutes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
