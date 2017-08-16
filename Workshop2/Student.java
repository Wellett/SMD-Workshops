/* Author: William Ellett
StudentID: 586703
Last Modified: 16/8/2017
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

  public void printLastReceipt(){
    System.out.println(lastReceipt);
  }

  public void makeSubmission(Assessment assessment, Date submissionDate){
    int attempt = assessment.getSubmissionNumber(submissionDate);
    if (attempt != 0){
      Submission newSubmission;
      newSubmission = new Submission(this, assessment, attempt, submissionDate);
      assessment.addSubmission(newSubmission);
      lastReceipt = newSubmission.generateReceipt();
    }
    // Should really throw an exception but nah
    else {
      System.out.println("Submissions closed");
    }
  }

}
