
void setup() {
size(600, 400); 
}
void draw() {
PImage face = loadImage("face.jpg");
face.resize(width, height);
image(face, 0, 0);
//could have made the size 225, 225 so
//when you go into the bottom right corner it doesn't just stay white but then its to small
fill(0+mouseX,0+mouseY, 0+mouseX);
ellipse(265, 125, 80, 80);
ellipse(360, 140, 80, 80);
fill(0,0,0); 
ellipse(265, 140, 50, 50); 
ellipse(360, 155, 50, 50); 
}
