/* Author: William Ellett
StudentID: 586703
Last Modified: 14/8/2017
Software Modelling and Design SWEN30006

Description: simple date class
missing a lot of methods that would be useful in a full implementation
*/

public class Date{
  private int day;
  private int month;
  private int year;

  //Constructor
  public date(int day, int month, int year){
    this.day = day;
    this.month = month;
    this.year = year;
  }

  // accessors
  public int getDay(){
    return day;
  }

  public int getMonth(){
    return month;
  }

  public int getYear(){
    return year;
  }

}
