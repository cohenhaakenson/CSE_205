package ReadingAssignments.RA3;

/**
 * A simulated lock with digit buttons.
 */
public class Lock {
    private String combination = "0042";
    private String input;

    /**
     * Simulates a digit button push.
     * 
     * @param button a digit 0 ... 9
     */
    public void push(int button) {
        if (input == null){
            input = String.valueOf(button);
        }else {
            input += String.valueOf(button);
        }
    }

    public String getInput() {
        return input;
    }

    /**
     * Simulates a push of the open button.
     * 
     * @return true if the lock opened
     */
    public boolean open() {
        if (input.equals(combination)) {
            return true;
        } else {
            return false;
        }
    }
}
