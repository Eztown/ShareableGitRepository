class ball {

  PVector location, horiz;
  float x, y, angle, magnitude;
  boolean active;
  color colr;
  boolean vectorDraw;

  public ball() {
    location = new PVector(8, height-28);
    horiz = new PVector(1, height-20);
    active = true;
    colr = color((int)random(0, 255), (int)random(0, 255), (int)random(0, 255));
    x = 0;
    y = 0;
    vectorDraw = false;
  }

  public ball(boolean a) {
    location = new PVector(8, height-28);
    horiz = new PVector(1, height-20);
    active = true;
    colr = color((int)random(0, 255), (int)random(0, 255), (int)random(0, 255));
    x = 0;
    y = 0;
    vectorDraw = a;
  }

  void ballDraw() {
    fill(colr);
    ellipse(location.x, location.y, 16, 16);
    location.x += x;
    location.y += y;
    if (vectorDraw) {
      line(location.x, location.y, location.x+x, location.y);
      line(location.x, location.y, location.x, location.y+y);
    }
    if (y!=0)
      y+=10;
    if (location.y+8>=height-20) {
      fill(colr);
      ellipse(location.x, height-28, 16, 16);
      active = false;
      location.y = height-28;
      x=0;
      y=0;
    }
  }

  void ballMove() {
    if (location.y+8+y>=height-20&&x!=0&&y!=0) {
      for (float a = 0; a<y; a++) {
        if (location.y+8+a>=height-20) {
          location.x+=(a/y)*x;
          fill(colr);
          ellipse(location.x, height-28, 16, 16);
          active = false;
          x=0;
          y=0;
          a=-1;
        }
      }
    } else {
      location.y+=y;
      location.x+=x;
      fill(colr);
      ellipse(location.x, location.y, 16, 16);
      if (y!=0)
        y+=10;
    }
    if (vectorDraw) {
      line(location.x, location.y, location.x+x, location.y);
      line(location.x, location.y, location.x, location.y+y);
    }
  }

  void ballLaunch(PVector dir) {
    angle = PVector.angleBetween(horiz, dir)-radians(90);
    magnitude = dir.mag();
    y = -magnitude*sin(angle);
    if (mouseX<location.x)
      x = -magnitude*cos(angle);
    else
      x = magnitude*cos(angle);
  }

  PVector getLoc() {
    return location;
  }

  boolean getActive() {
    return active;
  }

  float getAngle() {
    return degrees(angle);
  }
}