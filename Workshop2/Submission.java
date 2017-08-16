/* Author: William Ellett
StudentID: 586703
Last Modified: 15/8/2017
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


  public Submission(File[] submissionFiles, Student student, Assessment
    assessment, int attempt){
    this.files = submissionFiles;
    this.student = student;
    this.assessment = assessment;
    this.attempt = attempt;
  }

  public Submission(Student student, Assessment assessment, int attempt){
    this.student = student;
    this.assessment = assessment;
    this.attempt = attempt;
  }

  public Receipt generateReceipt(){
    Receipt rcpt = new Receipt(attempt, submissionDate, student);
    return rcpt;
  }

  // method from example doesn't even work...
  // fixed, but still fairly trivial
  public File[] generateFiles(){
      File[] files = new File[2];
      files[0] = new File("file1.txt");
      files[1] = new File("file2.txt");
      return files;
  }
}
