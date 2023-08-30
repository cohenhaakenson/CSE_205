package ReadingAssignments.RA2;

public class Data {
    private int[][] values;

    /**
     * Computes the sum of a given row in a two-dimensional array.
     * 
     * @param the row whose sum to compute
     * @return the sum of the given row
     */
    public int rowSum(int row) {
        int sum = 0;
        for(int i = 0; i < values[0].length; i++){
            sum += values[row][i];
        }
        return sum;
    }

    public Data(int[][] data) {
        values = data;
    }

}
