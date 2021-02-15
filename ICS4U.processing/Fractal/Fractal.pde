//Variables //<>// //<>// //<>// //<>// //<>//
float weight = 3;
color random, back = 255;
float x, y, size, high, wide;
float strechY, strechX, x1, y1;
int red, green, blue;

void setup() {
  //setup screen and variables
  size(800, 800);
  frameRate(1);
  fill(0);
  rectMode(CENTER);
  ellipseMode(CENTER);
  x = width/2;
  y = height/2;
  wide = width/4;
  high = width/4;
}

void draw() {
  //change background and shape drawing periodically
  background(back);
  createDrawing(x, y, wide, high, weight);
}


void createDrawing(float x, float y, float wide, float high, float weight) {
  //setup stroke
  strokeWeight(weight);
  stroke(randomColor());

  //chose the shape
  switch (randomNum()) {
    //draw a rectangle
  case 1:
    rect(x, y, wide, high);
    break;
    //draw an ellipse
  default:
    ellipse(x, y, wide, high);
    break;
  }

  if (weight > 1) {
    //LEFT SIDE
    createDrawing(x + wide/2 + wide/4, y, wide/2, high/2, weight - .5);
    //RIGHT SIDE
    createDrawing(x - wide/2 - wide/4, y, wide/2, high/2, weight - .5);
    //DOWN
    createDrawing(x, y + high/2 + high/4, wide/2, high/2, weight - .5);
    //UP
    createDrawing(x, y - high/2 - high/4, wide/2, high/2, weight - .5);
  }
}

//generate random number to chose shape randomly
int randomNum() {
  return (int) (Math.random() * 2);
}

//generate random color for color shape outline
color randomColor() {
  red = (int) (Math.random() * 255);
  green = (int) (Math.random() * 255);
  blue = (int) (Math.random() * 255);
  random = color(red, green, blue);
  return random;
}
