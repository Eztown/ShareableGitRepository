class player{
  PVector loc;
  int playerNum, paddleSize;
  
  
  public player(int playerN){
    paddleSize = 75;
    if(playerN == 0)
    loc = new PVector(20,height/2-paddleSize/2);
    else
    loc = new PVector(width-20,height/2-paddleSize/2);
    playerNum = playerN;
  }
  
  void go(){
   fill(255);
   rect(loc.x, loc.y, 5, paddleSize);
  }
  
  void up(){
   loc.sub(0,3); 
  }
  
  void down(){
    loc.add(0,3);
  }
  
  PVector getLoc(){
   return loc; 
  }
  
  int getSize(){
   return paddleSize; 
  }
}