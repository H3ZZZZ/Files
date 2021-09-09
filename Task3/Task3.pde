//3.a
boolean redLight = true;
int r = 255;
int g = 255;
int b = 255;
int bg = 255;
int slukket = 75;
int diam = 100;
int farve = 1;

void setup() {
  size(400,600);
  smooth();
  background(bg);
}

void draw() {
  delay(1000);
  rectMode(CENTER);
  fill(50);
  rect(width/2,height/2,200,500);
 
 // rød
  if(farve == 1) {
    fill(r,0,0);
    circle(width/2,height/4,diam); 
    fill(slukket); 
    circle(width/2,height/2,diam);
    fill(slukket);
    circle(width/2,height/4*3,diam);
  }
  //rød og gul
  if(farve == 2){
    fill(r,0,0);
    circle(width/2,height/4,diam);
    fill(r,g,0);
    circle(width/2,height/2,diam);
    fill(slukket);
    circle(width/2,height/4*3,diam);
  }
  // grøn
  if(farve==3){
    fill(0,g,0);
    circle(width/2,height/4*3,diam);
    fill(slukket);
    circle(width/2,height/2,diam);
    fill(slukket);
    circle(width/2,height/4,diam);
    
  }
  //gul
  if(farve == 4){
    fill(r,g,0);
    circle(width/2,height/2,diam);
    fill(slukket);
    circle(width/2,height/4,diam);
    fill(slukket);
    circle(width/2,height/4*3,diam);
    
    
  }
  farve ++;
  
  if(farve > 4) {
    farve = 1;
  }
  
}


  


  
