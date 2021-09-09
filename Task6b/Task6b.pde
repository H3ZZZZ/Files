int x;
int y;
int z;

x = (int)random(1,15);
y = (int)random(1,15);
z = (int)random(1,15);


if(x+y+z==30 && x != 10 && x != 20 && x != 30 && y != 10 && y != 20 && y != 30 && z != 10 && z != 20 && z != 30) {
  println("x er "+x+" og y er "+y+" og z er "+z+" så det er en Success");
} else { 
  println("x er "+x+" og y er "+y+" og z er "+z+" så det er Failure");
}
