public class Task4 {


  boolean[] booleanArray = new boolean[3];

  public static void main(String[] args) {

  String[] stringArray = {"Jesper", "Peter", "Hans"};
  for(String i : stringArray) {
    System.out.println(i);
  }
  int[] intArray = {6,4,8};
  int sum = 0;
  for(int i : intArray) {
    sum=sum+i;
  }
  System.out.println("Her er summen "+sum);
  System.out.println("Her er gennemsnittet " +sum/intArray.length);
}

}
