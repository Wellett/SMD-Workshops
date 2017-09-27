package com.unimelb.swen30006.monopoly;
/*Author: William Ellett
Student Number 586703
*/
import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class FileDie implements IDie{
  private int faceValue;
  private static final String  FILENAME = "DieRolls.txt";
  private Scanner inputRolls;
  private ArrayList<Integer> rolls;
  private Die revertToRandom;

  public FileDie(){
    rolls = new ArrayList<Integer>();

    inputRolls = null;
    try {
      inputRolls = new Scanner(new FileInputStream(FILENAME));
    }
    catch(Exception e) {
      System.out.println("Die Roll File not found");
      System.exit(0);
    }
    while (inputRolls.hasNextInt()){
      rolls.add(inputRolls.nextInt());
    }
    inputRolls.close();
    revertToRandom = new Die();
  }

  // pretty sure coupling this to Die is poor practice,
  // but I'm not sure I can be bothered
  public void roll(){
    if (rolls.size() > 0){
      faceValue = rolls.remove(0);
    }
    else{
      revertToRandom.roll();
      faceValue = revertToRandom.getFaceValue();
    }
  }

  public int getFaceValue(){
    return faceValue;
  }
}
