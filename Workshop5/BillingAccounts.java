/* Author: Wiliam Ellett
StudentID: 586703
Last Modified: 1/9/2017
Software Modelling and Design SWEN30006

Workshop 5 Implementation Billing Accounts driver program

*/

public class BillingAccounts{
  public static void main(String[] args){
    //Initialize new account and print account state
    Account customerAcc = new Account();
    customerAcc.printState();

    // approve customer and print new state
    customerAcc.approve();
    customerAcc.printState();

    //test diffeent state transitions
    customerAcc.approve();
    customerAcc.printState();

    customerAcc.complaint();
    customerAcc.printState();

    customerAcc.resolveComplaint();
    customerAcc.printState();

    customerAcc.failPayment();
    customerAcc.printState();

    customerAcc.payAllBills();
    customerAcc.printState();

    customerAcc.failPayment();
    customerAcc.printState();

    customerAcc.closeAccount();
    customerAcc.printState();
  }

}
