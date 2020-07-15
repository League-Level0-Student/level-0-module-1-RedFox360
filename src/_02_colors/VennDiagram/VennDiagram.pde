
void setup()  {
  size(1000,1000);
  fill(0, 255, 0, 100);
ellipse (540,585,300,300); 
fill(255,0,0,100);
ellipse (400,400,300,300);
fill(0,0,255,100);
ellipse (300,650,300,300);
 
}
void draw()  {
if(mousePressed)  {
  System.out.println("" + mouseX + ", " + mouseY + ""); 
}
}
