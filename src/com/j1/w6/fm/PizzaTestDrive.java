package com.j1.w6.fm;

public class PizzaTestDrive{
  public static void main(String []args){
    PizzaStore nyStore = new NYPizzaStore();
    Pizza pizza=nyStore.orderPizza("cheese");
    pizza.getName();
  }
}