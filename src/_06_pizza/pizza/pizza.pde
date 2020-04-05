import ddf.minim.*;    
Minim minim;    
AudioPlayer sound;
void setup() {
    size(400, 600);
    fill(#CBA517);
    ellipse(200, 387, 325, 150); 
    fill(225, 0, 0); 
    ellipse(200, 387, 300, 125);
    fill(#F2EB14); 
    ellipse(200, 387, 275, 100);
     minim = new Minim(this);     
sound = minim.loadFile("hi.wav");  
}
void draw() {
    PImage salt = loadImage("Unknown.jpg");
    salt.resize(20, 20); 
image(salt, 140, 384); 
image(salt, 150, 364); 
image(salt, 160, 344); 
image(salt, 173, 364);
image(salt, 183, 384);
if(mousePressed) {
sound.play();
sound.rewind();
  image(salt, mouseX-10, mouseY-10); 
}
}
