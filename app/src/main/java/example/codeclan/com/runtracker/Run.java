package example.codeclan.com.runtracker;



/**
 * Created by user on 20/04/2017.
 */

public class Run {

    private String run_date;
    private Double distance;
    private int time_minutes;
    private String notes;
//    private int pace;

    public Run(String run_date, Double distance, Integer time_minutes, String notes){
        this.run_date = run_date;
        this.distance = distance;
        this.time_minutes = time_minutes;
        this.notes = notes;
//        this.pace = pace;
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

//    public String getPace() {
//        return Double getDistance()/getTime_minutes();
//    }

}
