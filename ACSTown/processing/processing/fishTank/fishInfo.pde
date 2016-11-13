class fishInfo{
  String fishName, fishType;
  BufferedReader reader;
  
  public fishInfo(){
     String[] names = loadStrings("names.dat");
     String[] type = loadStrings("types.dat");
     fishName = names[(int)random(0,names.length)];
     fishType = type[(int)random(0,type.length)];
  }
  
  String getName(){
    return fishName;
  }
  
  String getType(){
    return fishType;
  }
  
  void setName(String n){
    fishName = n;
  }
  
  void setType(String t){
    fishType = t;
  }
}