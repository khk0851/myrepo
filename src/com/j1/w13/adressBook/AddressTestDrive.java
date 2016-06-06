package com.j1.w13.adressBook;


public class AddressTestDrive{
  public static void main(String [] args){
    persons[] test = new persons[100];
    addressBook T = new addressBook(testbook);
    String status="1";
    while(status != "4"){
      status = T.startProcess();
      switch(status){
        case "1":
          T.add();
          break;
        case "2":
          T.delete();
          break;
        case "3":
          T.print();
          break;
      }
    }
  }
}