PImage textur;
PVector origi;
String axi = "CAB";
int siz = 200;
float factor = .999;

void setup(){
 //size(500,500);
 fullScreen();
 origi = new PVector(width/2,height/2);
 textur = loadImage("texture.png");
 textur.resize(siz,siz);
 imageMode(CENTER);
 fill(1);
 background(0);
 cloud(origi, textur, axi, siz, 0);
 //dirs 0 - orig, 1 - up, 2 - down, 3 - left, 4 - right
}

void draw(){
}

void mouseReleased(){
  String temp = "";
  for(int a = 0; a<axi.length(); a++){
    char t = axi.charAt(a);
    if(t=='A'){
      //temp += "AB";
      int rand = millis()%4;
      for(int b = 0; b<rand+1; b++)
      temp += "AB";
    }
    else if(t=='B'){
      temp += "A";
    }
    else{
      temp += "C";
    }
  }
  axi = temp;
  background(0);
  cloud(origi, textur, axi, siz, 0);
}

void keyPressed(){
  if(key=='r'){
    axi = "CA";
    factor = random(.5,1);
    mouseReleased();
  }
}

PVector cloud(PVector trans, PImage text, String axiom, int size, int dir){
  if(axiom.length()>1&&size>1){
  char t = axiom.charAt(0);
   if(t=='A'){
     translate(trans.x,trans.y);
     image(text, 0, 0);
     
     PImage textTem = text.copy();
     textTem.resize(size/2, size/2);
     int sizeTem = (int)(size/factor);
     PVector unTrans;
     String axiomTem = axiom.substring(1);
     
     switch(dir){
       case 1:
       //up
       unTrans = cloud(new PVector(0,sizeTem), textTem, axiomTem, size/2, 1);
       translate(-unTrans.x, -unTrans.y);
       //left
       unTrans = cloud(new PVector(-sizeTem,0), textTem, axiomTem, size/2, 3);
       translate(-unTrans.x, -unTrans.y);
       //right
       unTrans = cloud(new PVector(sizeTem,0), textTem, axiomTem, size/2, 4);
       translate(-unTrans.x, -unTrans.y);
       break;
       case 2:
       //down
       unTrans = cloud(new PVector(0,-sizeTem), textTem, axiomTem, size/2, 2);
       translate(-unTrans.x, -unTrans.y);
       //left
       unTrans = cloud(new PVector(-sizeTem,0), textTem, axiomTem, size/2, 3);
       translate(-unTrans.x, -unTrans.y);
       //right
       unTrans = cloud(new PVector(sizeTem,0), textTem, axiomTem, size/2, 4);
       translate(-unTrans.x, -unTrans.y);
       break;
       case 3:
       //up
       unTrans = cloud(new PVector(0,sizeTem), textTem, axiomTem, size/2, 1);
       translate(-unTrans.x, -unTrans.y);
       //down
       unTrans = cloud(new PVector(0,-sizeTem), textTem, axiomTem, size/2, 2);
       translate(-unTrans.x, -unTrans.y);
       //left
       unTrans = cloud(new PVector(-sizeTem,0), textTem, axiomTem, size/2, 3);
       translate(-unTrans.x, -unTrans.y);
       break;
       case 4:
       //up
       unTrans = cloud(new PVector(0,sizeTem), textTem, axiomTem, size/2, 1);
       translate(-unTrans.x, -unTrans.y);
       //down
       unTrans = cloud(new PVector(0,-sizeTem), textTem, axiomTem, size/2, 2);
       translate(-unTrans.x, -unTrans.y);
       //right
       unTrans = cloud(new PVector(sizeTem,0), textTem, axiomTem, size/2, 4);
       translate(-unTrans.x, -unTrans.y);
       break;
     }
   }
   else if(t=='B'){
     translate(trans.x,trans.y);
     image(text, 0, 0);
     
     PImage textTem = text.copy();
     textTem.resize(size/2, size/2);
     int sizeTem = (int)(size/factor);
     PVector unTrans;
     String axiomTem = axiom.substring(1);
     
     if(dir == 1 || dir == 2){
       //left
       unTrans = cloud(new PVector(-sizeTem,0), textTem, axiomTem, size/2, 3);
       translate(-unTrans.x, -unTrans.y);
       //right
       unTrans = cloud(new PVector(sizeTem,0), textTem, axiomTem, size/2, 4);
       translate(-unTrans.x, -unTrans.y);
     }
     if(dir == 3 || dir == 4){
       //up
       unTrans = cloud(new PVector(0,sizeTem), textTem, axiomTem, size/2, 1);
       translate(-unTrans.x, -unTrans.y);
       //down
       unTrans = cloud(new PVector(0,-sizeTem), textTem, axiomTem, size/2, 2);
       translate(-unTrans.x, -unTrans.y);
     }
   }
   else if(t=='C'){
     translate(trans.x,trans.y);
     image(text, 0, 0);
     PImage textTem = text.copy();
     textTem.resize(size/2, size/2);
     int sizeTem = (int)(size/factor);
     PVector unTrans;
     String axiomTem = axiom.substring(1);
     
     //up
     unTrans = cloud(new PVector(0,sizeTem), textTem, axiomTem, size/2, 1);
     translate(-unTrans.x, -unTrans.y);
     //down
     unTrans = cloud(new PVector(0,-sizeTem), textTem, axiomTem, size/2, 2);
     translate(-unTrans.x, -unTrans.y);
     //left
     unTrans = cloud(new PVector(-sizeTem,0), textTem, axiomTem, size/2, 3);
     translate(-unTrans.x, -unTrans.y);
     //right
     unTrans = cloud(new PVector(sizeTem,0), textTem, axiomTem, size/2, 4);
     translate(-unTrans.x, -unTrans.y);
   }
   return trans;
  }
  else{
    println(trans.x + " " + trans.y);
    return trans;
  }
}