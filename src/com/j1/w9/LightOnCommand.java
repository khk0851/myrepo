package com.j1.w9;
public class LightOnCommand {
  Light light;
  public void LightOnCommand(Light light){
  this.light=light;
  }
  public void execute(){
  light.on();
  }
}