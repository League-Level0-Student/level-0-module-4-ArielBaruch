boolean hi = false;
int speedy = 1;
int speedx = 2;
int x = 60;
int y= 60;
void setup(){
size(500,500);
}
void draw(){
boolean hi = intersects(x, y, mouseX, mouseY, 100);
  if(hi == true){
  speedy= -speedy;
  }
  background(0,0,250);
  ellipse(x, y, 30, 30); //in draw method
fill(50, 180, 50); //in draw method
stroke(60, 60, 60); //in draw method
x += speedx;
y += speedy;
if(x > width){
    speedx = -speedx;

}
if(y > height){
    speedy = -speedy;

}
if(y < 0){
speedy =  -speedy;
}
if(x < 0){
speedx = -speedx;
}

rect(mouseX, 450, 100, 20);

}

boolean intersects(int ballX, int ballY, int paddleX, int paddleY,
int paddleLength) {
    if (ballY > paddleY && ballX > paddleX && ballX < paddleX + paddleLength)
        return true;
    else
        return false;
}
