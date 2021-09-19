// Løste opgave A og B og inde i DiceCup har jeg lavet mit bedste forsøg på at løse C.

Die[] die = new Die[6];
DiceCup cup;

void setup() {
  size (475, 475);
  background(125);
  for(int i = 0; i < die.length; i++) {
   die[i] = new Die(0,255); 
  }

  cup = new DiceCup();
  
  for(int i = 0; i < die.length; i++) {
  cup.addDie(die[i]);
  }
  
  cup.shake();
}

void draw() {
  
}

void keyPressed() {
  // Opgave B
  if (key == 'p') {
    background(125);
    cup.draw(50, 50, 50, 10);
  }
  // Opgave C
  if(key == 's'){
    cup.shake();
    cup.sort();
    background(125);
    cup.drawDiceLines(50, 50, 50, 10);
  }
}
