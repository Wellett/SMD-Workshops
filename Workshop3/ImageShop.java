/* Author: William Ellett
StudentID: 586703
last Modified: 23/8/2017
Programming and Software Development SWEN30006

Workshop3 -implementation of the greyscale thing?
Image Shop program
*/

public class ImageShop{
  private ImageDocument imageDoc;

  public static void main(String args[]){
    //initialize imageDoc
    ImageLoader loader = new ImageLoader("string thing");
    imageDoc = loader.loadImage();
    //inititalize library
    EffectLibrary library = new EffectLibrary();

    imageDoc.addTransform(library.getEffect("Greyscale"));

    loader.writeImage(imageDoc)

  }



/*
  private Effect[] processTransforms(String args[]){

  }

  private void processImage(String image, Effect[] transforms){

  }
*/

}
