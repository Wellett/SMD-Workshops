/* Author: William Ellett
Student ID: 586703
Last Modified: 9/8/2017
Software Modelling and Design SWEN30006

Description: Interface for a basic implementation of the Observer Pattern
*/
public interface ObserverInterface{
  public void notify(EventClass observer);
  public int getObserverID();
  public void setObserverID(int observerID);
}
