/* Author: William Ellett
StudentID: 586703
Last Modified: 14/8/2017
Software Modelling and Design SWEN30006

Description: receipt class for workshop 2 implementation
*/

public class Receipt{
  private Date submissisonDate;
  private int attempt;
  private String email;

  public Receipt(int attempt, Date submissionDate){
    this.attempt = attempt;
    this.submissionDate = submissionDate;
  }

  public String toString(){
    String str;
    str = "Submission attmept " + attempt;
    str += "made on " + submissionDate.toString();
    return str;
  }
}
