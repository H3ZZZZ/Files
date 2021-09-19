// Laver et rafflebære
class DiceCup {  
  ArrayList<Die> cup; // At lave en kop til terningerne
  ArrayList<Die> DiceList;

  // Konstruktøren
  DiceCup() {
    cup = new ArrayList<Die>();
    DiceList = new ArrayList<Die>();
  }
  // Tilføjer en terning til rafflebæret
  void addDie(Die die) {     
     cup.add(die);
    
  }
  // Metode for at ryste koppen
  public void shake() {
    for (Die die : cup) {
      die.roll();
    }
  }

  public void draw(int x, int y, int dieSize, int smoothCorners) {
    int xPos = x;
    for (Die die : cup) {
      die.draw(xPos, y, dieSize, smoothCorners);
      xPos += 1.5 * dieSize;
    }
  }
  
  // Opdeler alle terninger i seperate lister og tilføjer dem i sorteret rækkefølge
  public void sort() {
    ArrayList<Die> spot1 = new ArrayList<Die>();
    ArrayList<Die> spot2 = new ArrayList<Die>();
    ArrayList<Die> spot3 = new ArrayList<Die>();
    ArrayList<Die> spot4 = new ArrayList<Die>();
    ArrayList<Die> spot5 = new ArrayList<Die>();
    ArrayList<Die> spot6 = new ArrayList<Die>();
    
    for (Die die : cup) {
      if (die.eyes == 1) {
        spot1.add(die);
      }
      if (die.eyes==2) {
        spot2.add(die);
      }
      if (die.eyes==3) {
        spot3.add(die);
      }
      if (die.eyes==4) {
        spot4.add(die);
      }
      if (die.eyes==5) {
        spot5.add(die);
      }
      if (die.eyes==6) {
        spot6.add(die);
      }
    }
    DiceList.addAll(spot1);
    DiceList.addAll(spot2);
    DiceList.addAll(spot3);
    DiceList.addAll(spot4);
    DiceList.addAll(spot5);
    DiceList.addAll(spot6);    
  }
  /* Går igennem den sorterede liste af terninger og ændrer y-koordinatet
     hvis antallet af øjne er steget fra den forrige iteration */
  public void drawDiceLines(int x, int y, int dieSize, int smoothCorners) {
    
    int xPos = x;
    int yPos = y; 
    int currentDie = 1;    // 

    for (Die die : DiceList) {
      if (currentDie < die.eyes) {
        xPos = x;
        yPos += 1.5 * dieSize;
        die.draw(xPos, yPos, dieSize, smoothCorners);
        xPos += 1.5 * dieSize;  
      }
      else {
        die.draw(xPos, yPos, dieSize, smoothCorners);
        xPos += 1.5 * dieSize;
      }   
      currentDie = die.eyes;
    } 
    DiceList.clear();
  }
}
