package com.sd.turtle;

import java.awt.Color;
import ch.aplu.turtle.*;

public class WeightTurtleMain{
  public static void main(String[] args){
    WeightTurtle wt=new WeightTurtle(10);
    System.out.println("hello WeightTurtle");
    wt.addStatusBar(30);
    String msg="Hello Weight"+wt.getWeight()+"kg";
    wt.setStatusText(msg);
  }
}