package ReadingAssignments.RA3;

/**
   This class models a ball that bounces off walls.
*/
public class Ball
{
   // Instance variables
   int x;
   int y;
   int xBound;
   int yBound;
   int xDirection;
   int yDirection;
   
   /**
      Constructs a ball at (0, 0) traveling northeast.
      @param rightWall the position of the wall to the right
      @param topWall the position of the wall at the top
   */
   public Ball(int rightWall, int topWall)   
   {
      x = 0;
      y = 0;
      xBound = rightWall;
      yBound = topWall;
      xDirection = 1;
      yDirection = 1;
   }
 
   /**
      Moves the ball.
   */
   public void move()
   {
      x += xDirection;
      y += yDirection;
      if (x == xBound || x == 0){
         xDirection *= -1;
      }else if (y == yBound || y == 0) {
         yDirection *= -1;
      }
         
   }
 
   /**
      Turns the ball direction 90 degrees clockwise.
   */
   private void turn()
   {
      /* Your code goes here */
   }
 
   /**
      Gets the current x-position.
      @return the x-position
   */
   public int getX()
   {
      return x;
   }
 
   /**
      Gets the current y-position.
      @return the y-position
   */
   public int getY()
   {
      return y;
   }
}