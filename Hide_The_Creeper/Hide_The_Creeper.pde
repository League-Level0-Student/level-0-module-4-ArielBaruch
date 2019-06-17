PImage creeper2;
PImage creeper1;
PImage creeper;     //at the top of your program
PImage minecraft;
void setup(){
  size(1000, 500); //in setup method
 minecraft = loadImage("minecraft.jpg");     //in setup method

  minecraft.resize(1000, 500);          //in setup method

  creeper=loadImage("creeper.png");     //in setup method

  creeper.resize(1,1);          //in setup method

  creeper1=loadImage("creeper.png");     //in setup method

  creeper1.resize(1,1);          //in setup method

  creeper2=loadImage("creeper.png");     //in setup method

  creeper2.resize(1,1);          //in setup method

  background(minecraft);
}
  void draw(){
  background(minecraft);
  image(creeper, 478, 440);     //in draw method
  if(mousePressed && isNear(mouseX, 478)  && isNear(mouseY, 440)) {
  fill(0,255,0);
  ellipse(mouseX,mouseY,10,10);

}
  
  
 else{ 
   
fill(255,0,0);

ellipse(mouseX,mouseY,7,7);

}
image(creeper1, 993, 487);     //in draw method
if(mousePressed && isNear(mouseX, 993)  && isNear(mouseY, 487)) {
fill(0,255,0);
ellipse(mouseX,mouseY,10,10);

}
image(creeper2, 855, 465);     //in draw method
if(mousePressed && isNear(mouseX, 855)  && isNear(mouseY, 465)) {
fill(0,255,0);
ellipse(mouseX,mouseY,10,10);}
  
}




boolean isNear(int a, int b) {
if (abs(a - b) < 10)
     return true;
else
     return false;
}
