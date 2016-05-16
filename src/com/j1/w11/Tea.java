package com.j1.w11;
public class Tea{
  void prepateRecipe(){
    boilWater();
    steepTeaBag();
    pourInCup();
    addLemon();
  }
  public void boilWater(){
   System.out.println("Boilling Water");
  }
  public void steepTeaBag(){
    System.out.println("steepTeaBag");
  }
  public void pourInCup(){
    System.out.println("pourInCup");
  }
  public void addLemon(){
    System.out.println("addLemon");
  }
}