import java.awt.*;

public class BaleOfTurtles{
  
  public static void main(String[] args){
    
    World mars = new World(700,700);
    Color c = new Color (0,0,255);
    
    ConfusedTurtle x = new ConfusedTurtle(mars);
    SpiralTurtle y = new SpiralTurtle (mars);
    SmartTurtle z = new SmartTurtle (mars);
    
    Turtle [] tArray = {x,y,z};
    
    for (Turtle t:tArray)
    {
      t.draw(c);
    }
  }//end main

}//end class