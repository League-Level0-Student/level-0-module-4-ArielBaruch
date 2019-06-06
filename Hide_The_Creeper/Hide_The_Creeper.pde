PImage creeper;     //at the top of your program
PImage minecraft;
void setup(){
  size(1000, 500); //in setup method
 minecraft = loadImage("minecraft.jpg");     //in setup method
minecraft.resize(1000, 500);          //in setup method
creeper=loadImage("creeper.png");     //in setup method
creeper.resize(50,50);          //in setup method
background(minecraft);
}
void draw(){
  background(minecraft);
  image(creeper, 40, 100);     //in draw method
if( isNear(mouseX, 60)  && isNear(mouseY, 120) ){
fill(0,255,0);
ellipse(mouseX,mouseY,50,50);}
  
  
 else{ fill(255,0,0);
ellipse(mouseX,mouseY,50,50);}




}
boolean isNear(int a, int b) {
if (abs(a - b) < 10)
     return true;
else
     return false;
}
