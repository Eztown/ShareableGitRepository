ArrayList<balloon> balloonList = new ArrayList<balloon>();

void setup(){
  fullScreen();
  //size(500,500);
  colorMode(HSB);
}

void draw(){
  background(0);
  println(frameRate+", "+millis()+", "+balloonList.size());
  for(balloon a: balloonList)
  a.go();
}

void keyPressed(){
  balloonList.add(new balloon());
}

void mousePressed(){
  for(int a = 0; a<balloonList.size();a++){
   if(balloonList.get(a).isHit())
     balloonList.remove(a);
  }
}