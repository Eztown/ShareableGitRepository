class fish extends fishInfo{
  float speed;
  PVector loc;
  PImage fish;
  Boolean isImage = false;
  
  public fish(){
  super();
  speed = -random(.5,4);
  loc = new PVector(random(0,width),random(0+15,height-15));
  }
  
  public fish(boolean a){
  super();
  speed = -random(.5,4);
  loc = new PVector(random(0,width),random(0+15,height-15));
  if(a)
  loadFish();
  }
  
  void loadFish(){
    isImage = true;
    fish = loadImage(super.getType()+".png");
    fish.resize(0,(int)random(8,20));
  }
  
  void move(){
   if(isImage)
   image(fish, loc.x, loc.y); 
   else
   fishDraw();
   
   loc.x += speed;
   if(loc.x>width)
   loc.x = 0;
   if(loc.x<0)
   loc.x = width;
  }
  
  void fishDraw(){
    
  }
  
  boolean getImage(){
   return isImage; 
  }
}