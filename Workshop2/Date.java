/* Author: William Ellett
StudentID: 586703
Last Modified: 16/8/2017
Software Modelling and Design SWEN30006

Description: simple date class
missing a lot of methods that would be useful in a full implementation
*/

public class Date{
  private int day;
  private int month;
  private int year;

  //Constructor
  public Date(int day, int month, int year){
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

  public String toString(){
    String str;
    str = day + "/" + month + "/" + year;
    return str;
  }

  // Returns +ve int if this date is later than the argument
  //  -ve int if it is earlier, or 0 if they are the same
  public int compareTo(Date cmpDate){
    if (this.year - cmpDate.getYear() != 0){
      return this.year - cmpDate.getYear();
    }
    else if(this.month - cmpDate.getMonth() != 0){
      return this.month - cmpDate.getMonth();
    }
    else{
      return this.day - cmpDate.getDay();
    }
  }

}
