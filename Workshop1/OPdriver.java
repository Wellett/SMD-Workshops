/* Author: William Ellett
StudentID: 586703
Last Modified: 9/8/2017
Software Modelling and Design SWEN30006

Description: Driver Program to test the observer pattern implementation
*/

public class OPdriver{

  public static void main(String args[]){
    SubjectClass subject= new SubjectClass();
    ObserverClass observer = new ObserverClass();

    subject.registerObserver(observer);
    subject.updateState();
    subject.updateState();
    subject.derigisterObserver(observer);
    subject.updateState();
  }

}
