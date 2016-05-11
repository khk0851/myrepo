package com.j1.w11;

public class HomeTheaterTestDrive{
  public static void main(String[] args){
      Amplifier amp = new Amplifier();
      Tuner tuner= new Tuner();
      DvdPlayer dvd =new DvdPlayer();
      Projector projector =new Projector();
      HomeTheaterFacade ht = new HomeTheaterFacade(amp,tuner,dvd,projector);
      ht.watchMovie();
      ht.endMovie();
  }
}