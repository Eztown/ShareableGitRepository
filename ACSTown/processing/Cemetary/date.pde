class Date {
  int day, year;
  String month;

  public Date(String m , int y, int d) {
    day = d;
    month = m;
    year = y;
  }
  int getDay() {
    return day;
  }
  String getMonth(){
    return month;
  }
  int getYear(){
    return year;
  }
  String toString(){
    return day + " " + month + " " + year;
  }
}