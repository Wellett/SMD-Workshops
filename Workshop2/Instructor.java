/* Author: William Ellett
StudentID: 586703
Last Modified: 14/8/2017
Software Modelling and Design SWEN30006

Description: Instuctor class for workshop 2 implementation
*/

public class Instructor{
  private String name;
  private int staffID;
  private String position;
  private String email;

  // Constructor
  public Instructor(String name, int staffID, String email, String position){
    this.name = name;
    this.staffID = staffID;
    this.email = email;
    this.position = position;
  }

  //accessors
  public String getName(){
    return name;
  }

  public int getStaffID(){
    return staffID;
  }

  public String getPosition(){
    return position;
  }

  public String getEmail(){
    return email;
  }

}
