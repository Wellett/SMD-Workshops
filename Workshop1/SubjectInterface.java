/* Author: William Ellett
StudentID: 586703
Last Modified: 8/8/2017
Software Modelling and Design SWEN30006

Description: Subject interface for the observer pattern
*/

public interface SubjectInterface{
  public int registerObserver(ObserverInterface observer);
  public void derigisterObserver(ObserverInterface observer);
  public void notifyAll(EventClass event);
}
