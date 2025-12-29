/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;
import java.util.*;
/**
 
 * @author Krushna
 */
class ATM{
    String AccountHolder_Name;
    int Acc_No,Balance;

    public String getAccountHolder_Name() {
        return AccountHolder_Name;
    }

    public void setAccountHolder_Name(String AccountHolder_Name) {
        this.AccountHolder_Name = AccountHolder_Name;
    }

    public int getAcc_No() {
        return Acc_No;
    }

    public void setAcc_No(int Acc_No) {
        this.Acc_No = Acc_No;
    }

    public int getBalance() {
        return Balance;
    }

    public void setBalance(int Balance) {
        this.Balance = Balance;
    }
    public void deposit(int bal){
        Balance=Balance+bal;
    }
    public void withdraw(int bal){
        if(bal<=Balance){
                    Balance=Balance-bal;
        }
        else
        {
            System.out.println("enter correct amount");
        }
    }
    
}

public class Mavenproject1 {
    public static void main(String[] args) {
        ATM obj=new ATM();
        int ch,bal,acc_no;
        String acc_name;
        while(true){
            Scanner sc=new Scanner(System.in);
            System.out.println("1.Create An Account");
            System.out.println("2.Deposit");
            System.out.println("3.WithDraw");
            System.out.println("4.Check Balance");
            System.out.println("\nEnter Choice:");
            ch=sc.nextInt();

            switch(ch) {
                case 1:
                    System.out.print("Enter Name:");
                    acc_name=sc.next(); 
                    System.out.print("Enter Account Number:");
                    acc_no=sc.nextInt();
                    System.out.print("Enter Opening Balance:");
                    bal=sc.nextInt();
                    obj.setAccountHolder_Name(acc_name);
                    obj.setAcc_No(acc_no);
                    obj.setBalance(bal);
                    break;
                case 2:
                    System.out.print("Enter Deposit Balance:");
                    bal=sc.nextInt();
                    obj.deposit(bal);
                    System.out.println("Total Balance:"+obj.getBalance());
                    break;
                case 3:
                       System.out.println("Enter Withdrawal Amount:");
                       bal=sc.nextInt();
                       obj.withdraw(bal);
                       System.out.println("Total Balance:"+obj.getBalance());
                       break;
                case 4:
                    System.out.println("Total Balance:"+obj.getBalance());
                    break;
                default:
                    throw new AssertionError();
            }
        }
    }    
  }

