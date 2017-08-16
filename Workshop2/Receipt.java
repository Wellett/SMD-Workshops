/* Author: William Ellett
StudentID: 586703
Last Modified: 15/8/2017
Software Modelling and Design SWEN30006

Description: receipt class for workshop 2 implementation
*/

public class Receipt{
  private Date submissionDate;
  private int attempt;
  private String email;

  public Receipt(int attempt, Date submissionDate, Student student){
    this.attempt = attempt;
    this.submissionDate = submissionDate;
    this.email = student.getEmail();
  }

  public String toString(){
    String str;
    str = "Submission attmept " + attempt;
    str += "made on " + submissionDate.toString();
    return str;
  }
}
