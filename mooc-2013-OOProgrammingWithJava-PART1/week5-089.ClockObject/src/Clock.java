
public class Clock {

    private BoundedCounter hours;
    private BoundedCounter minutes;
    private BoundedCounter seconds;

    public Clock(int hoursAtBeginning, int minutesAtBeginning, int secondsAtBeginning) {
        // the counters that represent hours, minutes and seconds are created and set to have the correct initial values
        hours = new BoundedCounter(23);
        minutes = new BoundedCounter(59);
        seconds = new BoundedCounter(59);

        //check hours
        if (hoursAtBeginning >= 0 && hoursAtBeginning < 24) {

            hours.setValue(hoursAtBeginning);
        } else {
            hours.setValue(0);
        }

        //check minutes
        if (minutesAtBeginning >= 0 && minutesAtBeginning < 60) {

            minutes.setValue(minutesAtBeginning);
        } else {
            minutes.setValue(0);
        }

        //check seconds
        if (secondsAtBeginning >= 0 && secondsAtBeginning < 60) {

            seconds.setValue(secondsAtBeginning);
        } else {
            seconds.setValue(0);
        }
    }

    public void tick() {
        // Clock advances by one second
        seconds.next();

        if (seconds.getValue() == 0) {

            minutes.next();
            // if minutes become zero, advance hours

            if (minutes.getValue() == 0) {

                hours.next();
            }
        }
    }

    public String toString() {
        // returns the string representation
        return hours + ":" + minutes + ":" + seconds;
    }
}
