
void setup() {
size(600, 400); 
}
void draw() {
PImage face = loadImage("face.jpg");
face.resize(width, height);
image(face, 0, 0);
fill(232, 30, 212);
ellipse(265, 125, 80, 80);
ellipse(360, 140, 80, 80);
if(mouseX
}
