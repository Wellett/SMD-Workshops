/* Author: William Ellett
StudentID: 586703
last Modified: 23/8/2017
Programming and Software Development SWEN30006

Workshop3 -implementation of the greyscale thing?
Image Loader class
*/

import java.io.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

public class ImageLoader{
  private String filename;

  //Constructor
  public ImageLoader(String file){
    this.filename = file;
  }

  //reads an image from file and returns new image document
  public ImageDocument loadImage(){
    File input = new File(filename);
    BufferedImage image = ImageIO.read(input);
    return new ImageDocument(image);
  }

  //Writes image
  public void writeImage(Image image, String outputFile){
    File output = new File(outputFile);
    ImageIO.write(image, "jpg", output);
  }

}
