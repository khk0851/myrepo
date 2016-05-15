package com.j1.w11.smart;
public class SmartFacade{
  private Stand stand;
  private Pc pc;
  private Note note;

  public SmartFacade(Stand stand,Note note,Pc pc){
    this.stand=stand;
    this.note=note;
    this.pc=pc;
  }
  public void startStudy(){
    System.out.println("Get ready to study,,,");
    pc.on();
    pc.ingang();
    note.on();
    stand.on();
    stand.setLight(5);
  }
  public void endStudy(){
    System.out.println("Homework done!");
    pc.off();
    note.off();
    stand.off();
  }
}