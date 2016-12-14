class link{
  
  PVector loc, dir, end;
  node endNode;
  
  public link(PVector l, PVector d, node n){
    loc = new PVector(l.x,l.y);
    dir = d;
    endNode = n;
    endNode.setLoc(endNode.getLoc().add(dir).add(l));
    end = new PVector(0,0).add(endNode.getLoc());
  }
  
  void drawLink(){
     fill(0);
     line(loc.x,loc.y,end.x,end.y); 
     if(endNode!=null)
       endNode.drawNode();
  }
  
  void setloc(PVector s){
    loc = s;
  }
  
  void setDist(float dist){
    dir.setMag(dist);
  }
  
  void setDir(PVector d){
    dir = d;
  }
  
  node getEndNode(){
   return endNode; 
  }
  
  void setAngle(float ang){
    dir = PVector.fromAngle(ang).setMag(dir.mag());
    endNode.setLoc(PVector.add(loc,dir));
    end = endNode.getLoc();
  }
}