public class PetrolCar extends Car{
    private int octaneNumber;
    private int kmPrL;

    public int getOctaneNumber() {
        return octaneNumber;
    }

    public void setOctaneNumber(int octaneNumber) {
        this.octaneNumber = octaneNumber;
    }

    public int getKmPrL() {
        return kmPrL;
    }

    public void setKmPrL(int kmPrL) {
        this.kmPrL = kmPrL;
    }

    public PetrolCar(int regNumber, String brand, String model, int year, int numberOfDoors, int octaneNumber, int kmPrL) {
        super(regNumber, brand, model, year, numberOfDoors);
        this.octaneNumber = octaneNumber;
        this.kmPrL = kmPrL;
    }

    @Override
    public String toString() {
        return "This petrol car is a " +getBrand() + " "+ getModel();
    }

    @Override
    protected double calculateGreenVehicleTax() {
        int petrolGreenVehicleTax;
        if(kmPrL < 5){
            petrolGreenVehicleTax = 10470;
        } else if( kmPrL >= 5 && kmPrL < 10){
            petrolGreenVehicleTax = 5500;
        } else if( kmPrL >= 10 && kmPrL < 15){
            petrolGreenVehicleTax = 2340;
        } else if( kmPrL >= 15 && kmPrL < 20){
            petrolGreenVehicleTax = 1050;
        } else if ( kmPrL >= 20 && kmPrL < 50){
            petrolGreenVehicleTax = 330;
        } else {
            petrolGreenVehicleTax = 0;
        }
        return petrolGreenVehicleTax;
    }
}
