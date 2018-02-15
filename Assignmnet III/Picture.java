//Shu Ou

import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * Copyright Georgia Institute of Technology 2004-2005
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
  ///////////////////// constructors //////////////////////////////////
  
  /**
   * Constructor that takes no arguments 
   */
  public Picture ()
  {
    /* not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor 
     */
    super();  
  }
  
  /**
   * Constructor that takes a file name and creates the picture 
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName)
  {
    // let the parent class handle this fileName
    super(fileName);
  }
  
  /**
   * Constructor that takes the width and height
   * @param width the width of the desired picture
   * @param height the height of the desired picture
   */
  public Picture(int width, int height)
  {
    // let the parent class handle this width and height
    super(width,height);
  }
  
  /**
   * Constructor that takes a picture and creates a 
   * copy of that picture
   */
  public Picture(Picture copyPicture)
  {
    // let the parent class do the copy
    super(copyPicture);
  }
  
  /**
   * Constructor that takes a buffered image
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image)
  {
    super(image);
  }
  
  ////////////////////// methods ///////////////////////////////////////
  
  /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
  public String toString()
  {
    String output = "Picture, filename " + getFileName() + 
      " height " + getHeight() 
      + " width " + getWidth();
    return output;  
  }
  
  //Method to increase the amount of red by 30%
  public void increaseRed()
  {
    Pixel[] pixelArray = this.getPixels();
    Pixel pixel = null;
    int value = 0;
    int index = 0;
    
    while(index < pixelArray.length)
    {
      pixel = pixelArray[index];
      value = pixel.getRed();
      value=(int)(value*1.3);
      pixel.setRed(value);
      
      index++;
    }
  }
  //increaseRed Method with constructor increaseFactor 
  public void increaseGreen(double increaseFactor)
  {
    Pixel[] pixelArray = this.getPixels();
    Pixel pixel = null;
    int value = 0;
    int index = 0;
    
    while(index < pixelArray.length)
    {
      pixel = pixelArray[index];
      value = pixel.getRed();
      value=(int)(value*increaseFactor);
      pixel.setRed(value);
      
      index++;
    }
  }
  
  //Method to increase the amount of green by 30%
  public void increaseGreen()
  {
    Pixel[] pixelArray = this.getPixels();
    Pixel pixel = null;
    int value = 0;
    int index = 0;
    
    while(index < pixelArray.length)
    {
      pixel = pixelArray[index];
      value = pixel.getGreen();
      value=(int)(value*1.3);
      pixel.setGreen(value);
      
      index++;
    }
  }
  
  //increaseGreen Method with constructor increaseFactor 
  public void increaseRed(double increaseFactor)
  {
    Pixel[] pixelArray = this.getPixels();
    Pixel pixel = null;
    int value = 0;
    int index = 0;
    
    while(index < pixelArray.length)
    {
      pixel = pixelArray[index];
      value = pixel.getGreen();
      value=(int)(value*increaseFactor);
      pixel.setGreen(value);
      
      index++;
    }
  }
  
  //Method to increase the amount of blue by 30%
  public void increaseBlue()
  {
    Pixel[] pixelArray = this.getPixels();
    Pixel pixel = null;
    int value = 0;
    int index = 0;
    
    while(index < pixelArray.length)
    {
      pixel = pixelArray[index];
      value = pixel.getBlue();
      value=(int)(value*1.3);
      pixel.setBlue(value);
      
      index++;
    }
  }
  
  //increaseBlue Method with constructor increaseFactor 
  public void increaseBlue(double increaseFactor)
  {
    Pixel[] pixelArray = this.getPixels();
    Pixel pixel = null;
    int value = 0;
    int index = 0;
    
    while(index < pixelArray.length)
    {
      pixel = pixelArray[index];
      value = pixel.getBlue();
      value=(int)(value*increaseFactor);
      pixel.setBlue(value);
      
      index++;
    }
  }
  
  //Blurring Method
  public void blur(int numPixels, int x, int y, int height, int width)
  {
    int picHeight = this.getHeight();
    int picWidth = this.getWidth();
    Pixel pixel = null;
    Pixel samplePixel = null;
    int redValue = 0;
    int greenValue = 0;
    int blueValue = 0;
    int count = 0;
    
    int blurWidth = x + width;
    int blurHeight = y + height;
    
    if (x >=0 && x <=picWidth && y >= 0 && y <=picHeight && blurWidth <= picWidth && blurHeight <= picHeight)
    {
      for (int i = x; i < blurWidth; i++)
       {
        for (int j = y; j < blurHeight; j++)
        {
          pixel=this.getPixel(i,j);
          count = 0;
          redValue = greenValue = blueValue = 0;
        
          for (int xSample = i - numPixels; xSample <= i + numPixels; xSample++)
          {
            for (int ySample = j - numPixels; ySample <= j + numPixels; ySample++)
            {
              if(xSample >= 0 && xSample < blurWidth && ySample >= 0 && ySample < blurHeight)
              {
                samplePixel = this.getPixel(xSample, ySample);
                redValue = redValue + samplePixel.getRed();
                greenValue = greenValue + samplePixel.getGreen();
                blueValue = blueValue + samplePixel.getBlue();
              
                count = count +1;
              }
            }  
          }
      
          Color newColor = new Color (redValue/count, greenValue/count, blueValue/count);
          pixel.setColor(newColor);
        }
      }
    }
    
    else
    {
      System.out.println("There is(are) error(s) in your inputs. x & y must be larger or equal to zero, height & width you want to blur must be within picture height & width");
      System.out.println(this.toString());
                           
    }
  }
  //Method to clear all red components in picture
  public void clearRed()
  {
    Pixel[] pixelArray = this.getPixels();
    int count = 0;
    
    while( count < pixelArray.length)
    {
      pixelArray[count].setRed(0);
      count = count + 1;
    }
  }

//main method
  public static void main(String[] args)
  {
    String picPath = FileChooser.pickAFile();
    Picture p = new Picture(picPath);
    
    p.increaseRed();
    p.increaseRed(1.5);
    
    p.increaseGreen();
    p.increaseGreen(1.5);
    
    p.increaseBlue();
    p.increaseBlue(1.5);
    
    p.blur(10, 0, 0, 100, 300);
    
    p.clearRed();
    
    p.explore();
  }
  
} // this } is the end of class Picture, put all new methods before this
 