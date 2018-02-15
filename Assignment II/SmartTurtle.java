public class SmartTurtle extends Turtle
{
 ////////////////// constructors ///////////////////////

  public SmartTurtle (int x, int y, Picture picture) 
  {
    // let the parent constructor handle it
    super(x,y,picture);
  }

  public SmartTurtle (int x, int y, 
                 ModelDisplay modelDisplayer) 
  {
    // let the parent constructor handle it
    super(x,y,modelDisplayer);
  }
  
  public SmartTurtle (ModelDisplay modelDisplay) 
  {
    // let the parent constructor handle it
    super(modelDisplay);
  }
  
  public SmartTurtle (Picture p)
  {
    // let the parent constructor handle it
    super(p);
  }  
  
   /////////////////// methods ///////////////////////
  
  //Override draw method to draw a star
  public void draw()
  {
    int len = 50;
    
    this.forward(len);
    this.turn(144);
  
    this.forward(len);
    this.turn(144);
  
    this.forward(len);
    this.turn(144);
  
    this.forward(len);
    this.turn(144);
  
    this.forward(len);
    this.turn(144); 
  }
  
}// end class