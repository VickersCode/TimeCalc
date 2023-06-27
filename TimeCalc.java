import javax.swing.JOptionPane;

/**
 * Starting Out With Java - 5th Edition
 * Chapter 3, Programming Challenge 6: Time Calculator
 * @author TylerVickers
 */

public class TimeCalc {
    public static void main(String[] args) {
        
        double seconds; // The number of seconds
        String input; // Holds user input when asked for seconds

        // CONSTANTS
        final double SECONDS_PER_MINUTE = 60.0;
        final double SECONDS_PER_HOUR = 3600.0;
        final double SECONDS_PER_DAY = 86400.0;

        // Dialogue box asks user for the number of seconds

        input = JOptionPane.showInputDialog("Enter the number of seconds");
        seconds = Double.parseDouble(input);

        // Determines which 
        if (seconds >= SECONDS_PER_DAY) {
            double days = seconds / SECONDS_PER_DAY;
            JOptionPane.showMessageDialog(null, "There are " +
            days + "days in " + seconds + " seconds");
        } else if (seconds >= SECONDS_PER_HOUR) {
            double hours = seconds / SECONDS_PER_HOUR;
            JOptionPane.showMessageDialog(null, "There are " +
            hours + "hours in " + seconds + " seconds");
        } else if (seconds >= SECONDS_PER_MINUTE) {
            double minutes = seconds / SECONDS_PER_MINUTE;
            JOptionPane.showMessageDialog(null, "There are " +
            minutes + "minutes in " + seconds + " seconds");
        } else {
            JOptionPane.showMessageDialog(null, "You entered " +
            "too small of a number of seconds. Cannot convert.");
        }

        System.exit(0);
    }
}
