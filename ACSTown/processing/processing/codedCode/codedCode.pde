
int r,g,b;
String cipherString = "So let's test to see if this works. If it does. Great! If not Ehhh";
String binaryString;
int x=0,y=0;

void setup(){
  //size(200,200);
  fullScreen();
  r = (int)random(200,255);
  g = (int)random(200,255);
  b = (int)random(200,255);
  binaryString = AsciiBinarify(cipherString);
  println(binaryString);
  background(0);
}

void draw(){
  for(int a = 0; a<binaryString.length();a++){
   int rand = (int)random(1,3);
   int randWidth = (int)random(1,20);
   fill(r,g,b);
   noStroke();
   rect(x,y,randWidth,1);
   
   if(binaryString.charAt(a)=='1'){
   switch(rand){
     case(1):
       r+=1;
       g=(int)random(0,255);
       b=(int)random(0,255);
     case(2):
       r=(int)random(0,255);
       g+=1;
       b=(int)random(0,255);
     case(3):
       r=(int)random(0,255);
       g=(int)random(0,255);
       b+=1;
   }//end of switch
  }//end of if binary
  if(r>255){
  println("Yes. It happened");
  r=1;
  }
  if(g>255){
  g=1;
  println("Yes. It happened");
  }
  if(b>255){
  b=1;
  println("Yes. It happened");
  }
  x+=randWidth;
  if(x>=width){
   x=0;
   y+=1;
  }//end of if x
}//end of for
}//end of draw

String AsciiBinarify(String str){
  String binary = "",tempBinary = "";
  String[] wordArray = str.split("");
  int index;
  for(int a = 0; a<wordArray.length; a++){
    index = (int)wordArray[a].charAt(0);
    while(index!=0){
     tempBinary+=index%2;
     index=index/2;
    }
    binary+=tempBinary+" ";
  }
  return binary;
}