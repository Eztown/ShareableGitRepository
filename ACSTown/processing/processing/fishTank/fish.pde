class fish extends fishInfo{
  float speed;
  PVector loc;
  PImage fish;
  
  public fish(){
  super();
  speed = -random(.5,4);
  loc = new PVector(random(0,width),random(0+15,height-15));
  fish = loadImage(super.getType()+".png");
  fish.resize(0,(int)random(8,20));
  }
  
  void drup(){
   image(fish, loc.x, loc.y); 
   textSize(10);
   text(super.getName(),loc.x-15,loc.y);
   loc.x += speed;
   if(loc.x>width)
   loc.x = 0;
   if(loc.x<0)
   loc.x = width;
  }
}