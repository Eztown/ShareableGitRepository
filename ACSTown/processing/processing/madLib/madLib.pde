BufferedReader reader;

ArrayList<String> verbs = new ArrayList<String>();
ArrayList<String> adjectives = new ArrayList<String>();
ArrayList<String> nouns = new ArrayList<String>();

String[] storyArray;
String story;


void setup(){
  size(500,500);
  try{
  loadVerbs();
  loadAdjectives();
  loadNouns();
  loadStory();
  }
  catch(Exception e){
    println("ERRRRROR");
  }
}

void draw(){
  background(0);
  fill(255);
  textSize((width+height)/20);
  text(story,0,0,width,height);
}

void keyPressed(){
 increLib();
}

void mousePressed(){
 String temp = "";
 try{
  temp = reader.readLine(); 
 }
 catch(Exception e){
   
 }
 if(temp!=null)
 if(!temp.equals("")||!temp.equals(" "))
   story = temp;
}

void loadVerbs() throws Exception{
  String line;
  reader = createReader("verbs.dat");
  while(true){
    line = reader.readLine();
    if(line.equals(" ")||line.equals(""))
      break;
     else
       verbs.add(line);
  }
}

void loadAdjectives() throws Exception{
  String line;
  reader = createReader("adjectives.dat");
  while(true){
    line = reader.readLine();
    if(line.equals(" ")||line.equals(""))
      break;
     else
       adjectives.add(line);
  }
}

void loadNouns() throws Exception{
  String line;
  reader = createReader("nouns.dat");
  while(true){
    line = reader.readLine();
    if(line.equals(" ")||line.equals(""))
      break;
     else
       nouns.add(line);
  }
}
  
void loadStory() throws Exception{
  reader = createReader("story.dat");
  story = reader.readLine();
  storyArray = story.split(" ");
  }
    
void increLib(){
  for(int a = 0; a<story.length(); a++)
      switch (story.charAt(a)){
        case '#':
          //noun
          story = story.substring(0, a) + nouns.get((int)random(nouns.size())) + story.substring(a+1);
          a = 9999;
          break;
        case '&':
          //adjective
          story = story.substring(0, a) + adjectives.get((int)random(adjectives.size())) + story.substring(a+1);
          a = 9999;
          break;
        case '@':
          //verb
          story = story.substring(0, a) + verbs.get((int)random(verbs.size())) + story.substring(a+1);
          a = 9999;
          break;
      }
    }