/* Author: William Ellett
StudentID: 586703
Last Modified: 14/8/2017
Software Modelling and Design SWEN30006

Modified Submission class for the workshop 2 implementation
*/

import java.io.File;

public class Submission {
  private Date submissionDate;
  private int attempt;
  private File[] files;
  private Student student;
  private Assessment assessment;

  
  public Submission(){

  }


  // method from example
  public File[] generateFiles(){
      File[] files = new File[2];
      files[0] = new File();
      files[1] = new File();
      return files;
  }
}
