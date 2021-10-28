import java.util.ArrayList;

public class Garage {
 ArrayList <Car> carGarage = new ArrayList<>();


 public void addCar(Car car){

  carGarage.add(car);
 }

 @Override
 public String toString() {
  return "The garage currently has the following cars: " + carGarage;
 }

 public double calculateTotalGreenTax(){
  double totalGreenTax = carGarage.size();
  for(Car e : carGarage){
   totalGreenTax += e.calculateGreenVehicleTax();

  }
  return totalGreenTax;
 }
}
