
//runs one at start
public void setup(){
  println("setup()");
  frameRate(1);
  
  size(600, 400);
  background(#FF27B4);
  
  //noStroke();
  stroke(255);
  strokeWeight(5);
  
  fill(#7AE3F7);
  //bottom left, top left, top right, bottom right(last 4 values)
  rect(200, 200, 100, 100, 0, 20, 204, 0);
  fill(#11F71A);
  rectMode(CENTER);
  rect(200, 200, 100, 100, 0, 20, 204, 0);
  
  triangle(0,0,0,height,width,height);
  
  fill(0);
  ellipse(100,100,25,100);
  
  noFill();
  arc(400,200,50,50, radians(180), radians(360));
  
  println("Hello");
}
public void draw(){
  println("hi");
}

public void someOtherMethod(){
  println("Good bye");
}
