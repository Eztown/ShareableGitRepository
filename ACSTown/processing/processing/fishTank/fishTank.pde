ArrayList<fish> fishList = new ArrayList<fish>();

void setup(){
  size(500,500);
}

void draw(){
  background(0,100,255);
  for(fish a: fishList)
    a.drup();
}

void keyPressed(){
 fishList.add(new fish()); 
}