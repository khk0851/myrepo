package com.j1.w11;

public class HomeTheaterTestDrive{
  public static void main(String[] args){
      Stand stand = new Stand();
      Pc pc = new Pc();
      Note note = new Note();
      SmartFacade sm = new SmartFacade();
      sm.startStudy();
      sm.endStudy();
  }
}