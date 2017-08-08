/* Author: William Ellett
StudentID: 586703
Last Modified: 8/8/2017
Software Modelling and Design SWEN30006

Description: Event Class to be used in the Observer Pattern
*/

public class EventClass{
  private Object state;
  private Object previousState;
  private SubjectInterface subject;

  //Constructors
  public EventClass(Object state, Object previousState,
    SubjectInterface subject){
    this.state =  state;
    this.previousState = previousState;
  }

  public EventClass(Object state){
    this.state = state;
  }

  //Accessors
  public Object getState(){
    return state;
  }

  public Object getPreviousState(){
    return previousState;
  }

  public SubjectInterface getSubject(){
    return subject;
  }
}
