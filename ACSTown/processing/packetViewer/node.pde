class node {

  PVector loc;
  ArrayList<link> links = new ArrayList<link>();
  String name, ip;
  
  public node(){}

  public node(String nam, String i, PVector location) {
    loc = new PVector(location.x,location.y);
    name = nam;
    ip = i;
  }

  void addNode(node n, float time) {
    if (links.size()!=0) {
      float rote = 360/(links.size()+1);
      int offset = (int)random(0,rote/2);
      links.add(new link(loc, new PVector(0, time), n));
      for (int a = 0; a<links.size(); a++) {
        links.get(a).setAngle(radians((rote*a)+offset));
      }
    } else {
      links.add(new link(loc, new PVector(0, time), n));
    }
  }

  void drawNode() {
    fill(0, 0, 150);
    ellipse(loc.x, loc.y, 10, 10);
    
    fill(255,0,0);
    if(set[0]==1)
    text(name, loc.x, loc.y);
    if(set[0]==2)
    text(ip, loc.x, loc.y+20);
    if(set[0]==3)
    text(name + " " + ip, loc.x, loc.y+20);
    
    for (link l : links)
      l.drawLink();
  }
  
  PVector getLoc(){
    return loc;
  }

  void setLoc(PVector Nloc) {
    loc = Nloc;
  }
}