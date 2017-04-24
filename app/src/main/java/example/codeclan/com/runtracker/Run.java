package example.codeclan.com.runtracker;


import java.io.Serializable;

/**
 * Created by user on 20/04/2017.
 */

public class Run implements Serializable {

    private String run_date;
    private Double distance;
    private int time_minutes;
    private String notes;
//    private Double pace;

    public Run(String run_date, Double distance, Integer time_minutes, String notes){
        this.run_date = run_date;
        this.distance = distance;
        this.time_minutes = time_minutes;
        this.notes = notes;
//        this.pace = time_minutes / distance;
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
        //        get precise number - rounded down number * 60 + rounded down number
        Double mins = Math.floor(time_minutes / distance);
        Double secs = Math.floor(((time_minutes/distance) - Math.floor(time_minutes / distance)) * 60);

        String minsRounded = String.format("%.0f", mins);
        String secsRounded = String.format("%.0f", secs);

        return minsRounded + ":" + secsRounded;
    }

}
