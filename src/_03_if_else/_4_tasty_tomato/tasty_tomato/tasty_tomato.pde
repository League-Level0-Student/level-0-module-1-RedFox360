void setup() {
    size(360, 400);
}
void draw() {
    background(#FFFFFF);

    noStroke();
    fill(#FC5E5E);
    ellipse(150, 200, 150, 150);
    ellipse(212, 200, 150, 150);
    fill(#06C113);
    rect(176, 103, 12, 32);
    if(mousePressed)  {
    System.out.println("" + mouseX + ", " + mouseY + "");
    fill(#FFFFFF);
    ellipse(78,194,50,50);
    
    }
}
