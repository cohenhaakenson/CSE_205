package ReadingAssignments.RA3;

/**
 * A simulated digital clock.
 */
public class Clock {
    private int minutesFromMidnight;

    private int something;
    public int getMFM(){
        return minutesFromMidnight;
    }
    
    /**
     * Advances this clock to the next minute.
     */
    public void pulse() {
        if (minutesFromMidnight < 1439)
            minutesFromMidnight++;
        else
            minutesFromMidnight = 0;
    }

    /**
     * Gets the hours of this clock.
     * 
     * @return the hours (between 0 and 23)
     */
    public int getHours() {
        return minutesFromMidnight / 60;
    }

    /**
     * Gets the minutes of this clock.
     * 
     * @return the minutes (between 0 and 59)
     */
    public int getMinutes() {
        return minutesFromMidnight % 60;
    }

    // private int hours;
    // private int minutes;

    // /**
    // * Advances this clock to the next minute.
    // */
    // public void pulse() {
    // minutes++;
    // if (minutes == 60){
    // minutes = 0;
    // hours++;
    // }

    // if (hours == 24){
    // hours = 0;
    // }
    // }

    // /**
    // * Gets the hours of this clock.
    // *
    // * @return the hours (between 0 and 23)
    // */
    // public int getHours() {
    // return hours;
    // }

    // /**
    // * Gets the minutes of this clock.
    // *
    // * @return the minutes (between 0 and 59)
    // */
    // public int getMinutes() {
    // return minutes;
    // }
}