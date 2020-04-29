package discount;

public class Liquidation implements Deduction {
    @Override
    public double getBillAmount(double billAmount) {
        double afterDisc = billAmount - (billAmount * 0.75);
        return afterDisc;
    }
}
