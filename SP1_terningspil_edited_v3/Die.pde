// Laver en terning

class Die {
  color eyeColor; // Farver terningens øjne
  color dieColor; // Farver ternings farve
  int eyes; // Giver et tilfældigt tal for antallet af øjne
  int roll; // Simulerer at terningekast
  int x; // x positionen for terningen
  int y; // y positionen for terningen
  int size = width/10; // Størrelsen på terningen
  int smoothCorners = 20; // Giver terningen smooth hjørner
  int draw; // Variablen der giver terningen et visuelt look
  int eyeSize; // Size of the eyes on the die

  // Giver terningen farve
  public Die(color eyeColor, color dieColor) { // konstruktører
    this.eyeColor = eyeColor;
    this.dieColor = dieColor;
  }

  public void roll() { // roll funktionen
    eyes = (int) random (1, 7);
  }

  public void draw(int x, int y, int size, int smoothCorners) { //display funktionen
    this.x = x;
    this.y = y;
    eyeSize = 8;
    rectMode(CENTER);
    fill(dieColor);
    rect(x, y, size, size, smoothCorners);
    fill(eyeColor);
    if (eyes==1) {
      circle(x, y, eyeSize);
    } else if (eyes==2) {
      circle(x+size*0.25, y+size*0.25, eyeSize);
      circle(x-size*0.25, y-size*0.25, eyeSize);
    } else if (eyes==3) {
      circle(x, y, eyeSize);
      circle(x-size*0.25, y-size*0.25, eyeSize);
      circle(x+size*0.25, y+size*0.25, eyeSize);
    } else if (eyes==4) {
      circle(x-size*0.25, y-size*0.25, eyeSize);
      circle(x+size*0.25, y+size*0.25, eyeSize);
      circle(x+size*0.25, y-size*0.25, eyeSize);
      circle(x-size*0.25, y+size*0.25, eyeSize);
    } else if (eyes==5) {
      circle(x-size*0.25, y-size*0.25, eyeSize);
      circle(x+size*0.25, y+size*0.25, eyeSize);
      circle(x+size*0.25, y-size*0.25, eyeSize);
      circle(x-size*0.25, y+size*0.25, eyeSize);
      circle(x, y, eyeSize);
    } else if (eyes==6) {
      circle(x-size*0.25, y-size*0.25, eyeSize);
      circle(x+size*0.25, y+size*0.25, eyeSize);
      circle(x+size*0.25, y-size*0.25, eyeSize);
      circle(x-size*0.25, y+size*0.25, eyeSize);
      circle(x-size*0.25, y, eyeSize);
      circle(x+size*0.25, y, eyeSize);
    }
  }
}
