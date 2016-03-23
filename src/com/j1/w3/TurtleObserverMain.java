pakage com.j1.w3;
import ch.aplu.turtle.*;
import java.util.Observer;
import java.util.Observable;

public class TurtleObserverMain{
  public static void main(Stringp[] args){
    BabyTurtle baby=new BabyTurtle();
    MomTurtle=new MomTurtle();
    baby.addObserver(mom);
    mom.moveTo(100,100);
    baby.moveTo(100,-100);
    baby.setChanged();
    baby.notifyObservers();
  }
}
class MomTurtle extends Turtle implements Observer{
  Double babyCurpos;
  public void updata(Observable o,Object arg ){
    System.out.println("update() called,count is"+((Integer)arg).intvalue());
    babyCurpos=((BabyTurtle)o).myCurpos;
    System.out.println("current pos"+babyCurpos);
    moveTo(babyCurpos);
  }
}

class BabyTurtle extends Observable {
  Turtle baby;
  Double myCurpos;
  ArrayList<Observer>obs;
  public BabyTurtle(){
  baby=new Turtle();
  myCurpos=baby.getPos();
  obs=new ArrayList<Observer>();
  }
  public void addObserver(Observer o){
    obs.add(0);
  }
  protected void setChanged(){
    myCurpos=baby.getPos();
  }
  public void notifyObservers(){
    for (Observer o:obs)
      o.update(this,1);
  public void move(int x,int y){
     baby.moveTo(x,y);
  }
}
    