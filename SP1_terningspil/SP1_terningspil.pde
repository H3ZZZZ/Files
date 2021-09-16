// Løste opgave A og B og inde i DiceCup har jeg lavet mit bedste forsøg på at løse C.

Die die1, die2, die3, die4, die5, die6;
DiceCup cup;

void setup() {
  size (475, 475);
  background(125);
  die1 = new Die(0, 255);
  die2 = new Die(0, 255);
  die3 = new Die(0, 255);
  die4 = new Die(0, 255);
  die5 = new Die(0, 255);
  die6 = new Die(0, 255);
  cup = new DiceCup();
  cup.addDie(die1);
  cup.addDie(die2);
  cup.addDie(die3);
  cup.addDie(die4);
  cup.addDie(die5);
  cup.addDie(die6);
  cup.shake();
}

void draw() {
  cup.draw(50, 50, 50, 10);
}

void keyPressed() {
  cup.shake();
  
  if(key == 's'){
  cup.sort();
  }
}
