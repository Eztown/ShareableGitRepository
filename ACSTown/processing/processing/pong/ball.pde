class ball{
   PVector loc, dir;
   float ballSize, speed;
   
  
   public ball(){
     loc = new PVector(width/2, height/2);
     dir = new PVector(0,5);
     dir.normalize();
     dir.random2D(dir);
     ballSize=10;
     speed = 2;
   }
   
   void go(){
   pushMatrix();
   translate(loc.x,loc.y);
   ellipseMode(CENTER);
   fill(255);
   ellipse(0,0,ballSize,ballSize);
   for(int a = 0; a<speed; a++){
   loc.add(dir);
   //if((loc.x-balloonSize/2<=0||loc.x+balloonSize/2>=width)||(loc.y-balloonSize/2<=0||loc.y+balloonSize/2>=height))
   //dir.rotate(180);
   }
   popMatrix();
 }
 
 void bounce(PVector a, PVector b, int paddleS){
   if((loc.y>a.y && loc.y<a.y+paddleS)||(loc.y>b.y&&loc.y<b.y+paddleS))
   if((loc.x-ballSize/2<=a.x+5&&loc.x>a.x+5)||(loc.x+ballSize/2>=b.x&&loc.x<b.x+5))
   dir.rotate(180);
   if((loc.y-ballSize/2<=0||loc.y+ballSize/2>=height))
   dir.rotate(180);
 }
 
 boolean reset(){
   if(loc.x<0||loc.x>width)
   return true;
   else
   return false;
 }
}