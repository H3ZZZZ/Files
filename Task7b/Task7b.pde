int input = -20;
int multiplier = 1;

if(input<0){
  multiplier = -1;
  input = input * -1;
}
for(int i =input; i >= 0 ;i--) {
  if(i*multiplier==6) {
    println("six");
  } else if(i==input/2) {
    println("HALF");
  } else {
  println(i*multiplier);
  }
}
