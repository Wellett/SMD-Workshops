/* Author: William Ellett
StudentID: 586703
last Modified: 23/8/2017
Programming and Software Development SWEN30006

Workshop3 -implementation of the greyscale thing?
Effect Interface
*/

import java.awt.image.BufferedImage;

public interface Effect{
  public BufferedImage applyEffect(BufferedImage img);
}
