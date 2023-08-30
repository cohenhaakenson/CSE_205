package Homeworks.HW2;

public class Main {
    
public static void main(String[] args){
    /*
     * Main for Lab1
     */
    int[] myArray = {1, 2, 3, 4, 5};
    int[] myArray2 = {13, 7, 6, 5, 99, 10, 4, 8};
    int[] myArray3 = {1, 1, 1};
    // printArray(avgAndSum(myArray));
    // printArray(avgAndSum(myArray2));
    // printArray(avgAndSum(myArray3));

    /*
     * Main for Lab2
     */
    // printArrayInt(maxAndMin(myArray));
    // printArrayInt(maxAndMin(myArray2));
    // printArrayInt(maxAndMin(myArray3));

    /*
     * Main for Lab3
     */
     printArrayInt(oddAndEven(myArray));
     printArrayInt(oddAndEven(myArray2));
     printArrayInt(oddAndEven(myArray3));

    /*
     * Main for Lab4
     */
    // System.out.println(range(myArray));
    // System.out.println(range(myArray2));
    // System.out.println(range(myArray3));

    /*
     * Main for Lab5
     */
    //System.out.println(countGreaterThanAverage(myArray));
    //System.out.println(countGreaterThanAverage(myArray2));
    //System.out.println(countGreaterThanAverage(myArray3));


}

/*
 * Lab5
 */
public static int countGreaterThanAverage(int[] values){
    int count = 0;
    double avg = avgAndSum(values)[0];

    for (int n : values){
        if (n > avg){
            count++;
        }
    }

    return count;
    
}

/*
 * Lab 4
 */
public static int range(int[] values){
    
    int[] minMax = maxAndMin(values);
    int range = minMax[0] - minMax[1];

    return range;
}

/*
 * Lab3
 */
public static int[] oddAndEven(int[] values){

    int oddCount = 0;
    int evenCount = 0;

    for (int n : values){
        if(n%2 == 0){
            evenCount++;
        }
        if (n%2 == 1) {
            oddCount++;
        }
    }

    int[] result = {oddCount, evenCount};

    return result;
}

/*
 * Lab2
 */
public static int[] maxAndMin (int[] values){

    int min = values[0];
    int max = values[0];

    for (int n : values){
        if (n < min){
            min = n;
        }
        if (n > max){
            max = n;
        }
    }

    int[] result = {max, min};

    return result;
}
/*
 * Lab1
 */
public static double[] avgAndSum(int[] values){
    double sum = 0;
    double total = 0;
    double avg = 0;

    for(int i = 0; i < values.length; i++){
        sum += values[i];
        total++;
    }

    avg = sum / total;
    double[] results = {avg, sum};
    return results;
}

public static void printArray(double[] arr){
    System.out.print("[ ");
    for (int i = 0; i < arr.length; i++){
        System.out.print(arr[i] + " ");
    }
    System.out.print("]");
    System.out.println();
}

public static void printArrayInt(int[] arr){
    System.out.print("[ ");
    for (int i = 0; i < arr.length; i++){
        System.out.print(arr[i] + " ");
    }
    System.out.print("]");
    System.out.println();
}

}
