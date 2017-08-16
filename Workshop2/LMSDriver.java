/* Author: William Ellett
StudentID: 586703
Last Modified: 16/8/2017
Software Modelling and Design SWEN30006

Description: Driver program for Workshop2 LMS example
*/

public class LMSDriver{

  public static void main(String args[]){
    // create student and teacher
    Student Morty = new Student("Morty Smith", 100100, "MortyMcFly@BTF.com");
    Instructor Rick = new Instructor("Rick Sanchez", 102012,
      "Rick@Pickle.com", "Head Tutor");

    //Insructor createsAssessment
    Assessment megaFruit;
    megaFruit = Rick.createAssessment(new Date(31,10,2020), 3);

    //Student submits assignment
    Morty.makeSubmission(megaFruit, new Date(13,10,2020));
    Morty.makeSubmission(megaFruit, new Date(13,10,2020));
    Morty.printLastReceipt();
    Morty.makeSubmission(megaFruit, new Date(14,10,2020));
    Morty.printLastReceipt();
    Morty.makeSubmission(megaFruit, new Date(16,10,2020));
    Morty.printLastReceipt();


  }
}
