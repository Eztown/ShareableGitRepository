ball ball;
PVector dir, cen;
boolean mode = true, vectord = true;
String text = "";

void setup() {
  //size(1400, 500);
  fullScreen();
  ellipseMode(CENTER);
  ball = new ball(vectord);
  background(255);
  fill(0);
  rect(0, height-20, width, height-20);
}

void draw() {
  if (mode) {
    background(255);
    fill(0);
    rect(0, height-20, width, height-20);
    textSize(20);
    text(text, 20, 20);
    ball.ballDraw();
  } else
    ball.ballMove();

  dir = new PVector(mouseX, mouseY);
  cen = ball.getLoc();
  dir.sub(cen);
  if (mode) {
    translate(cen.x, cen.y);
    line(0, 0, dir.x, dir.y);
  }
  if (!mode && !ball.getActive())
    ball = new ball(vectord);
}

void mousePressed() {
  if (mode) {
    ball.ballLaunch(dir);
    text = "Launched at "+dir.mag()+" pixels per frame at "+ball.getAngle()+" degrees";
  } else
    ball.ballLaunch(dir.setMag(100));
}

void keyPressed() {
  if (key=='r'||key=='R') {
    background(255);
    fill(0);
    rect(0, height-20, width, height-20);
  } else
    ball = new ball(vectord);
}