package com.j1.w11;

public class Coffee{
  void prepareRecipe(){
    boilWater();
    brewCoffeeGrinds();
    pourInCup();
    addSugarAndMilk();
  }
  public void boilWater(){
   System.out.println("Boilling Water")
  }
  public void brewCoffeeGrinds(){
   System.out.println("brewCoffeeGrinds")
  }
  public void pourInCup(){
    System.out.println("pourInCup")
  }
  public void addSugarAndMilk(){
    System.out.println("addSugarAndMilk")
  }
}