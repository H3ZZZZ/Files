public class DieselCar extends Car {
    private boolean hasParticleFilter;
    private int kmPrL;

    public boolean isHasParticleFilter() {
        return hasParticleFilter;
    }

    public void setHasParticleFilter(boolean hasParticleFilter) {
        this.hasParticleFilter = hasParticleFilter;
    }

    public int getKmPrL() {
        return kmPrL;
    }

    public void setKmPrL(int kmPrL) {
        this.kmPrL = kmPrL;
    }

    public DieselCar(int regNumber, String brand, String model, int year, int numberOfDoors, boolean hasParticleFilter, int kmPrL) {
        super(regNumber, brand, model, year, numberOfDoors);
        this.hasParticleFilter = hasParticleFilter;
        this.kmPrL = kmPrL;
    }

    @Override
    public String toString() {
            return "This diesel car is a "+getBrand() +" "+getModel();
    }

    @Override
    protected double calculateGreenVehicleTax() {
        int compensatoryTax;
        int dieselGreenVehicleTax;
        int particleFilterTax;
        int fullDieselTax;
        if (hasParticleFilter == false){
            particleFilterTax = 1000;
        }else {
            particleFilterTax = 0;
        }

        if (kmPrL < 5) {
            compensatoryTax = 15260;
        } else if (kmPrL >= 5 && kmPrL < 10) {
            compensatoryTax = 2770;
        } else if (kmPrL >= 10 && kmPrL < 15) {
            compensatoryTax = 1850;
        } else if (kmPrL >= 15 && kmPrL < 20) {
            compensatoryTax = 1390;
        } else if (kmPrL >= 20 && kmPrL < 50) {
            compensatoryTax = 130;
        } else {
            compensatoryTax = 0;
        }

        if(kmPrL < 5){
            dieselGreenVehicleTax = 10470;
        } else if( kmPrL >= 5 && kmPrL < 10){
            dieselGreenVehicleTax = 5500;
        } else if( kmPrL >= 10 && kmPrL < 15){
            dieselGreenVehicleTax = 2340;
        } else if( kmPrL >= 15 && kmPrL < 20){
            dieselGreenVehicleTax = 1050;
        } else if ( kmPrL >= 20 && kmPrL < 50){
            dieselGreenVehicleTax = 330;
        } else {
            dieselGreenVehicleTax = 0;
        }

        fullDieselTax = particleFilterTax + dieselGreenVehicleTax + compensatoryTax;

    return fullDieselTax;
    }
}
