package com.j1.w6;

public class PizzaStore{
  public PizzaStore(SimplePizzaFactory factory){
    this.factory=factory;
  public Pizza orderPizza(String type){
    Pizza pizza=null;
    pizza=factory.createPizza(type);
    pizza.prepare();
    pizza.bake();
    pizza.cut();
    return pizza;
  }
}