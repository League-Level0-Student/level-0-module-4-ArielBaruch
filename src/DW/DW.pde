import ddf.minim.*;          //at the very top of your sketch
AudioSample chunga;          //at the top of your sketch
boolean playSound = true;          //at the top of your sketch


PImage d;
PImage tail;
int x;
int y;

void setup(){
size(763,330); 
  Minim minim = new Minim(this);     //In the setup method
chunga = minim.loadSample("chunga.mp3");     //In setup. Change the file name if you need to

  d = loadImage("d.jpg");      //change the file name if you need to
tail = loadImage("tail.png");      //change the file name if you need to
  d.resize(763,330);
  tail.resize(105,105);
 

}
void draw(){
 if(dist(0, 0, mouseX, mouseY) < 30){
background(d);
}
else{
background(255,255,255);
}
  
  
  rect(0,0,30,30);
  //if(mousePressed){
   
  image(tail,x,y);
  if(mousePressed){
  if(dist(635, 100, mouseX, mouseY) < 30){
      x=650;
      y=115;
if (playSound) {
     chunga.trigger();
     playSound = false;
}  
}
  else{
  x = mouseX; 
  y = mouseY;
  }
  }

fill(255,55,55);
 
  }
