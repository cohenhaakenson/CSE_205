package Homeworks.HW2;

import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {
        /*
         * Main for Lab6
         */
        ArrayList<Integer> myList = new ArrayList<Integer>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);
        ArrayList<Integer> myList2 = new ArrayList<Integer>();
        myList2.add(3);
        myList2.add(7);
        myList2.add(6);
        myList2.add(2);
        myList2.add(9);
        myList2.add(0);
        myList2.add(4);
        myList2.add(8);
        ArrayList<Integer> myList3 = new ArrayList<Integer>();
        myList3.add(1);
        myList3.add(1);
        myList3.add(1);
        ArrayList<Integer> myList4 = new ArrayList<Integer>();
        myList4.add(3);
        myList4.add(2);
        myList4.add(3);
        myList4.add(1);
        myList4.add(4);
        myList4.add(2);
        myList4.add(1);
        myList4.add(3);

        ArrayList<Integer> myList5 = new ArrayList<Integer>();
        myList4.add(3);
        myList4.add(2);
        myList4.add(3);
        myList4.add(1);
        myList4.add(4);
        myList4.add(2);
        myList4.add(1);
        myList4.add(3);

        // System.out.print(inRange(myList, 2, 4));
        // System.out.print(inRange(myList2, 3, 10));
        // System.out.print(inRange(myList3, 1, 1));

        // System.out.print(lessThanAverage(myList));
        // System.out.print(lessThanAverage(myList2));
        // System.out.print(lessThanAverage(myList3));

        System.out.print(allDuplicates(myList));
        System.out.print(allDuplicates(myList4));
        System.out.print(allDuplicates(myList3));

    }

    /*
     * Lab6
     */
    public static ArrayList<Integer> inRange(ArrayList<Integer> list, int min, int max) {

        ArrayList<Integer> results = new ArrayList<Integer>();

        for (int val : list) {
            if (val <= max && val >= min) {
                results.add(val);
            }
        }
        return results;
    }

    /*
     * Lab7
     */
    public static ArrayList<Integer> lessThanAverage(ArrayList<Integer> list) {
        ArrayList<Integer> results = new ArrayList<Integer>();
        

        double avg = 0;
        int total = 0;
        for (int val : list) {
            avg += val;
            total++;
        }

        avg = avg / total;

        for (int val : list) {
            if (val < avg) {
                results.add(val);
            }
        }

        return results;
    }

    /*
     * Lab8
     */
    public static ArrayList<Integer> allDuplicates(ArrayList<Integer> list) {
        ArrayList<Integer> results = new ArrayList<Integer>();

        // for each integer in list
        for (int i = 0; i < list.size(); i++) {
            // assign value to check
            int toCheck = list.get(i);
            // parse through list again to check for dup
            for (int j = 0; j < list.size(); j++) {

                // if dupe found and found is not i, then add to results
                if (toCheck == list.get(j) && j != i && !results.contains(toCheck)) {
                    results.add(toCheck);
                }
            }
        }

        return results;
    }

    /*
     * Lab9
     */
    public static ArrayList<Integer> inBoth (ArrayList<Integer> list1, ArrayList<Integer> list2){
        ArrayList<Integer> results = new ArrayList<Integer>();

        for (int i = 0; i < list1.size(); i++){
            for (int j = 0; j < list2.size(); j++){

                if (!results.contains(list1.get(i)) && list1.get(i) == list2.get(j)){
                    results. add(list1.get(i));
                }

            }
        }

        return results;
    }
}
