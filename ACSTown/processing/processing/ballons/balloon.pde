class balloon{
 PVector loc, dir;
 int balloonColor;
 float balloonSize, speed;
 
 public balloon(){
 loc = new PVector(random(20,width-20),random(20,height-20));
 dir = new PVector(0,5);
 dir.normalize();
 dir.random2D(dir);
 balloonColor = (int)random(0,300);
 balloonSize = random(20,50);
 speed = random(5,10);
 }
 
void go(){
   pushMatrix();
   translate(loc.x,loc.y);
   ellipseMode(CENTER);
   fill(balloonColor,100,100);
   ellipse(0,0,balloonSize,balloonSize);
   for(int a = 0; a<speed; a++){
   loc.add(dir);
   if((loc.x-balloonSize/2<=0||loc.x+balloonSize/2>=width)||(loc.y-balloonSize/2<=0||loc.y+balloonSize/2>=height))
   dir.rotate(180);
   }
   popMatrix();
 }
 
 boolean isHit(){
  if(dist(mouseX,mouseY,loc.x, loc.y)<balloonSize/2)
    return true;
  else
    return false;
 }

}