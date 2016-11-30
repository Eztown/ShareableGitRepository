class  person {


  String firstName, lastName, address;
  ArrayList<String> middleName;
  Date date;
  double lifeLength;


  public person() {
    firstName = "";
    lastName = "";
    middleName = new ArrayList<String>();
    date = null;
    lifeLength = 0;
  }


  public person(String first, String last, ArrayList<String> middle, Date d, double l, String street) {
    firstName = first;
    lastName = last.substring(0,1)+last.substring(1).toLowerCase();
    middleName = middle;
    date = d;
    lifeLength = l;
    address = street;
  }

  String getFirst() {
    return  firstName;
  }


  String getLast() {
    return  lastName;
  }


  ArrayList<String> getMiddle() {
    return middleName;
  }


  String getAddress() {
    return address;
  }


  String getMiddleString() {
    String middleNameS = "";
    for (String s : middleName)
      middleNameS += s+"";
    return middleNameS;
  }


  double getLifeLength() {
    return lifeLength;
  }


  String getStringDate() {
    return date.toString();
  }
  
  Date getDate(){
    return date;
  }
  
  String toString(){
    if(middleName.size()!=0)
    return firstName+" "+middleName.toString()+" "+lastName+" "+ lifeLength; 
    else
    return firstName+" "+lastName+" "+ lifeLength; 
  }
}