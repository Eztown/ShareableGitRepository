BufferedReader reader;

ArrayList<String> verbs = new ArrayList<String>();
ArrayList<String> adjectives = new ArrayList<String>();
ArrayList<String> nouns = new ArrayList<String>();

String[] storyArray;
String story = "";

int spinner = -1, indexType = -1, indexLoc = -1;


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
  if(spinner==-1)
  text(story,0,0,width,height);
  else{
  spin();
  text(concater(storyArray),0,0,width,height);
  }
}

void keyPressed(){
 int[] response;
 spinner = 0;
 response = indexFind();
 indexLoc = response[0];
 indexType = response[1];
}

void mousePressed(){
 String temp = "";
 try{
  temp = reader.readLine(); 
 }
 catch(Exception e){
   
 }
 if(temp==null)
 reader = createReader("story.dat");
 else if(!temp.equals("")||!temp.equals(" ")){
   story = temp;
   storyArray = story.split(" ");
 }
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
    
void spin(){
   switch (indexType){
        case 1:
          //noun
          if(spinner<nouns.size()){
            storyArray[indexLoc] = nouns.get(spinner);
            spinner++;
          }
          else{
          spinner = -1;
          storyArray[indexLoc] = nouns.get((int)random(nouns.size()));
          story = concater(storyArray);
          }
          break;
          
          
        case 2:
          //adjective
          if(spinner<adjectives.size()){
            storyArray[indexLoc] = adjectives.get(spinner);
            spinner++;
          }
          else{
          spinner = -1;
          storyArray[indexLoc] = adjectives.get((int)random(adjectives.size()));
          story = concater(storyArray);
          }
          break;
          
          
        case 3:
          //verb
          if(spinner<verbs.size()){
            storyArray[indexLoc] = verbs.get(spinner);
            spinner++;
          }
          else{
          spinner = -1;
          storyArray[indexLoc] = verbs.get((int)random(verbs.size()));
          story = concater(storyArray);
          }
          break;
        }
}

int[] indexFind(){
  int[] index = new int[2];
  for(int a = 0; a<storyArray.length; a++)
  switch (storyArray[a].charAt(0)){
        case '#':
          //noun
          index[0]=a;
          index[1]=1;
          a=999;
          break;
        case '&':
          //adjective
          index[0]=a;
          index[1]=2;
          a=999;
          break;
        case '@':
          //verb
          index[0]=a;
          index[1]=3;
          a=999;
          break;
        }
  return index;
}

String concater(String[] moo){
   String returner = "";
   for(String s:moo)
     returner += s+" ";
   return returner;
}