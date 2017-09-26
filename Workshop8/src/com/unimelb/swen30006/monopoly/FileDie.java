package com.unimelb.swen30006.monopoly;

/*Author: William Ellett
Student Number 586703
*/

public class FileDie implements IDie{
  private int faceValue;
  private static final String  FILENAME = "DieRolls.txt";


  public void roll(){
  }

  public int getFaceValue(){
    return faceValue;
  }
}
