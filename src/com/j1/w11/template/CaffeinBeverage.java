package com.j1.w11.template;
public abstract class CaffeinBeverage{
  public final void prepareRecipe(){
    boilWater();
    brew();
    pourInCup();
    addCondiments();
  }
  void boilWater(){
  System.out.println("Boilling water...");
  }
  void pourInCup(){
    System.out.println("Pouring into cup")
  }
  abstract void brew();
  abstract void addCondiments();
  

}