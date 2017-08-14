/* Author: William Ellett
StudentID: 586703
Last Modified: 14/8/2017
Software Modelling and Design SWEN30006

Description: Student Class for Workshop2 implementation
*/

public class Student{
  private String name;
  private int studentID;

  //Constructor
  public Student(String name, int studentID){
    this.name = name;
    this.studentID = studentID;
  }

  // accessors
  public String getName(){
    return name;
  }

  public int getStudentID(){
    return studentID;
  }


}
