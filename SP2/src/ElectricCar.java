public class ElectricCar extends Car{
    private int batteryCapacitykWh;
    private int maxKm;
    private int whPrKm;

    public int getBatteryCapacitykWh() {
        return batteryCapacitykWh;
    }

    public void setBatteryCapacitykWh(int batteryCapacitykWh) {
        this.batteryCapacitykWh = batteryCapacitykWh;
    }

    public int getMaxKm() {
        return maxKm;
    }

    public void setMaxKm(int maxKm) {
        this.maxKm = maxKm;
    }

    public int getWhPrKm() {
        return whPrKm;
    }

    public void setWhPrKm(int whPrKm) {
        this.whPrKm = whPrKm;
    }

    public ElectricCar(int regNumber, String brand, String model, int year, int numberOfDoors, int batteryCapacitykWh, int maxKm, int whPrKm) {
        super(regNumber, brand, model, year, numberOfDoors);
        this.batteryCapacitykWh = batteryCapacitykWh;
        this.maxKm = maxKm;
        this.whPrKm = whPrKm;
    }

    @Override
    public String toString() {
        return "This electric car is a " + getBrand()+ " "+ getModel();
    }

    @Override
    protected double calculateGreenVehicleTax() {
        double electicGreenVehicleTax;
        double kmPrL;
        kmPrL = 100 / (this.whPrKm/91.25);

        if(kmPrL < 5){
            electicGreenVehicleTax = 10470;
        } else if( kmPrL >= 5 && kmPrL < 10){
            electicGreenVehicleTax = 5500;
        } else if( kmPrL >= 10 && kmPrL < 15){
            electicGreenVehicleTax = 2340;
        } else if( kmPrL >= 15 && kmPrL < 20){
            electicGreenVehicleTax = 1050;
        } else if ( kmPrL >= 20 && kmPrL < 50){
            electicGreenVehicleTax = 330;
        } else {
            electicGreenVehicleTax = 0;
        }
        return electicGreenVehicleTax;


    }
}
