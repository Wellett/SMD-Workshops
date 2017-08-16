/* Author: William Ellett
StudentID: 586703
Last Modified: 14/8/2017
Software Modelling and Design SWEN30006

Description: Student Class for Workshop2 implementation
*/

public class Student{
  private String name;
  private int studentID;
  private String email;
  private Receipt lastReceipt;

  //Constructor
  public Student(String name, int studentID, String email){
    this.name = name;
    this.studentID = studentID;
  }

  // accessors
  public String getName(){
    return name;
  }

  public int getStudentID(){
    return studentID;
  }

  public String getEmail(){
    return email;
  }

  public void makeSubmission(Assessment assessment){
    int attempt = assessment.getSubmissionNumber();
    if (attempt != 0){
      Submission newSubmission = new Submission(this, assessment, attempt);
      assessment.addSubmission(newSubmission);
      lastReceipt = newSubmission.generateReceipt();
    }
    // Should really throw an exception but nah
    else {
      System.out.println("Submissions closed");
    }
  }

}
