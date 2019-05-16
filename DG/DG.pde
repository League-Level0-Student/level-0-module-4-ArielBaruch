 PImage hi;
 void setup(){
 size(1200,1000);
 hi = loadImage("d.jpeg");
 hi.resize(1200,1000);
 }
 
 void draw(){
 
 
    background(hi);
    
    fill(255, 0, 0);
   ellipse(mouseX,mouseY,40,40);
   
   fill(255, 0, 0);
   ellipse(245,180,40,40);
   
   fill(255, 0, 0);
   ellipse(195,180,40,40);
   
   fill(255, 0, 0);
   ellipse(610,183,55,55);
   
   fill(255, 0, 0);
   ellipse(555,183,55,55);
   
    fill(255, 0, 0);
   ellipse(1000,180,50,50);
 }
   
   
   
