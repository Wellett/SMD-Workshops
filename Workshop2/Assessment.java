/* Author: William Ellett
StudentID: 586703
Last Modified: 14/8/2017
Software Modelling and Design SWEN30006

Description: Assessment class for workshop 2 implementation
*/

public class Assessment{
  private Date dueDate;
  private int numSubmissions;
  private int maxSubmissions;
  private File instructions;


  // Accessors
  public Date getDueDate(){
    return dueDate;
  }

  public File getInstructions(){
    return instructions;
  }

  // Mutators
  public void setInstructions(File instructions){
    this.instructions = instructions;
  }
}
