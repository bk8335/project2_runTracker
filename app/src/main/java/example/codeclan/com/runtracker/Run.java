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
    private Double pace;

    public Run(String run_date, Double distance, Integer time_minutes, String notes){
        this.run_date = run_date;
        this.distance = distance;
        this.time_minutes = time_minutes;
        this.notes = notes;
        this.pace = time_minutes / distance;
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

    public Double getPace() {
        return pace;
    }

}
