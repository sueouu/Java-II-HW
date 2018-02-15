import java.util.Random;

public class ConfusedTurtle extends Turtle
{
 ////////////////// constructors ///////////////////////

  public ConfusedTurtle (int x, int y, Picture picture) 
  {
    // let the parent constructor handle it
    super(x,y,picture);
  }

  public ConfusedTurtle (int x, int y, 
                 ModelDisplay modelDisplayer) 
  {
    // let the parent constructor handle it
    super(x,y,modelDisplayer);
  }
  
  public ConfusedTurtle (ModelDisplay modelDisplay) 
  {
    // let the parent constructor handle it
    super(modelDisplay);
  }
  
  public ConfusedTurtle (Picture p)
  {
    // let the parent constructor handle it
    super(p);
  }
 
  /////////////////// methods ///////////////////////
  
  Random randomLen = new Random();
  Random randomAngle = new Random();
  
  private int len;
  private int angle;
 
  /*Override draw() method in draw pattern of random  
   * sized segments in random directions
   */ 
  public void draw()
  {
    for (int i=0; i<=50; i++)
    {
      len = randomLen.nextInt(300)-150;
      angle = randomAngle.nextInt(360)-360;
      
      this.forward(len);
      this.turn(angle);
    }
  }
  
}// end class