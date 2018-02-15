public class SpiralTurtle extends Turtle
{
 ////////////////// constructors ///////////////////////

  public SpiralTurtle (int x, int y, Picture picture) 
  {
    // let the parent constructor handle it
    super(x,y,picture);
  }

  public SpiralTurtle (int x, int y, 
                 ModelDisplay modelDisplayer) 
  {
    // let the parent constructor handle it
    super(x,y,modelDisplayer);
  }
  
  public SpiralTurtle (ModelDisplay modelDisplay) 
  {
    // let the parent constructor handle it
    super(modelDisplay);
  }
  
  public SpiralTurtle (Picture p)
  {
    // let the parent constructor handle it
    super(p);
  }
   /////////////////// methods ///////////////////////
  
  //Override draw method to draw a Spiral
  public void draw()
  {  
    int len = 10;
         
    for (int i = 0; i <=80; i++)
    {
      
      this.forward(len);
      this.turn(15);
  
      len = len + 1;
    }
  }
  
}// end class