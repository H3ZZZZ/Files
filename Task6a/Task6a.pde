int a;
int b;

a = (int)random(0,11);
b = (int)random(0,11);


if(a==10 || b==10 || a+b== 10) {
  println("a er "+a+" og b er "+b+" så det er en Success");
} else { 
  println("a er "+a+" og b er "+b+" så det er Failure");
}
