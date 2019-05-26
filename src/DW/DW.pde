PImage d;
PImage tail;


void setup(){
size(763,330); 
  d = loadImage("d.jpg");      //change the file name if you need to
tail = loadImage("tail.png");      //change the file name if you need to
  d.resize(763,330);
  tail.resize(105,105);
 

}
void draw(){
 background(d);
  rect(635, 100, 30, 30);
  if(mousePressed){
  image(tail, mouseX, mouseY);
  }
fill(255,55,55);

}
