void setup() {
  MethodTwo(); 
}

void MethodTwo() {
  int weekDay = 3; // 0 = Monday, 6 = Sunday. 
  boolean weekend = false;
  
  if (weekDay < 5) {
    weekend = false;
  } else {
    weekend = true;
  }
  

 
// Print the name of the weekday here: 
   
   if(weekDay == 0) {
      println("uhhh it's only monday");
} else if(weekDay == 1) {
      println("It's tuesdayyy");
} else if(weekDay == 2) {
      println("yooo it's wednesday");
} else if(weekDay == 3) {
      println("It's thursday, yes!");
} else if(weekDay == 4) {
      println("It's friday and time for a beer");
} else if(weekDay == 5) {
      println("It's Saturday");
} else if(weekDay == 6) {
      println("It's Sunday");
}
      
    
// Print if it is weekend here:
  
if(weekDay == 5 || weekDay == 6) {
  println("og det er weekend");
}
}
