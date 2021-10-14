public class Task2bcd {

  public static void main(String[] args) {
    System.out.println(totalSum(3,2));
    System.out.println(yolo("make me upper case"));
    // System.out.println(potato("these are small letters"))
  }
  // 2.b Write a function that receives to integers as parameters and returns the sum of them.
  public static int totalSum(int sum1, int sum2) {
    return (sum1+sum2);
  }
// 2.c Write a function that receives a string and returns it as uppercase.
  public static String yolo(String yoloToUpperCases) {
    yoloToUpperCases = yoloToUpperCases.toUpperCase();
    return yoloToUpperCases;
  }

// 2.d Write a function that receives a string and returns true if the first letter of the string is uppercase.
/* public static String potato(String isLetterUpperCase) {
  public static boolean upperCase = true;
  isLetterUpperCase = isLetterUpperCase.charAt(0);




  return isLetterUpperCase;
} */
}
