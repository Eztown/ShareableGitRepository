import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.*;

BufferedReader reader;
Analysis analysis;
int buttonSelected, size = 20;
int[] buttons = {0,size,size*2};

void settings(){
  size(1000,500);
}

void setup(){
  buttonSelected = 0;
  analysis = new Analysis(loadPeople());
}

void draw(){
  background(255);
  for(int a = 0; a<buttons.length; a++){
    if(a == buttonSelected)
    fill(0,0,255);
    else
    fill(255,0,0);
    rect(buttons[a],0,size,size);
  }
  analysis.drawGraph(buttonSelected);
}

void mousePressed(){
   for(int a = 0; a<buttons.length; a++){
      if(mouseX>buttons[a]&&mouseX<buttons[a]+size&&mouseY<size){
        buttonSelected = a;
        break;
      }
  } 
}

ArrayList<person> loadPeople(){
  ArrayList people = new ArrayList<person>();
  String[] lines = loadStrings("cemetery.txt");
  
  //person(String first, String last, ArrayList<String> middle, Date d, Double l, String street)
  for(int a = 5; a<lines.length; a++){
    
     //Set loaded string
     String temp = lines[a];
     
     //Set names
     String first = temp.substring(0,temp.indexOf(" "));
     temp = temp.substring(temp.indexOf(" ")+1);
     ArrayList<String> middle = new ArrayList<String>();
     while(((int)temp.charAt(2))>65 && 90<((int)temp.charAt(2))){
       middle.add(temp.substring(0,temp.indexOf(" ")));
       temp = temp.substring(temp.indexOf(" ")+1);
     }   
     String last = temp.substring(0,temp.indexOf(" "));
     
     //sets date
     temp = lines[a].substring(25);
     int day = Integer.parseInt(temp.substring(0,temp.indexOf(" ")));
     temp= temp.substring(temp.indexOf(" ") + 1);
     String m = temp.substring(0, temp.indexOf(" "));
     temp= temp.substring(temp.indexOf(" ") + 1);
     int y = Integer.parseInt(temp.substring(0,temp.indexOf(" ")));
     temp= temp.substring(temp.indexOf(" ") + 1);
     Date d = new Date(m , y, day);
     
     //sets age
     double age = Double.parseDouble(temp.substring(0,temp.indexOf(" ")));
     
     //sets streetName
     String street = lines[a].substring(42);
     
     people.add(new person(first, last, middle, d, age, street));
     
  }
  return people;
}