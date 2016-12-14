import java.io.BufferedReader;
import java.io.InputStreamReader;

node cen;
String global = "";
final int[] set = {1};
//0 - no display, 1 - name, 2 - ip, 3 - name and ip

void setup(){
  size(500,500);
  //system.start();
  cen = makeHome();
  textAlign(0,TOP);
}

void draw(){
  background(255);
  cen.drawNode();
  fill(0);
  text(global,10,10);
}

void keyPressed(){
  if(keyCode == ENTER){
    thread("ping");
  }
  else if(keyCode == BACKSPACE){
    if(global.length()<1);
    else if(global.length()==1)
    global = "";
    else
    global = global.substring(0,global.length()-1);
  }
  else if(keyCode>=21&&keyCode<=126)
    global+=key;
}

void ping(){
     String command = global;
     global = "";
     StringBuffer output= new StringBuffer();
     String results = "";
     Process p;
  try {
      p = Runtime.getRuntime().exec("ping -n 8 "+command);
      p.waitFor();
      BufferedReader reader =new BufferedReader(new InputStreamReader(p.getInputStream()));

      String line = "";
      while ((line = reader.readLine())!= null)
        output.append(line + "\n");
    } 
    catch (Exception e) {
      e.printStackTrace();
    }
    results = output.toString();
    results = results.substring(results.indexOf("statistics"));
    println(results);
    String name = "", ip = "";
    float dist;
    name = command;
    ip = results.substring(results.indexOf("r")+2,results.indexOf(':'));
    dist = Float.parseFloat(results.substring(results.indexOf("Average")+10,results.lastIndexOf("ms")))*2;
    cen.addNode(new node(name,ip,new PVector()),dist);
}

node makeHome(){
  String systemName = "ERRRR", ip  = "IPERRRR";
  StringBuffer output= new StringBuffer();
  Process p;
  try {
      p = Runtime.getRuntime().exec("hostname");
      p.waitFor();
      BufferedReader reader =new BufferedReader(new InputStreamReader(p.getInputStream()));

      String line = "";
      while ((line = reader.readLine())!= null)
        output.append(line + "\n");
        
      systemName = output.toString();
      
      output = new StringBuffer();
        
      p = Runtime.getRuntime().exec("ipconfig");
      p.waitFor();
      reader =new BufferedReader(new InputStreamReader(p.getInputStream()));

      line = "";
      while ((line = reader.readLine())!= null)
        output.append(line + "\n");
        
      String temp = output.toString();
      temp = temp.substring(temp.indexOf("IPv4 Address"));
      temp = temp.substring(temp.indexOf(":")+1);
      temp = temp.substring(0,temp.indexOf("S"));
      ip = temp = temp.substring(temp.indexOf(":")+1);
    } 
    catch (Exception e) {
      e.printStackTrace();
    }
  return new node(systemName, ip, new PVector(width/2,height/2));
}