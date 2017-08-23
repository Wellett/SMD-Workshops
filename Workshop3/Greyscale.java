/* Author: William Ellett
StudentID: 586703
last Modified: 23/8/2017
Programming and Software Development SWEN30006

Workshop3 -implementation of the greyscale thing?
Greyscale Effect
*/

import java.awt.*;
import java.awt.image.BufferedImage;

public class Greyscale implements Effect throws Exception{
  private int width;
  private int height;

  public BufferedImage applyEffect(BufferedImage img){
    try{
      height = img.getHeight();
      width = img.getWidth();

      //Iterate through every pixel changing to greyscale
      for (int i = 0; i < height; i++){
        for (int j = 0; j < width; j++){
          Color c = new Color(img.getRGB(j, i));
          int red = (int)(c.getRed() * 0.299);
          int green = (int)(c.getGreen() * 0.587);
          int blue = (int)(c.getBlue() *0.114);
          int grey = red + green + blue; //set all rgb values to same
          Color newColor = new Color(grey, grey, grey);

          img.setRGB(j,i,newColor.getRGB());
        }
      }
      return img;
    }
  }


}
