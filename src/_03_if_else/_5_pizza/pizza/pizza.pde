
void setup() {
    size(1000,1000);
    fill(#F5C207);
    ellipse(500,500,900,900);
    fill(#FF2F0A);
    ellipse(500,500,800,800);
    fill(#FFC60A);
    ellipse(500,500,700,700);
}
void draw() {
    PImage pepp = loadImage("pepperonit.png");
    pepp.resize(100, 100);
    if(mousePressed)  {
    image(pepp,200,700);
    image(pepp,300,230);
    image(pepp,700,170);
    image(pepp,300,600);
    image(pepp,600,300);
    image(pepp,576,799);
    image(pepp,498,411);
    image(pepp,891,429);
    image(pepp,142,250);
    image(pepp,511,232);
    image(pepp,528,349);
    image(pepp,414,213);
    image(pepp,633,244);
    PImage salami = loadImage("salamit.png");
    salami.resize(100,100);
    if(mousePressed)  {
      image(salami,500,500);
      image(salami,300,200);
      image(salami,700,352);
      image(salami,649,740);
      image(salami,395,597);
      image(salami,306,496);
      image(salami,400,677);
      image(salami,380,475);
      image(salami,446,313);
      image(salami,506,786);
      image(salami,600,452);
      image(salami,477,568);
      image(salami,321,421);
      image(salami,166,252);
    PImage broc = loadImage("broct.png");
    broc.resize(100,100);
    if(mousePressed)  {
      image(broc,256,523);
      image(broc,256,783);
      image(broc,786,420);
      image(broc,210,147);
      image(broc,780,573);
      image(broc,250,634);
    }
    PImage tomato = loadImage("tomatot.png");
    tomato.resize(150,150);
    if(mousePressed)  {
      image(tomato,350,760);
      image(tomato,485,628);
      image(tomato,269,386);
      image(tomato,260,352);
      image(tomato,379,377);
      image(tomato,263,235);
      image(tomato,252,637);
      image(tomato,263,253);
      image(tomato,377,352);
    }
    PImage mush = loadImage("mushroomt.png");
    mush.resize(100,100);
    if(mousePressed)  {
     image(mush,803,636); 
     image(mush,735,364);
     image(mush,538,523);
     image(mush,627,252);
     image(mush,292,522);
     image(mush,636,633);
     image(mush,623,777);
     image(mush,363,367);
     image(mush,633,273);
     image(mush,627,636);
     image(mush,637,673);
    }
}
}
}
