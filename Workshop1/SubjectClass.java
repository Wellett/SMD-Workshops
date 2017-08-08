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
  private ObserverInterface[] observers;
  private int newID;

  //Constructors
  public SubjectClass(){
    state = 0;
    numObservers = 0;
    observers = new ObserverInterface[MAX_SUBSCRIBERS];
    newID = 0;
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
    newID ++;
    return newID;
  }

  //ooh this bit is actually a bit difficult...
  //remove observer from observer database
  public void derigisterObserver(ObserverInterface deregObserver){
    for (int i = 0; i < numObservers; i++){
      if(matchObserver(deregObserver, observers[i])){
        removeObserver(i);
        break;
      }
    }
  }

  //Checks to see if two observers have matching ID
  private boolean matchObserver(ObserverInterface observer1, ObserverInterface
  observer2){
    if (observer1.getObserverID() == observer2.getObserverID()){
      return true;
    }
    return false;
  }

  //Does not necessarily erase observer, only rewrites by shifting objects
  //in array
  private void removeObserver(int index){
    for (int i = index; i < numObservers; i++){
      observers[i] = observers[i + 1];
    }
    numObservers--;
  }

  //Notifies all subscribers of a state change
  public void notifyAll(EventClass event){
    for (int i = 0; i < numObservers; i++){
      observers[i].notify(event);
    }
  }

  //increment state and notify
  public void updateState(){
    int previousState = state; //local variable to be discarded after update
    state++;
    EventClass stateChange = new EventClass(state, previousState);
    notifyAll(stateChange);
  }
}
