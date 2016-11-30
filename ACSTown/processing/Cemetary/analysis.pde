class Analysis {

  ArrayList<person> people;
  SortedMap<String, ArrayList<String>> events;
  SortedMap<String, Integer> months;
  SortedMap<Integer, Integer> days;
  PVector span;
  float xDist, yDist, limX, limY;
  int imgWid, imgHei;
  PImage grave;
  String text;

  public Analysis() {
  }

  public Analysis(ArrayList<person> p) {
    people = p;
    text = "";
    limX = 100;
    limY = 75;
    span = new PVector(width-limX,height-limY);
    xDist = span.x-50;
    yDist = span.y-50;
    grave = loadImage("grave.png");
    grave.resize(10,10);
    imgWid = grave.width;
    imgHei = grave.height;
    events = null;
  }

  void drawGraph(int a) {
    switch(a) {
    case 0: 
      monthPlot();
      break;
    case 1: 
      dayPlot();
      break;
    case 2: 
      eventList();
      break;
    }
  }

  void monthPlot() {
    textSize(10);
    
    if(months == null)
      makeMonths(); 
    
    Set<String> keys = months.keySet();
    
    line(50,span.y,span.x,span.y);
    int max = findMaxMonths();
    float repValue = max/(yDist/imgHei);
    int pointDist = (int)xDist/months.size();
    text("Grave = "+repValue+" deaths",span.x,span.y,limX,limY);
    
    pushMatrix();
    int loc = 0;
    for(String s: keys){
      text(s,limX+(loc*pointDist)-(pointDist/2),span.y+20);
      
      for(int a = 0; a<months.get(s)/repValue; a++)
      image(grave,limX+(loc*pointDist)-(pointDist/2),span.y-imgHei*(a+1));
      
      loc++;
    }
    popMatrix();
  }
  
  int findMaxMonths(){
    Collection<Integer> values = months.values();
    int max = 0;
    for(int i:values)
    if(i>max)
      max = i;
    return max;
  }
  
  int findMaxDays(){
    Collection<Integer> values = days.values();
    int max = 0;
    for(int i:values)
    if(i>max)
      max = i;
    return max;
  }
  
  void makeMonths(){
   months = new TreeMap<String,Integer>();
   for(person p: people){
    String mon = p.getDate().getMonth();
    if(months.containsKey(mon))
      months.put(mon,months.get(mon)+1);
    else
      months.put(mon,1);
   }
  }

  void dayPlot() {
    textSize(10);
    
    if(days==null)
    makeDays();
    
    Set<Integer> keys = days.keySet();
    
    line(50,span.y,span.x,span.y);
    int max = findMaxDays();
    float repValue = max/(yDist/imgHei);
    int pointDist = (int)xDist/days.size();
    text("Grave = "+repValue+" deaths",span.x,span.y,limX,limY);
    
    pushMatrix();
    int loc = 0;
    for(Integer s: keys){
      text(s,limX+(loc*pointDist)-(pointDist/2)-20,span.y+20);
      
      for(int a = 0; a<days.get(s)/repValue; a++)
      image(grave,limX+(loc*pointDist)-(pointDist/2)-20,span.y-imgHei*(a+1));
      
      loc++;
    }
    popMatrix();
}
  
  void makeDays(){
   days = new TreeMap<Integer,Integer>();
   for(person p: people){
    int da = p.getDate().getDay();
    if(days.containsKey(da))
      days.put(da,days.get(da)+1);
    else
      days.put(da,1);
   }
  }

  void eventList() {
    if (events == null) {
      events = new TreeMap<String, ArrayList<String>>();
      for (person p : people) {
        String d = p.getStringDate();
        String ps = p.toString();
        if (events.containsKey(d))
          events.get(d).add(ps);
        else {
          events.put(d, new ArrayList<String>());
          events.get(d).add(ps);
        }
      }
      Set<String> keys  = events.keySet();
     for(String a: keys) {
      if(events.get(a).size()>=3)
      text += a+" "+events.get(a).toString()+"\n";
     }
    }
    
    textSize(20);
    text(text,20,50,width,height);
  }
}