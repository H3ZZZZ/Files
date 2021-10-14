public class Datamatik {


public static void main(String[] args) {

  Teacher william = new Teacher("William", 30, false);
  Student frederik = new Student("Frederik", 25,false, " Team B");
  Student michael = new Student("Michael", 19, false, " Team B");
  System.out.println(william);
  System.out.println(frederik.name+frederik.datamatikerTeam);
  System.out.println(michael.name+michael.datamatikerTeam);
}

}
