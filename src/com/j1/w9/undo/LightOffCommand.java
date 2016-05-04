package com.j1.w9.undo;
public class LightOffCommand {
  Light light;
  public void LightOffCommand(Light light){
  this.light=light;
  }
  public void execute(){
  light.off();
  }
  int level;
  public void undo(){
    light.dim(level);
  }
}