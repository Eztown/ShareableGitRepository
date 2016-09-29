import java.awt.event.*;

ball ball;
player p1, p2;

void setup(){
  //fullScreen();
  size(500,500);
  ball = new ball();
  p1 = new player(0);
  p2 = new player(1);
}

void draw(){
 background(0);
 ball.go();
 p1.go();
 p2.go();
 ball.bounce(p1.getLoc(),p2.getLoc(),p1.getSize());
 if(ball.reset())
 ball = new ball();
}

void keyPressed(){
 switch(key){
  case 'w':
  p1.up();
  break;
  case 's':
  p1.down();
  break;
  case 'i':
  p2.up();
  break;
  case 'k': 
  p2.down();
  break;
 }
}