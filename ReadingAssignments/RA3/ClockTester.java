package ReadingAssignments.RA3;

public class ClockTester {
    public static void main(String[] args) {
        Clock myClock = new Clock();
        for (int i = 0; i < 100; i++) {
            myClock.pulse();
        }
        System.out.println(myClock.getHours());
        System.out.println("Expected: 1");
        System.out.println(myClock.getMinutes());
        System.out.println("Expected: 40");
        for (int i = 0; i < 70; i++) {
            myClock.pulse();
        }
        System.out.println(myClock.getHours());
        System.out.println("Expected: 2");
        System.out.println(myClock.getMinutes());
        System.out.println("Expected: 50");
        for (int i = 0; i < 1270; i++) {
            myClock.pulse();
            //System.out.println(myClock.getMFM());
        }
        System.out.println(myClock.getHours());
        System.out.println("Expected: 0");
        System.out.println(myClock.getMinutes());
        System.out.println("Expected: 0");
    }
}