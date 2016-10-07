box[][] boxArray;
int hue;
float pixNum;

void setup(){
  fullScreen();
  //size(500,600);
  colorMode(HSB);
  hue = (int)random(360);
  pixNum = 100;
  boxArray = new box[(int)pixNum][(int)pixNum];
  for(int a = 0; a<boxArray.length; a++)
  for(int b = 0; b<boxArray[a].length; b++)
    boxArray[a][b] = new box(a*(width/pixNum), b*(height/pixNum), hue, pixNum);
}

void draw(){
  for(int a = 0; a<boxArray.length; a++)
  for(int b = 0; b<boxArray[a].length; b++)
    boxArray[a][b].updateDraw();
}

class box{
  
 PVector loc;
 float wSize, hSize, pix;
 int hue;
  
 public box(float x, float y, int hu, float pixNum){
   loc = new PVector(x,y);
   hue = hu;
   pix = pixNum;
   wSize = width/pix;
   hSize = height/pix;
 }
 
 void updateDraw(){
   float bri = dist(loc.x+wSize/2,loc.y+hSize/2,mouseX,mouseY);
   fill(hue, 100, bri);
   rect(loc.x, loc.y, wSize, hSize);
 }
 
 void setColor(int hu){
   hue = hu;
 }
 
}