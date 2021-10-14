public class Teacher {
  String name;
  int age;
  boolean isFemale;

  public Teacher(String name, int age, boolean isFemale) {
    this.name = name;
    this.age = age;
    this.isFemale = isFemale;
}
public String toString(){
  String temp = "";
  temp+=name;
  temp+=", " +age;
  temp+=", " +isFemale;
  return temp;
}
}
