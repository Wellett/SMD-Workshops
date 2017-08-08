/* Author: William Ellett
StudentID: 586703
Last Modified: 8/8/2017
Software Modelling and Design SWEN30006

Description: Subject class for observer pattern implementation
Stores an int to represent state of the Subject
*/

public class SubjectClass implements SubjectInterface{
  private static final int MAX_SUBSCRIBERS = 100;
  private int state;
  private int numObservers;
  private ObserverInterface[] obsevers;
  private int newID;

  //Constructors
  public SubjectClass(){
    state = 0;
    numObservers = 0;
    observers = new ObserverInterface[MAX_SUBSCRIBERS];
    newID = 1;
  }

  //Accessors
  public int getState(){
    return state;
  }

  //Modifiers
  //Add new observer and issue observerID
  public int registerObserver(ObserverInterface newObserver){
    observers[numObservers] = newObserver;
    numObservers++;
    return newID;
  }

  //ooh this bit is actually a bit difficult...
  public void derigisterObserver(ObserverInterface deregObserver){

    for (int i = 0; i < numObservers; i++){
      
    }
  }


}
