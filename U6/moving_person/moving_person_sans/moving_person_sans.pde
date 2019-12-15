int xLoc, yLoc, size, wink, wheel;
PImage background;

public void setup() {
  //variable setup
  size (1024, 576);
  xLoc = 512;
  yLoc = 350;
  size = 200;
  ellipseMode(CENTER);
  rectMode(CENTER);
  background = loadImage ("undertale_background.png");

  //instructions
  println("\bMoving person\b");
  println("---------------------");
  println("Press left click to drag character\nScrool up to zoom in\nScrool down to zoom out\n"
    + "Use the arrow keys to move the character around\nPress enter to reset the character");
}

//getting mouse wheel input
void mouseWheel(MouseEvent event) {
  wheel = (int)event.getAmount();
}

public void draw() {
  drawBackground();
  drawCharacter();
  movements();
}

public void drawBackground() {
  background(background);
}

public void drawCharacter() {
  //head
  fill(255);
  ellipse(xLoc, yLoc, size, size);

  //left eyes
  stroke(0);
  strokeWeight(5);
  fill(#0358FF);
  ellipse(xLoc + size*.2, yLoc - size*.2, size*.25, size*.25);

  fill(0);
  ellipse(xLoc + size*.2, yLoc - size*.2, size*.05, size*.05);

  //right eye
  if (wink == 0) {
    noFill();
    stroke(0);
    strokeWeight(5);
    arc(xLoc - size*.2, yLoc - size*.15, size*.25, size*.25, radians(180), radians(360));
  } else {
    stroke(0);
    strokeWeight(5);
    fill(0);
    ellipse(xLoc - size*.2, yLoc - size*.2, size*.25, size*.25);

    fill(255);
    ellipse(xLoc - size*.2, yLoc - size*.2, size*.08, size*.08);
  }

  //mouth
  fill(255);
  strokeWeight(3);
  rect(xLoc, yLoc + size*.25, size*.45, size*.18, 10, 10, 10, 10); 

  line(xLoc, yLoc + size*.33, xLoc, yLoc + size*.17);
  line(xLoc - size*.15, yLoc + size*.33, xLoc - size*.15, yLoc + size*.17);
  line(xLoc + size*.15, yLoc + size*.33, xLoc + size*.15, yLoc + size*.17);
}

public void movements() {
  //wink every second
  wink = second() % 2;

  //controls
  //mouve left
  if (keyPressed && keyCode == LEFT) {
    xLoc = xLoc - 2;
  }
  //mouve right
  else if (keyPressed && keyCode == RIGHT) {
    xLoc = xLoc + 2;
  }
  //move up
  else if (keyPressed && keyCode == UP) {
    yLoc = yLoc - 2;
  }
  //move down
  else if (keyPressed && keyCode == DOWN) {
    yLoc = yLoc + 2;
  } 
  //zoom out
  else if (wheel > 0) {
    size = size - 10;
  }
  //zoom in
  else if (wheel < 0) {
    size = size + 10;
  }
  //draging the character
  else if (mousePressed && mouseButton == LEFT) {
    xLoc = mouseX;
    yLoc = mouseY;
  }

  //reseating the caracter
  else if (keyCode == ENTER) {
    xLoc = 512;
    yLoc = 350;
    size = 200;
  }
  //reseting mouse wheel
  wheel = 0;
}
