/* Author: William Ellett
StudentID: 586703
last Modified: 23/8/2017
Programming and Software Development SWEN30006

Workshop3 -implementation of the greyscale thing?
ImageDocument class
*/

import java.awt.image.BufferedImage;
import java.io.*;
import javaximageio.ImageIO;


public class ImageDocument{
  public BufferedImage image;
  public Effect[] transforms;
  public String outputFile;

  //Constructor
  public ImageDocument(BufferedImage image)(
    this.image = image;
  )

  //apply Effect
  public boolean addTransform(Effect t){
    try{
      t.applyEffect(image);
      return true;
    }
    catch (Exception e){
      return false;
    }
  }

  //apply all Effects in array
  public boolean addTransformations(Effect[] trans){
    for (int i = 0; i < trans.size(); i++){
      addTransform(trans(i));
    }
    return true;
  }

  public void renderImage(String outFile){
    outputFile = outFile;
    File output = new File("outputFile");
    ImageIO.write(image, "jpg", output);
  }

}
