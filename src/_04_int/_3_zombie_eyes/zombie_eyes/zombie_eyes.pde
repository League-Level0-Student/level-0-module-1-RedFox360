
void setup() {
size(600,800);
PImage face = loadImage("zombie.png");

}
void draw() {
  PImage face = loadImage("zombie.png");
face.resize(600,800);
image(face,0,0);
if(mousePressed)  {
System.out.println("" + mouseX + ", " + mouseY + "");
}
if(mouseX>=300)  {
fill(#B92EFF);
}
if(mouseX<300)  {
fill(#FA1277);
}
ellipse(180,256,120,120);
ellipse(414,237,120,120);
fill(1,1,1);
ellipse(180,256,30,30);
ellipse(414,237,30,30);


}
