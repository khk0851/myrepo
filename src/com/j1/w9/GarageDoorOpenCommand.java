package com.j1.w9;
public class GarageDoorOpenCommand {
  GarageDoor garageDoor;
  public void GarageDoorOpenCommand(Garage garage){
  this.garage=garage;
  }
  public void execute(){
  garageDoor.up();
  }
}