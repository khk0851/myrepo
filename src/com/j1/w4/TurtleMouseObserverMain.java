package com.j1.wk4;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import ch.aplu.turtle.*;
import java.awt.geom.Point2D;


class TurtleMouseListener extends Turtle{
  public TurtleMouseListener(){
    addMouseListener(new MouseAdapter(){
      public void mousePressed(MouseEvent e){
        Point2D.Double p;
        p=toTurtlePos(e.getPoint())
        d=distance(p);
        w=towards(p);
        heading(w);
        forward(d);
        setStatusText("moving to"+p.toString());
      }
    });
    addMouseMotionListener(new MouseMotinAdapter(){
      public void mouseDragged(MouseEvent e){
        Point2D.Double p;
        p=toTurtlePos(e.getPoint());
        moveTo(p);
        setStatusText("dragging to"+p,toString());
      }
    });
  }
}
      }
    });
  }
}
public class TurtleMouseObserverMain{
  public static void main(String[] args){
    TurtleMouseListener t= new TurtleMouseListener();
    t.addStatusBar(20);
    t.setStatusText("Click or drag!!");
  }
}