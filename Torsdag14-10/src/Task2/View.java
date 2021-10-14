package Task2;

public class View {
    String MSG;
    String CURRENCY;
    public View(String MSG, String CURRENCY) {
        this.CURRENCY = CURRENCY;
        this.MSG = MSG;
    }

    public void doView(double result, String typeOfResult){
        System.out.printf("Du betaler %.2f%3s i %s%n",result,CURRENCY,MSG);
    }
}
