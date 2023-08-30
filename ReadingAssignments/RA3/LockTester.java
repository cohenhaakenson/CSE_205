package ReadingAssignments.RA3;


public class LockTester
{
   public static void main(String[] args)
   {
      Lock myLock = new Lock();
      
      myLock.push(4);
      System.out.println(myLock.getInput());
      myLock.push(2);
      System.out.println(myLock.getInput());
      System.out.println("Combination: 42");
      System.out.println("Expected: false");
      System.out.println("Your output: " + myLock.open());
      System.out.println();
      
      myLock.push(0);
      System.out.println(myLock.getInput());
      myLock.push(0);
      System.out.println(myLock.getInput());
      myLock.push(4);
      System.out.println(myLock.getInput());
      myLock.push(2);
      System.out.println(myLock.getInput());
      System.out.println("Combination: 0042");
      System.out.println("Expected: true");
      System.out.println("Your output: " + myLock.open());
      System.out.println();
      
      myLock.push(0);
      myLock.push(4);
      myLock.push(2);
      System.out.println("Combination: 042");
      System.out.println("Expected: false");
      System.out.println("Your output: " + myLock.open());
      System.out.println();
      
      myLock.push(0);
      myLock.push(0);
      myLock.push(0);
      myLock.push(4);
      myLock.push(2);
      System.out.println("Combination: 00042");
      System.out.println("Expected: false");
      System.out.println("Your output: " + myLock.open());
      System.out.println();
      
      myLock.push(0);
      myLock.push(0);
      myLock.push(4);
      myLock.push(2);
      System.out.println("Combination: 0042");
      System.out.println("Expected: true");
      System.out.println("Your output: " + myLock.open());      
   }
}