//exaple idea
int xLoc, yLoc, size;

public void setup(){
  size(600, 400);
  
}

public void draw(){
  background(123, 155, 155);
  
  //body
  fill(255, 0, 0);
  rect(xLoc, yLoc, size*0.6, size);
  
  //head
  fill(255, 255, 0);
  ellipse(xLoc, yLoc - size*0.5 - size*60, size*.6, size*.6);
  
  //leg
  fill(255, 0, 255);
  rect(xLoc - size*.6/2 + size*28/2, yLoc + size, 28, size);
  rect(xLoc - size*.6/2 - size*28/2, yLoc + size, 28, size);
  
  xLoc = xLoc + 10;
  size = size -2;
}
  
