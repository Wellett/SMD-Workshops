/* Author: William Ellett
StudentID: 586703
Last Modified: 9/08/2017
Software Modelling and Design SWEN30006

Description: implementation of the observer interface
*/


public class ObserverClass implements ObserverInterface{
  private int observerID;

  public void notify(EventClass stateChange){
    System.out.printf("Observed state change from %d to %d%n",
    stateChange.getPreviousState(), stateChange.getState());
  }

  //Accessors
  public int getObserverID(){
    return observerID;
  }

  //Mutators
  public void setObserverID(int observerID){
    this.observerID = observerID;
  }
}
