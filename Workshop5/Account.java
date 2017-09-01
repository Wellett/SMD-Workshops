/* Author: Wiliam Ellett
StudentID: 586703
Last Modified: 30/8/2017
Software Modelling and Design SWEN30006

Workshop 5 Implementation Account Class

*/

public class Account{

  private AccountState state;

//Constructor
  public Account(){
    this.state = AccountState.PENDING;
  }

  //MUTATORS
  //state transitions

  //approval
  public void approval(){
    if ((state == AccountState.PENDING)||state == AccountState.CLOSED){
      state = AccountState.ACTIVE;
    }
    else{
      System.out.println("Invalid state change");
    }
  }

  //complaint
  public void complaint(){
    if (state == AccountState.ACTIVE){
      state = AccountState.PRIORITY;
    }
    else{
      System.out.println("Invalid state change");
    }
  }

  //resolve complaint
  public void resolveComplaint(){
    if (state == AccountState.PRIORITY){
      state = AccountState.ACTIVE;
    }
    else{
      System.out.println("Invalid state change");
    }
  }

  //fail payment
  public void failPayment(){
    if (state == AccountState.ACTIVE){
      state = AccountState.DEFAULT;
    }
    else{
      System.out.println("Invalid state change");
    }
  }

  //pay all bills
  public void payAllBills(){
    if (state == AccountState.DEFAULT){
      state = AccountState.ACTIVE;
    }
    else{
      System.out.println("Invalid state change");
    }
  }

  //close Account
  public void closeAccount(){
    if (state == AccountState.DEFAULT){
      state = AccountState.CLOSED;
    }
    else{
      System.out.println("Invalid state change");
    }
  }

  public void printState(){
    System.out.println("Account is " + state.toString());
  }


}
