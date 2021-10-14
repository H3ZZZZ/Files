package Task2;

public class Controller extends ComputeVAT {
    Dialog dialog = new Dialog();
    CalculateVat calculateVat = new CalculateVat(PRCVAT);
    View view = new View(MSG,CURRENCY);


    public void runController() {
        double userIn = dialog.doDiag();
        double moms = calculateVat.doVAT(userIn);
        view.doView(moms,MSG);
    }
}
