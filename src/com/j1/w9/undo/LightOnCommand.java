package com.j1.w9.undo;
public class LightOnCommand {
  Light light;
  int level;
  public void LightOnCommand(Light light){
  this.light=light;
  }
  public void execute(){
  light.on();
  level =light.getLevel();
  }
  public void undo(){
    light.dim(level);
  }
}