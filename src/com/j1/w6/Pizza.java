package com.j1.w6;
  
  abstract public class Pizza{
  String name;
  public String getName(){ /*피자의 이름을 가져오는 함수인 겟네임을 작성*/
    return name;
  }
  public void prepare(){
    System.out.println("preparing "+name);
  }
  public void bake(){
    System.out.println("baking "+name);
  }
  public void cut(){
    System.out.println("cutting "+name);
  }
  public void box(){
    System.out.println("boxing "+name);
  }
}