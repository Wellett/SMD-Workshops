/* Author: William Ellett
StudentID: 586703
Last Modified: 15/8/2017
Software Modelling and Design SWEN30006

Description: Assessment class for workshop 2 implementation
*/

public class Assessment{
  private Date dueDate;
  private int numSubmissions;
  private int maxSubmissions;
  private File instructions;
  private Submission[] submissions;


  //Constructor
  public Assessment(Date dueDate, int maxSubmissions, File instructions){
    this.dueDate = dueDate;
    this.maxSubmissions = maxSubmissions;
    this.numSubmissions = 0;
    this.Instructions;
    this.submissions = new Submission[maxSubmissions];
  }

  // Accessors
  public Date getDueDate(){
    return dueDate;
  }

  public File getInstructions(){
    return instructions;
  }

  public int getSubmissionNumber(){
    if (numSubmissions < maxSubmissions){
      return numSubmissions + 1;
    }
    else {
      return 0;
    }
  }

  // Mutators
  public void setInstructions(File instructions){
    this.instructions = instructions;
  }

  public void addSubmission(Submission newSubmission){
    submissions[numSubmissions] = newSubmission;
    numSubmissions ++;
  }
}
