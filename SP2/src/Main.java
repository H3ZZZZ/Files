public class Main {

    public static void main(String[] args) {
        //Car testbil = new DieselCar(2,"ford", "thobias", 1999,6,true,4);
        //System.out.println(testbil.calculateGreenVehicleTax());

        Garage garage = new Garage();
        Car petrolCar = new PetrolCar(11111, "Ford", "Mustang", 2021, 4, 95, 7);
        Car dieselCar = new DieselCar(22222, "Citroen", "C1", 2021, 2, true, 40);
        Car electricCar = new ElectricCar(33333, "Tesla", "Model 3", 2016, 4, 75, 580, 4000);
        garage.addCar(petrolCar);
        garage.addCar(dieselCar);
        garage.addCar(electricCar);
        System.out.println("This garage contains: ");
        for (Car e : garage.carGarage) {
            System.out.println(e.toString());
        }
        System.out.println("The total green tax for all cars in the garage is: " +garage.calculateTotalGreenTax()+ " kroner");

    }
}
